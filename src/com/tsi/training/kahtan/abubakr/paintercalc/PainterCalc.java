package com.tsi.training.kahtan.abubakr.paintercalc;

import java.util.Scanner;
import java.util.Arrays;

public class PainterCalc {

        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            int wallCoverage = 0; //This is an array of all the wall sizes in Sq-ft
            int coveragePerHalfL = 52;   // How much Sq-ft is covered by a 500mL Can of paint
            int numberOfWalls;
            int mlPerCan;
            int numOfCans;
            int coveragePerCan;
            int i = 0;
            String userIn;


            //Switch statement here to enter the whole calculator?
            System.out.println("Would you like to use the Painter Calculator? (y/n):");
            userIn = scan.nextLine();

            switch (userIn) {
                case "y":

                    System.out.println("How many walls would you like to paint?:");
                    numberOfWalls = scan.nextInt();

                    System.out.println("How many ml is in per can you will be using?:");
                    mlPerCan = scan.nextInt();

                    while (i < numberOfWalls) {

                        int wallLength = 0;
                        int wallHeight = 0;
                        i++;

                        System.out.println("what is the height in ft of wall number " + i + " ?:");
                        wallHeight = scan.nextInt();

                        System.out.println("what is the length in ft of wall number " + i + "?:");
                        wallLength = scan.nextInt();

                        wallCoverage = wallCoverage + (wallHeight*wallLength); //Adds the Sq-ft per wall onto the current total.
                    }

                    coveragePerCan = (int)(coveragePerHalfL*(mlPerCan/500));
                    numOfCans = wallCoverage / coveragePerCan;

                    System.out.println("The total Sq-ft you need to paint is: " + wallCoverage);

                    if(wallCoverage%coveragePerCan > 0){
                        numOfCans++;
                        System.out.println("The number of chosen size cans the painter needs for this coverage is: " + numOfCans + ", and you will have leftover paint");
                    }
                    else {
                        System.out.println("The number of chosen size cans the painter needs for this coverage is: " + numOfCans);
                    }

                    break;
                case "n":
                    System.out.println("We will now stop the program!");
                    break;
            }

       }
}
