package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //ArrayListExample();

        Player Lebron = new Player(23,"Lebron",99);
        Player Kobe = new Player(24, "Kobe", 95);
        Player Curry = new Player(30,"Curry",93);
        Player Westbrook = new Player(0,"Westbrook",88);
        Player Durant = new Player(35,"Durant", 96);
        Player Giannis = new Player (34,"Giannis", 94);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(Lebron);
        playerLinkedList.addToFront(Kobe);
        playerLinkedList.addToFront(Curry);
        playerLinkedList.addToFront(Westbrook);
        playerLinkedList.addToFront(Durant);
        playerLinkedList.addToFront(Giannis);



        playerLinkedList.printList();

        playerLinkedList.removeFrontNode();

        //System.out.println("\nSize: "+playerLinkedList.getSize());                                                    //print size
        //System.out.println(playerLinkedList.contains(new Player(24, "Kobe", 95)));                                    //contains()
        //System.out.println(playerLinkedList.indexOf(new Player(23,"Lebron",99)));                                     //indexOf()

        //System.out.println(playerLinkedList.getPlayerNode(0).getPlayer());

        playerLinkedList.DisplayNextAndPreviousPlayer(1);
    }

    public  static void ArrayListExample() // for testing what contains() and indexOf() does
    {
        List<Player> playerList= new ArrayList<>();
        playerList.add(new Player(32,"Jabrony",99));
        playerList.add(new Player(42, "Dobee", 95));
        playerList.add(new Player(03,"SethCurry",93));

        for(Player p: playerList)
        {
            System.out.println(p);
        }

        System.out.println(playerList.contains(new Player(32,"Jabrony", 99)));
    }


}
