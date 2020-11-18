package com.company;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Deck {
    private LinkedList<Card> deck;

    public Deck() {
        deck = new LinkedList<Card>();
    }

    public LinkedList<Card> getDeck() {
        return deck;
    }

    public void setDeck(LinkedList<Card> deck) {
        this.deck = deck;
    }

    public void push(Card card)
    {
        deck.push(card);
    }

    public boolean isEmpty()
    {
        return deck.isEmpty();
    }

    public Card pop()
    {
        return deck.pop();
    }

    public Card peek()
    {
        return deck.peek();
    }

    public void printDeck()
    {
        ListIterator iterator = deck.listIterator();
        System.out.println("Cards: ");
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }

    public int getSize()
    {
        return deck.size();
    }

    public void shuffle()
    {
        Collections.shuffle(deck);
    }
}
