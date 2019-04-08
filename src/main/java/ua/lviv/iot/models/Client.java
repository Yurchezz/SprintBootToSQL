package ua.lviv.iot.models;

public abstract class Client {
    private String name;
    private Location home;
    private int cash;

    public Client(final String name,
                  final Location home,
                  final int cash) {

        this.name = name;
        this.home = home;
        this.cash = cash;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Location getHome() {
        return home;
    }

    public void setHome(final Location home) {
        this.home = home;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(final int cash) {
        this.cash = cash;
    }

    @Override
    public String toString() {
        return "Client{"
                + "name='"
                + name
                + '\''
                + ", home="
                + home
                + ", cash="
                + cash
                + '}';
    }
}
