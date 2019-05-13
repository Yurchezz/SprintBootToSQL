package ua.lviv.iot.rest;

public class GoodNotFoundException extends RuntimeException {
    public GoodNotFoundException(Long id) {
        super("Could not fix good " + id);
    }
}
