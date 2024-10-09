package java_labs.Lab3.eShopOrders;

import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        OrderHashTable orderHashTable = new OrderHashTable();

        orderHashTable.addOrder(1, Arrays.asList("Ноутбук", "Мышь"), "Москва", 1500.00);
        orderHashTable.addOrder(18, Arrays.asList("Телефон", "Наушники"), "Владивосток", 800.00);
        orderHashTable.addOrder(3, Arrays.asList("Лампа", "Микрофон"), "СПб", 600.00);
        orderHashTable.addOrder(4, Arrays.asList("Клавиатура", "Монитор", "Моноблок"), "Ханты-Мансийск", 50000.00);

        orderHashTable.findOrder(3);
        orderHashTable.removeOrder(1);
        orderHashTable.displayAllOrders();
    }
}
