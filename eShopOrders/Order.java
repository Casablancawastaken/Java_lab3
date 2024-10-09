package java_labs.Lab3.eShopOrders;

import java.util.List;

public class Order {
    private int orderNumber;
    private List<String> items;
    private String deliveryAddress;
    private double totalPrice;

    public Order(int orderNumber, List<String> items, String deliveryAddress, double totalPrice) {
        this.orderNumber = orderNumber;
        this.items = items;
        this.deliveryAddress = deliveryAddress;
        this.totalPrice = totalPrice;
    }

    public String toString() {
        return "Заказ №" + orderNumber + ": Позиции = " + items + ", Адрес = " + deliveryAddress + ", Стоимость = " + totalPrice;
    }
}
