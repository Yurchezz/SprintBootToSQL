package ua.lviv.iot.managers;

import ua.lviv.iot.models.Good;

import java.util.List;

public interface IDelivery {
    List<Good> findDeliveryType(final String deliveryType);

    List<Good> findGoodsRange(final int lower, final int higher);

    void sortByDeliveryDuration(final boolean switcher);

    void sortByArrivalDate(final boolean switcher);

    void sortByDeliveryPrice(final boolean switcher);

    void showShopCatalog();
}

