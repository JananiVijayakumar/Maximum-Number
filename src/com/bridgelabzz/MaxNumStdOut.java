package com.bridgelabzz;
/**
 * Author : janani vijayakumar
 * date : 30/10/2021
 * Desc : largest value
 */
import java.util.*;
public class MaxNumStdOut<T extends Comparable<T>> {
        T x, y, z;
        public MaxNumStdOut(T x, T y, T z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
        public <T extends Comparable<T>> T maximum() {
            if (x.compareTo(y) > 0 &&  x.compareTo(z) > 0) // if x is largest
                return (T) x; // returns the largest object
            else if (y.compareTo(x) > 0 &&  y.compareTo(z) > 0) //if y is largest
                return (T) y; // returns the largest object

            else return (T) z; //if z is largest
            // returns the largest object
        }

        public static void main(String args[]) {
            MaxNumStdOut maxnum1 = new MaxNumStdOut(8, 9, 10); //create obj
            System.out.println("Maximum of Integer is : " +maxnum1.maximum());
            MaxNumStdOut maxnum2 = new MaxNumStdOut(8.8f, 7.9f, 10.1f);
            System.out.println("Maximum of Float is : " +maxnum2.maximum());
            MaxNumStdOut maxnum3 = new MaxNumStdOut("peer", "Apple", "orange");
            System.out.println("Maximum of String is : " +maxnum3.maximum());
        }
    }
