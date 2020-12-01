package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static String[] Names = {"Lebron", "Kobe", "Curry", "Westbrook", "Durant", "Giannis", "Walker", "Tatum", "Bam", "Jokic"};

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(10);

        do {
            turn(queue,getRandomNumber(1,7));
            System.out.println("in queue: "+queue.getSize());
            if(queue.getSize() >=5)
            {
                System.out.println("Creating a match for 5 players..");
                for(int i=0;i<5;i++)
                {
                    queue.remove();
                }
            }
            promptEnterKey();
        } while(!queue.isEmpty());
    }

    public static int getRandomNumber(int min, int max) {
        Random rand = new Random();

        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

    public static void turn(ArrayQueue queue, int number)
    {
        System.out.println(number + " Players joined the queue");
        for(int i = 0; i <number; i++)
        {
            queue.add(new Player(getRandomNumber(1,999),Names[getRandomNumber(0,9)],getRandomNumber(50,99)));
        }
    }

    public static void promptEnterKey(){
        System.out.println("Press \"ENTER\" to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}

