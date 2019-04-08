package ua.lviv.iot.models;

import javax.persistence.*;

@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class MacBook extends Good {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Integer id;

    private int displayDiagonal;
    private int manufactureYear;

    public MacBook() {
        super();

    }

    public MacBook(final String name,
                   final int price,
                   final int displayDiagonal,
                   final int manufactureYear,
                   final Delivery delivery) {

        super(name, price, delivery);
        this.displayDiagonal = displayDiagonal;
        this.manufactureYear = manufactureYear;
    }
//
//    @Override
//    public Integer getId() {
//        return id;
//    }

//    @Override
//    public void setId(Integer id) {
//        this.id = id;
//    }

    public int getDisplayDiagonal() {
        return displayDiagonal;
    }

    public void setDisplayDiagonal(final int displayDiagonal) {
        this.displayDiagonal = displayDiagonal;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(final int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders()
                + "displayDiagonal,"
                + "manufactureYear";
    }

    @Override
    public String toCSV() {
        return super.toCSV()
                + "," + getDisplayDiagonal()
                + "," + getManufactureYear();
    }
}
