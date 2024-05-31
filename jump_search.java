package com.array.progs;
import java.util.*;

public class jump_search {

    public static int js(int arr[], int n, int key) {
        int step = (int) Math.sqrt(n);
        int prev = 0;

        // Finding the block where the element is present (if it is present)
        while (arr[Math.min(step, n) - 1] < key) {
            prev = step;
            step += (int) Math.sqrt(n);
            if (prev >= n)
                return -1;
        }

        // Doing a linear search for key in the identified block
        while (arr[prev] < key) {
            prev++;
            // If we reached the next block or end of array, the element is not present
            if (prev == Math.min(step, n))
                return -1;
        }

        // If element is found
        if (arr[prev] == key)
            return prev;

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key to be searched:");
        int key = sc.nextInt();
        int index = js(arr, n, key);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found at index: " + index);
        }
    }
}

