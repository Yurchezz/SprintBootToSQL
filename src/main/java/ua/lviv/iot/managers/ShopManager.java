package ua.lviv.iot.managers;

import ua.lviv.iot.models.Client;
import ua.lviv.iot.models.Good;
import ua.lviv.iot.models.Shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ShopManager implements IDelivery {
    private Shop shop;
    private List<Client> clients;

    public ShopManager(final Shop shop, final List<Client> clients) {
        this.shop = shop;
        this.clients = clients;
    }

    public List<Good> findDeliveryType(final String deliveryName) {

        List<Good> result = new ArrayList<>();

        for (int i = 0; i < shop.getCatalog().size(); i++) {

            if (shop.getCatalog().get(i).getDelivery().getName()
                    .equals(deliveryName)) {

                result.add(shop.getCatalog().get(i));
            }
        }

        return result;

    }

    public List<Good> findGoodsRange(final int lower, final int higher) {

        List<Good> result = new ArrayList<>();

        for (int i = 0; i < shop.getCatalog().size(); i++) {
            if (higher > shop.getCatalog().get(i).getPrice()
                    && shop.getCatalog().get(i).getPrice() > lower) {
                result.add(shop.getCatalog().get(i));
            }
        }
        return result;
    }

    public void sortByDeliveryDuration(final boolean switcher) {

        if (switcher) {
            shop
                    .getCatalog()
                    .sort(
                            Comparator
                                    .comparingInt(
                                            (Good o1) ->
                                                    o1.getDelivery().getDuration()));
        } else {
            shop
                    .getCatalog()
                    .sort(
                            Collections.reverseOrder(
                                    Comparator.comparingInt(
                                            (Good o) ->
                                                    o.getDelivery().getDuration())));
        }

    }

    public void sortByArrivalDate(final boolean switcher) {
        if (switcher) {
            shop
                    .getCatalog()
                    .sort(
                            Comparator.comparing(
                                            (Good o) ->
                                                    o.getDelivery().getArrival()));
        } else {
            shop
                    .getCatalog()
                    .sort(
                            (Good o1, Good o2) ->
                                    o2.getDelivery()
                                            .getArrival()
                                            .compareTo(
                                                    o1.getDelivery().getArrival()));

        }
    }

    public void sortByDeliveryPrice(final boolean switcher) {
        if (switcher) {
            shop.getCatalog()
                    .sort(
                            Comparator.comparingInt(
                                    (Good o) ->
                                            o.getDelivery().getPrice()));
        } else {
            shop.getCatalog()
                    .sort(
                            (Good o1, Good o2) ->
                                    o2.getDelivery().getPrice() - o1.getDelivery().getPrice());
        }

    }

    public void showShopCatalog() {
        System.out.println("--------------------------"
                + shop.getName()
                + "----------------------Catalog----------"
                + "----------------------------------------");

        for (int i = 0; i < shop.getCatalog().size(); i++) {
            System.out.println(shop.getCatalog().get(i));
        }

        System.out.println("----------------------------------"
                + "-------------------------------------------"
                + "-------------------------------------------");
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(final Shop shop) {
        this.shop = shop;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(final List<Client> clients) {
        this.clients = clients;
    }

}
