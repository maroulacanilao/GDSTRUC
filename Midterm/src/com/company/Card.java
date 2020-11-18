package com.company;

import java.util.Objects;

public class Card {
    private String Name;

    public Card(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Card{" +
                "Name='" + Name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(Name, card.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name);
    }
}
