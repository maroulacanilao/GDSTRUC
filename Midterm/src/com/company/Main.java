package com.company;

import java.util.*;

public class Main {

    private static Deck deck = new Deck();
    private static Deck onHand = new Deck();
    private static Deck discardPile = new Deck();


    public static void main(String[] args) {


//        deck.push(new Card("Hearts"));
//        deck.push(new Card("Clubs"));
//        deck.push(new Card("Spade"));

        CreateCardsOnDeckWithSameName(10, " of Hearts");
        CreateCardsOnDeckWithSameName(10, " of Spades");
        CreateCardsOnDeckWithSameName(10, " of Clubs");

        deck.shuffle();
        //deck.printDeck();

        int roundNumber = 1;

        while (!deck.isEmpty()) {
            printThis("---------- Round " + roundNumber + " ----------");

            printThis("1 - Draw from deck   2 - Discard     3 - Get from discard pile");
            roundUserInput();

            //roundRandom();

            printThis("On Hand: ");
            onHand.printDeck();

            printThis("Deck: " + deck.getSize());
            printThis("Discard Pile: " + discardPile.getSize());

            printThis("==================================\n\n");

            roundNumber++;
        }

    }

    public static void printThis(String print) // too lazy to type the command everytime
    {
        System.out.println(print);
    }

    public static void CreateCardsOnDeckWithSameName(int quantity, String name) {
        for (int i = 0; i < quantity; i++) {
            deck.push(new Card(i + 1 + name));
        }
    }

    public static void Draw(int quantity) {
        for (int i = 0; i < quantity; i++) {
            onHand.push(deck.pop());
            if (deck.isEmpty()) return;
        }
    }

    public static void Discard(int quantity) {
        if (onHand.isEmpty()) throw new EmptyStackException();

        for (int i = 0; i < quantity; i++) {
            discardPile.push(onHand.pop());
            if (onHand.isEmpty()) return;
        }
    }

    public static void getFromDiscardPile(int quantity) {
        if (discardPile.isEmpty()) throw new EmptyStackException();
        for (int i = 0; i < quantity; i++) {
            onHand.push(discardPile.pop());
            if (discardPile.isEmpty()) return;
        }
    }

    public static int getRandomNumber(int min, int max) {
        Random rand = new Random();

        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

    public static void roundRandom() {
        int choice = getRandomNumber(1, 3);

        if (choice == 1)  //Draw from deck
        {
            Draw(getRandomNumber(1, 5)); //Draw from deck
        }

        if (choice == 2) //Discard card to discardPile
        {
            if (onHand.isEmpty()) {
                roundRandom();
            } else {
                Discard(getRandomNumber(1, 5));
            }
        }

        if (choice == 3) //get from discardPile
        {
            if (discardPile.isEmpty()) {
                roundRandom();
            } else {
                getFromDiscardPile(getRandomNumber(1, 5));
            }
        }
        //printThis("Choice: " + choice); //debugging purposes
    }

    public static void roundUserInput() {
        Scanner input = new Scanner(System.in);

        int choice = 0;
        while ((choice!=1)&&(choice!=2)&&(choice!=3))
        {
            choice = input.nextInt();
        }

        if (choice == 1)  //Draw from deck
        {
            int quantity;
            do {
                printThis("How Many do you want to draw? (5 max)");
                quantity = input.nextInt();
            } while ((quantity<1)||(quantity>5));
            Draw(quantity);
        }

        if (choice == 2) //Discard card to discardPile
        {
            if (onHand.isEmpty()) {
                printThis("You have any empty hand, draw first. Choose again what to do");
                roundUserInput();
            } else {
                int quantity;
                do {
                    printThis("How many do you want? (5 max)");
                    quantity = input.nextInt();
                } while ((quantity > onHand.getSize()) || (quantity<1)||(quantity>5));
                Discard(quantity);
            }
        }

        if (choice == 3) //get from discardPile
        {
            if (discardPile.isEmpty()) {
                printThis("The discard pile is empty, choose again what to do");
                roundUserInput();
            } else {
                int quantity;
                do {
                    printThis("How many do you want? (5 max)");
                    quantity = input.nextInt();
                } while (quantity > discardPile.getSize() || (quantity<1)||(quantity>5));
                getFromDiscardPile(quantity);
            }
        }
    }
}
