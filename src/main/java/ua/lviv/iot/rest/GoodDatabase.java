package ua.lviv.iot.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class GoodDatabase {

    @Bean
    CommandLineRunner initDatabase(GoodRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(
                    new MacBook(
                            "MacBookPro15",
                            20000,
                            15,
                            2021)));
            log.info("Preloading " + repository.save(
                    new MacBook(
                            "MacBookAir13",
                            19999,
                            13,
                            2020)));
        };
    }

}
