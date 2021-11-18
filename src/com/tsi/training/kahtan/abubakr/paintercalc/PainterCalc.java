package com.tsi.training.kahtan.abubakr.paintercalc;

import java.util.Scanner;

public class PainterCalc {

        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            int painterInput;
            int wallCoverage[];
            int numberOfWalls;
            int coveragePerHalfCan = 52;   // How much Sqft is covered by a 500mL Can of paint
            int mlPerCan;
            int numOfCans;
            int coveragePerCan;
            int i = 0;

            //System.out.println("What is the Sqft measurement of coverage you need?: ");
            //painterInput = scan.nextInt();       // Value to be replaced by scanner
            System.out.println("How many walls would you like to paint?:");
            numberOfWalls = scan.nextInt();
            while (i < numberOfWalls) {

                int wallLength;
                int wallHeight;
                

                System.out.println("what is the height of the wall?:");
                wallHeight = scan.nextInt();
                System.out.println("what is the length of the wall?:");
                wallLength = scan.nextInt();

            }

            System.out.println("How many ml is in per can you will be using?:");
            mlPerCan = scan.nextInt();

            painterInput =
            coveragePerCan = (int)(coveragePerHalfCan*(mlPerCan/500));
            numOfCans = painterInput / coveragePerCan;


            if(painterInput%coveragePerCan > 0){
                numOfCans++;
                System.out.println("The number of 1L cans the painter needs for this coverage is: " + numOfCans + ", and you will have leftover paint");
            }
            else{
                System.out.println("The number of 1L cans the painter needs for this coverage is: " + numOfCans);
            }
       }
}
