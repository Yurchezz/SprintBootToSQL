package ua.lviv.iot.models;

public class Plane {
    private String mark;
    private int maxHight;
    private int tonnage;

    public Plane(final String mark,
                 final int maxHight,
                 final int tonnage) {

        this.mark = mark;
        this.maxHight = maxHight;
        this.tonnage = tonnage;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(final String mark) {
        this.mark = mark;
    }

    public int getMaxHigh() {
        return maxHight;
    }

    public void setMaxHigh(final int maxHight) {
        this.maxHight = maxHight;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(final int tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Plane{"
                + "mark='"
                + mark
                + '\''
                + ", maxHight="
                + maxHight
                + ", tonnage="
                + tonnage
                + '}';
    }
}
