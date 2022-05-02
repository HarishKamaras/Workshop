package com.brigdelabz.Harmonicnumber;

//b. I/P -> The Harmonic Value N. Ensure N != 0
   //     c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
     //   d. O/P -> Print the Nth Harmonic Value.

import java.sql.SQLOutput;

public class Harmonic {
    public static void main(String[] args) {
        double n=17;
        double sum = 0;
        if(n != 0) {
            for (int i = 1; i <= n; i++) {
                double a = 1 / n;
                sum = sum + a;
                System.out.println("harmonic results are : "+sum);
            }
        }
        else{
            System.out.println("you should not enter zero");
        }
    }
}
