package ua.lviv.iot.springBoot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ua.lviv.iot.managers.GoodRepository;
import ua.lviv.iot.models.MacBook;
import ua.lviv.iot.models.Good;

@EnableJpaRepositories(basePackages = {"ua.lviv.iot.managers"})
@SpringBootApplication
public class GoodSpringBootToSQL {

    public static void main(String[] args) {
        SpringApplication.run(GoodSpringBootToSQL.class, args);
    }

    @Bean
    public CommandLineRunner demo(GoodRepository repository) {
        return (args) -> {
            repository.save(new MacBook("ProRetina13", 10000, 10,2020,null));
            repository.save(new MacBook("ProRetina15", 20000, 16,2021,null));


            repository.findAll().forEach(System.out::println);
        };
    }
}
