package com.company;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(55);
        tree.insert(75);
        tree.insert(26);
        tree.insert(69);
        tree.insert(30);
        tree.insert(88);
        tree.insert(33);
        tree.insert(60);
        tree.insert(50);
        tree.insert(6);


        System.out.println("Ascending Order: ");
        tree.traverseInOrder();

        //System.out.println(tree.get(30));

        System.out.println("\nMIN: " + tree.getMin());    //get minimum
        System.out.println("\nMAX: " + tree.getMax());    //get maximum

        System.out.println("\nDescending Order: ");
        tree.traverseInOrderDescending();
    }
}
