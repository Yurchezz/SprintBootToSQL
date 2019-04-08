package ua.lviv.iot.models;

public class Bus {
    private String mark;
    private int maxSpeed;

    public Bus(final String mark,
               final int maxSpeed) {

        this.mark = mark;
        this.maxSpeed = maxSpeed;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(final String mark) {
        this.mark = mark;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(final int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Bus{"
                + "mark='"
                + mark
                + '\''
                + ", maxSpeed="
                + maxSpeed
                + '}';
    }
}
