package ua.lviv.iot.models;

import java.util.Date;

public class PlaneDelivery extends Delivery {
    private Location startAiroport;
    private Location finalAiroport;
    private Plane plane;

    public PlaneDelivery(final String name,
                         final int price,
                         final int duration,
                         final Location startAiroport,
                         final Location finalAiroport,
                         final Plane plane,
                         final Date arrival) {

        super(name, price, duration, arrival);
        this.startAiroport = startAiroport;
        this.finalAiroport = finalAiroport;
        this.plane = plane;
    }

    public Location getStartAiroport() {
        return startAiroport;
    }

    public void setStartAiroport(final Location startAiroport) {
        this.startAiroport = startAiroport;
    }

    public Location getFinalAiroport() {
        return finalAiroport;
    }

    public void setFinalAiroport(final Location finalAiroport) {
        this.finalAiroport = finalAiroport;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(final Plane plane) {
        this.plane = plane;
    }


    @Override
    public String toString() {
        return "PlaneDelivery{"
                + "startAiroport="
                + startAiroport
                + ", finalAiroport="
                + finalAiroport
                + ", plane="
                + plane
                + '}';
    }
}
