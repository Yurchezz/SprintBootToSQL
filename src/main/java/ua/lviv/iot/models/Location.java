package ua.lviv.iot.models;

public class Location {
    private int longitude;
    private int letitude;

    public Location(final int longitude,
                    final int letitude) {

        this.longitude = longitude;
        this.letitude = letitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(final int longitude) {
        this.longitude = longitude;
    }

    public int getLetitude() {
        return letitude;
    }

    public void setLetitude(final int letitude) {
        this.letitude = letitude;
    }

    @Override
    public String toString() {
        return "Location{"
                + "longitude="
                + longitude
                + ", letitude="
                + letitude
                + '}';
    }
}
