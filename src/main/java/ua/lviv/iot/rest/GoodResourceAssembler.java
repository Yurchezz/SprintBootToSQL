package ua.lviv.iot.rest;

import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@Component
public class GoodResourceAssembler implements ResourceAssembler<Good, Resource<Good>> {

    @Override
    public Resource<Good> toResource(Good good){
        return new Resource<>(good,
                linkTo(methodOn(GoodController.class).getOne(good.getId())).withSelfRel(),
                linkTo(methodOn(GoodController.class).getAll()).withRel("goods"));
    }
}
