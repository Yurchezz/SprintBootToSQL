package ua.lviv.iot.models;

public class Housewife extends Client {

    private HouseWifePreferences houseWifePreferences;

    public Housewife(final String name,
                     final Location home,
                     final int cash) {

        super(name, home, cash);
    }
}