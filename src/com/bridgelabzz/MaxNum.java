package com.bridgelabzz;

/**
 * Author : janani vijayakumar
 * date : 30/10/2021
 * Desc : largest value
 */

import java.util.*;
public class MaxNum {
    public static <T extends Comparable<T>> T maximum(T... elements) {
        T max = elements[0];
        for (T element : elements) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;// returns the largest object
    }
    public static void main(String args[]) {
        System.out.printf("Maximum number of (%d,%d,%d,%d) is : %d\n\n", 12, 8, 5, 13, maximum(12, 8, 5, 13));
        System.out.printf("Max of %.1f,%.1f,%.1f,%.1f is : %.1f\n\n", 6.6, 5.5, 10.1, 8.8, 7.7, maximum( 6.6, 5.5, 10.1, 8.8, 7.7 ));
        System.out.printf("Max of %s, %s, %s, %s is : %s\n","pear", "apple", "orange", "pineapple", maximum("pear", "apple", "orange", "pineapple"));

    }
}
