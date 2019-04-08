package ua.lviv.iot.models;

import java.util.Date;

public class BusDelivery extends Delivery {
    private Location startStorage;
    private Location finalStorage;
    private Bus bus;

    public BusDelivery(final String name,
                       final int price,
                       final int duration,
                       final Location startStorage,
                       final Location finalStorage,
                       final Bus bus,
                       final Date arrival) {

        super(name, price, duration, arrival);
        this.startStorage = startStorage;
        this.finalStorage = finalStorage;
        this.bus = bus;
    }

    public Location getStartStorage() {
        return startStorage;
    }

    public void setStartStorage(final Location startStorage) {
        this.startStorage = startStorage;
    }

    public Location getFinalStorage() {
        return finalStorage;
    }

    public void setFinalStorage(final Location finalStorage) {
        this.finalStorage = finalStorage;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(final Bus bus) {
        this.bus = bus;
    }


    @Override
    public String toString() {
        return "BusDelivery{"
                + "startStorage="
                + startStorage
                + ", finalStorage="
                + finalStorage
                + ", bus="
                + bus
                + '}';
    }
}
