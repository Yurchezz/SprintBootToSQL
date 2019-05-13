package ua.lviv.iot.rest;


import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@RestController
public class GoodController {

    private final GoodRepository repository;
    private final GoodResourceAssembler assembler;

    public GoodController(GoodRepository repository, GoodResourceAssembler assembler) {
        this.repository = repository;
        this.assembler = assembler;
    }
    @PostMapping("/goods")
    public Good newGood(@RequestBody MacBook newGood) {
        return repository.save(newGood);
    }

    @GetMapping("/goods/{id}")
    public Resource<Good> getOne(@PathVariable Long id) {

        Good good = repository.findById(id)
            .orElseThrow(() -> new GoodNotFoundException(id));

    return assembler.toResource(good);
}


    @PutMapping("/goods/{id}")
    public Good replaceGood(@RequestBody MacBook newGood, @PathVariable Long id) {

        return repository.findById(id)
                .map(good -> {
                    good.setName(newGood.getName());
                    good.setPrice(newGood.getPrice());
                    return repository.save(good);
                }).orElseGet(() -> {
                    newGood.setId(id);
                    return repository.save(newGood);
                });

    }

    @DeleteMapping("/goods/{id}")
    public void deleteGood(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @GetMapping("/goods")
    public Resources<Resource<Good>> getAll(){
        List<Resource<Good>> goods = repository.findAll().stream()
                .map(assembler::toResource)
                .collect(Collectors.toList());

        return new Resources<>(goods,
                linkTo(methodOn(GoodController.class).getAll()).withSelfRel());
    }
}
