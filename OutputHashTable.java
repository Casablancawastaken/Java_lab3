package java_labs.Lab3;

public class OutputHashTable {
    public static void main(String[] args) {
        HashTable<Integer, String> hashTable = new HashTable<>();

        hashTable.put(3, "banana");
        hashTable.put(8, "apple");
        hashTable.put(214, "pear");
        hashTable.put(856, "strawberry");
        hashTable.put(100, "coconut");
        hashTable.put(19, "golden apple");
        hashTable.put(14, "long banana");

        System.out.println("Значение по ключу: " + hashTable.get(856));
        System.out.println("Размер таблицы: " + hashTable.size());

        hashTable.remove(14);

        System.out.println("Таблица пуста? " + hashTable.isEmpty());

        hashTable.printTable();
    }
}
