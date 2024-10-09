package java_labs.Lab3.eShopOrders;

import java.util.HashMap;
import java.util.List;

public class OrderHashTable {
    private HashMap<Integer, Order> orders;

    public OrderHashTable() {
        orders = new HashMap<>();
    }

    public void addOrder(int orderNumber, List<String> items, String deliveryAddress, double totalPrice) {
        Order newOrder = new Order(orderNumber, items, deliveryAddress, totalPrice);
        orders.put(orderNumber, newOrder);
        System.out.println("Заказ №" + orderNumber + " добавлен");
    }

    public void findOrder(int orderNumber) {
        Order foundOrder = orders.get(orderNumber);
        if (foundOrder != null) {
            System.out.println("Найден: " + foundOrder);
        } else {
            System.out.println("Не найден");
        }
    }

    public void removeOrder(int orderNumber) {
        if (orders.containsKey(orderNumber)) {
            orders.remove(orderNumber);
            System.out.println("Заказ №" + orderNumber + " удалён");
        } else {
            System.out.println("Заказ №" + orderNumber + " не найден");
        }
    }

    public void displayAllOrders() {
        if (orders.isEmpty()) {
            System.out.println("Заказов нет");
        } else {
            orders.forEach((orderNumber, order) -> {
                System.out.println(order);
            });
        }
    }
}
