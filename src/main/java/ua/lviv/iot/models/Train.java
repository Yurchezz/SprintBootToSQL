package ua.lviv.iot.models;

public class Train {
    private String mark;
    private int railwayCarriageCount;

    public Train(final String mark,
                 final int railwayCarriageCount) {

        this.mark = mark;
        this.railwayCarriageCount = railwayCarriageCount;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(final String mark) {
        this.mark = mark;
    }

    public int getRailwayCarriageCount() {
        return railwayCarriageCount;
    }

    public void setRailwayCarriageCount(final int railwayCarriageCount) {
        this.railwayCarriageCount = railwayCarriageCount;
    }

    @Override
    public String toString() {
        return "Train{"
                + "mark='"
                + mark
                + '\''
                + ", railwayСarriageCount="
                + railwayCarriageCount
                + '}';
    }
}
