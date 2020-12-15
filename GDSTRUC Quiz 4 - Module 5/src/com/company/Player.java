package com.company;

import java.util.Objects;

public class Player {
    private int ID;
    private String username;
    private int level;

    public Player(int ID, String username, int level) {
        this.ID = ID;
        this.username = username;
        this.level = level;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public void setName(String name) {
        this.username = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Player{" +
                "ID=" + ID +
                ", name='" + username + '\'' +
                ", level=" + level +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return ID == player.ID &&
                level == player.level &&
                Objects.equals(username, player.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, username, level);
    }
}
