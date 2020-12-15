package com.company;



public class Main {

    public static void main(String[] args) {
        Player Lebron = new Player(23,"KingJames",98);
        Player Curry = new Player(30,"ChefCurry", 95);
        Player Giannis= new Player(34, "GreekFreak", 93);
        Player Wade = new Player(3, "Flash", 94);
        Player Jordan = new Player(23,"MJ", 99);
        Player Rose = new Player(1,"DRose", 90);

        SimpleHashTable hashTable = new SimpleHashTable();
        hashTable.put(Lebron.getUsername(), Lebron);
        hashTable.put(Curry.getUsername(),Curry);
        hashTable.put(Giannis.getUsername(), Giannis);
        hashTable.put(Wade.getUsername(), Wade);
        hashTable.put(Jordan.getUsername(), Jordan);
        hashTable.put(Rose.getUsername(), Rose);

        hashTable.printHashTable();
        hashTable.remove("DRose");
        System.out.println("new Hash Table: ");
        hashTable.printHashTable();
    }
}
