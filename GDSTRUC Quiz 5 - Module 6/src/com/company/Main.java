package com.company;

public class Main {

    public static void main(String[] args) {
        int[] number = new int[50];

        populateArray(number);
        //printArray(number);

        int input = 69;
        printThis(""+number[byTenSearch(number,input)]); //just checking

        
    }


    public static void populateArray(int number[])
    {
        int x = 0;
        //populate array
        for (int i = 0; i <50;i++)
        {
            number[i] = x;
            x+=3;

        }
    }

    public static void printArray(int number[])
    {
        for(int i=0; i < number.length;i++ )
        {
            System.out.println(number[i]);
        }
    }

    public static int byTenSearch(int number[], int input)
    {
        int tenth = (number.length / 10);
        int x = tenth;

        while(x< number.length)
        {
            if (number[x] == input)
            {
                printThis("Found it! at index: " + x);
                return x;
            }
            if(number[x] > input)
            {
                for(int i=0;i<tenth;i++)
                {
                    if (number[x] == input)
                    {
                        printThis("Found it! at index: " + x);
                        return x;
                    }
                    x--;
                }
                return -1;
            }
            else
            {
                x += tenth;
            }
        }
        return -1;
    }

    public static void printThis(String string)
    {
        System.out.println(string);
    }
}
