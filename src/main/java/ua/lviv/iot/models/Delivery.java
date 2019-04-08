package ua.lviv.iot.models;

import java.util.Date;

public abstract class Delivery {
    private String name;
    private int price;
    private int duration;
    private Client client;
    private Date arrival;

    public Delivery(final String name,
                    final int price,
                    final int duration,
                    final Date arrival) {

        this.price = price;
        this.duration = duration;
        this.name = name;
        this.arrival = arrival;
    }


    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(final int price) {
        this.price = price;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(final int duration) {
        this.duration = duration;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(final Client client) {
        this.client = client;
    }

    public Date getArrival() {
        return arrival;
    }

    public void setArrival(final Date arrival) {
        this.arrival = arrival;
    }

    @Override
    public String toString() {
        return "Delivery{"
                + "name='"
                + name
                + '\''
                + ", price="
                + price
                + ", duration="
                + duration
                + ", client="
                + client
                + ", arrival="
                + arrival
                + '}';
    }
}
