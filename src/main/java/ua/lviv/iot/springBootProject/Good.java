package ua.lviv.iot.springBootProject;

import javax.persistence.*;


@Entity
@Inheritance
@DiscriminatorColumn(name="GOOD_TYPE")
@Table(name = "good_tbl_test")
public abstract class Good {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private int price;

    public Good() {
    }

    public Good(final String name,
                final int price) {

        this.name = name;
        this.price = price;
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
                + '}';
    }

    public String getHeaders() {
        return "Name,"
                + "Price,"
                + "Arrival,";
    }


}
