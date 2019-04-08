package ua.lviv.iot.models;

import org.springframework.context.annotation.ComponentScan;

import javax.persistence.*;
//
//@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@MappedSuperclass
public abstract class Good {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private int price;
    private Delivery delivery;

    public Good() {
    }

    public Good(final String name,
                final int price,
                final Delivery delivery) {

        this.name = name;
        this.price = price;
        this.delivery = delivery;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(final Delivery delivery) {
        this.delivery = delivery;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Good {"
                + " | name = '"
                + name
                + '\''
                + ", | price = "
                + price
                + ", | arrival date = "
                + delivery.getArrival().getDate()
                + "."
                + delivery.getArrival().getMonth()
                + "."
                + delivery.getArrival().getYear()
                + ", | delivery duration = "
                + delivery.getDuration()
                + ", | delivery price = "
                + delivery.getPrice()
                + '}';
    }

    public String getHeaders() {
        return "Name,"
                + "Price,"
                + "Arrival,";
    }

    public String toCSV() {
        return getName()
                + "," + getPrice()
                + "," + delivery.getArrival().getDate()
                + "." + delivery.getArrival().getMonth()
                + "." + delivery.getArrival().getYear();
    }

}
