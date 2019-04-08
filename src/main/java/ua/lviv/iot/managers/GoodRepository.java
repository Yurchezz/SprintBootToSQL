package ua.lviv.iot.managers;

import org.springframework.data.repository.CrudRepository;
import ua.lviv.iot.models.Good;

public interface GoodRepository
        extends CrudRepository<Good, Integer> {
}
