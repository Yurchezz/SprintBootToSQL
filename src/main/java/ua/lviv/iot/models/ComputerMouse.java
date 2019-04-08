package ua.lviv.iot.models;

public class ComputerMouse extends Good {
    private int buttonCount;
    private int cableLenth;

    public ComputerMouse(final String name,
                         final int price,
                         final int buttonCount,
                         final int cableLenth,
                         final Delivery delivery) {

        super(name, price, delivery);
        this.buttonCount = buttonCount;
        this.cableLenth = cableLenth;
    }

    public int getButtonCount() {
        return buttonCount;
    }

    public void setButtonCount(final int buttonCount) {
        this.buttonCount = buttonCount;
    }

    public int getCableLength() {
        return cableLenth;
    }

    public void setCableLength(final int cableLenth) {
        this.cableLenth = cableLenth;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders()
                + "buttonCount,"
                + "cableLength";
    }

    @Override
    public String toCSV() {
        return super.toCSV()
                + "," + getButtonCount()
                + "," + getCableLength();
    }
}
