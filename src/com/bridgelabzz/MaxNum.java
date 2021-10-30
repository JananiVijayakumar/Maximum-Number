package com.bridgelabzz;

/**
 * Author : janani vijayakumar
 * date : 30/10/2021
 * Desc : Largest float number among 3
 * **/

import java.util.*;
public class MaxNum {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x; // assume x is largest

        if (y.compareTo(max) > 0)
            max = y; // assume y is largest

        if (z.compareTo(max) > 0)
            max = z; // assume z is largest

        return max; // returns the largest object
    }

    public static void main(String args[]) {
        System.out.printf("Maximum of (%.1f, %.1f , %.1f) is : %.1f\n\n", 16.6, 8.8, 7.7, maximum(16.6, 8.8, 7.7)); //print the largest float number

    }
}
