/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmachieved.mmmcomp;

import javax.swing.JOptionPane;

/**
 *
 * @author johnp
 */
public class mMain {

    public static void main(String[] args) {
        int[] invalue = new int[]{2, 7, 5, 7, 14};
        int numVal = 5;
        double tot = 0;
        double mean = 0;
        for (int i = 0; i < numVal; i++) {
            tot = tot + invalue[i];
        }
        mean = tot / numVal;
        System.out.println("The mean value is: " + mean);
        //Median calculation
        double median = 0;
        double mid = 0;
        if (numVal % 2 == 0) {
            int temp = (numVal / 2) - 1;
            for (int i = 0; i < numVal; i++) {
                if (temp == i || (temp + 1) == i) {
                    mid = mid + invalue[i];
                }
            }
            mid = mid / 2;
            System.out.println("Median value is: " + mid);
        } else {
            int temp = (numVal / 2);
            for (int i = 0; i < numVal; i++) {
                if (temp == i) {
                    mid = invalue[i];
                    System.out.println("Median value: " + mid);
                }
            }
        }
        //Mode calculation 
        //Sorting and getting the value that appears most often 
        int i, j, z, tmp, maxCount, modeValue;
        int[] tally = new int[numVal];
        for (i = 0; i < numVal; i++) {
            for (j = 0; j < numVal - i; j++) {
                if (j + 1 != numVal) {
                    if (invalue[j] > invalue[j + 1]) {
                        tmp = invalue[j];
                        invalue[j] = invalue[j + 1];
                        invalue[j + 1] = tmp;
                    }
                }
            }
        }
        for (i = 0; i < numVal; i++) {
            for (z = i + 1; z < numVal; z++) {
                if (invalue[i] == invalue[z]) {
                    tally[i]++;
                }
            }
        }
        maxCount = 0;
        modeValue = 0;
        for (i = 0; i < numVal; i++) {
            if (tally[i] > maxCount) {
                maxCount = tally[i];
                modeValue = invalue[i];
            }
        }
        System.out.println("Mode value is :" + modeValue);
    }
}
