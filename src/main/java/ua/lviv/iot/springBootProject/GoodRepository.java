package ua.lviv.iot.springBootProject;

import org.springframework.data.repository.CrudRepository;

public interface GoodRepository
        extends CrudRepository<Good, Integer> {
   Good findByName(String name);
}
