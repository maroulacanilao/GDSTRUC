package com.company;

public class PlayerLinkedList {
    private  PlayerNode head;
    private int size = 0;

    public void addToFront(Player player)
    {
        PlayerNode playernode = new PlayerNode(player);
        if (head != null) head.setPreviousPlayer(playernode);
        playernode.setNextPlayer(head);
        head = playernode;
        size+=1;
    }

    public void removeFrontNode()
    {
        head = head.getNextPlayer();
        head.setPreviousPlayer(null);
        if (size >= 0) size-=1;
    }

    public void printList()
    {
        PlayerNode current = head;
        System.out.println("Head ->");
        while(current!= null)
        {
            System.out.println(current.getPlayer());
            System.out.println(("   ->  "));
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }

    public int getSize() {
        return size;
    }

    public boolean contains(Player compare)
    {
        PlayerNode current = head;
        while(current != null)
        {

            if(current.getPlayer().hashCode() == compare.hashCode()) return true;
            current = current.getNextPlayer();
        }

        return  false;
    }

    public int indexOf(Player compare)
    {
        int index=0;
        PlayerNode current = head;
        while(current != null)
        {
            if(current.getPlayer().hashCode() == compare.hashCode()) break;
            current = current.getNextPlayer();
            index++;
        }
        return index;
    }

    public PlayerNode getPlayerNode(int index)
    {
        PlayerNode current = head;
        for(int i=0;i<index;i++)
        {
            current = current.getNextPlayer();
        }
        return current;
    }

    public void DisplayNextAndPreviousPlayer(int index)
    {
        PlayerNode current = getPlayerNode(index);

        System.out.println("Current:\n" + current.getPlayer());

        System.out.println("\nNext ->");
        if (current.getNextPlayer() != null) System.out.println(current.getNextPlayer().getPlayer());
        else System.out.println("NULL");

        System.out.println("\n<- Previous");
        if (current.getPreviousPlayer() != null) System.out.println(current.getPreviousPlayer().getPlayer());
        else System.out.println("NULL");
    }

}
