package ua.lviv.iot.models;

import java.util.Date;

public class TrainDelivery extends Delivery {
    private Location startStorage;
    private Location finalStorage;
    private Train train;

    public TrainDelivery(final String name,
                         final int price,
                         final int duration,
                         final Location startStorage,
                         final Location finalStorage,
                         final Train train,
                         final Date arrival) {

        super(name, price, duration, arrival);
        this.startStorage = startStorage;
        this.finalStorage = finalStorage;
        this.train = train;
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

    public Train getTrain() {
        return train;
    }

    public void setTrain(final Train train) {
        this.train = train;
    }


}
