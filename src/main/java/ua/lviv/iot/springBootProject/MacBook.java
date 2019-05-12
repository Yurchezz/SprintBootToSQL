package ua.lviv.iot.springBootProject;

import javax.persistence.*;

@Entity
@DiscriminatorValue("MacBook")
public class MacBook extends Good {

    private int displayDiagonal;
    private int manufactureYear;

    public MacBook() {
        super();

    }

    public MacBook(final String name,
                   final int price,
                   final int displayDiagonal,
                   final int manufactureYear) {

        super(name, price);
        this.displayDiagonal = displayDiagonal;
        this.manufactureYear = manufactureYear;
    }

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


}
