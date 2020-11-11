package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        int[] numbers = new int[10];
        PutRandomIntArr(numbers);


        System.out.println("Before Sorting: ");
        PrintArrayInt(numbers);

        //BubbleSort(numbers);
        SelectionSort(numbers);
        System.out.println("\n\nAfter Ascending Sorting: ");
        PrintArrayInt(numbers);

        //DescendingBubbleSort(numbers);
        //DescendingSelectionSort(numbers);
        ModifiedDescendingSelectionSort(numbers);
        System.out.println("\n\nAfter Descending Sorting: ");
        PrintArrayInt(numbers);

    }

    private static void PrintArrayInt(int [] arr)
    {
        for (int j:arr)
        {
            System.out.println(j);
        }
    }

    private static void BubbleSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length -1; lastSortedIndex >0; lastSortedIndex--)
        {
            for (int i=0; i< lastSortedIndex; i++)
            {
                if(arr[i]>arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }

    private static void DescendingBubbleSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length -1; lastSortedIndex >0; lastSortedIndex--)
        {
            for (int i=0; i< lastSortedIndex; i++)
            {
                if(arr[i] < arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }

    private static void PutRandomIntArr(int[] arr)
    {
        Random rand = new Random();
        for(int l = 0; l < arr.length; l++)
        {
            arr[l] = rand.nextInt(100);
        }

    }

    private static void SelectionSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length -1; lastSortedIndex >0; lastSortedIndex--)
        {
            int largestIndex = 0;
            for(int i = 1; i <= lastSortedIndex; i++)
            {
                if(arr[i] >arr[largestIndex])
                {
                    largestIndex = i;

                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[largestIndex];
            arr[largestIndex] = temp;
        }
    }

    private static void DescendingSelectionSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length -1; lastSortedIndex >0; lastSortedIndex--)
        {
            int largestIndex = 0;
            for(int i = 1; i <= lastSortedIndex; i++)
            {
                if(arr[i] < arr[largestIndex])
                {
                    largestIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[largestIndex];
            arr[largestIndex] = temp;
        }
    }

    private static void ModifiedDescendingSelectionSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length -1; lastSortedIndex >0; lastSortedIndex--)
        {
            int smallestIndex = 0;
            for(int i = 1; i <= lastSortedIndex; i++)
            {
                if(arr[i] < arr[smallestIndex])
                {
                    smallestIndex = i;

                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
    }
}





