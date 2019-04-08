package ua.lviv.iot.models;

import java.util.List;

public class Shop {
    private String name;
    private String webSite;
    private List<Good> catalog;
    private List<Delivery> deliveryTypes;

    public Shop(final String name,
                final String webSite,
                final List<Good> catalog) {

        this.name = name;
        this.webSite = webSite;
        this.catalog = catalog;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(final String webSite) {
        this.webSite = webSite;
    }

    public List<Good> getCatalog() {
        return catalog;
    }

    public void setCatalog(final List<Good> catalog) {
        this.catalog = catalog;
    }

    public List<Delivery> getDelieveryTypes() {
        return deliveryTypes;
    }

    public void setDelieveryTypes(final List<Delivery> delieveryTypes) {
        this.deliveryTypes = delieveryTypes;
    }

    @Override
    public String toString() {
        return "Shop{"
                + "name='"
                + name
                + '\''
                + ", webSite='"
                + webSite
                + '\''
                + ", catalog="
                + catalog
                + ", delieveryTypes="
                + deliveryTypes
                + '}';
    }
}
