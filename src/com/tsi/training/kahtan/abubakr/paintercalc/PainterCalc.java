package com.tsi.training.kahtan.abubakr.paintercalc;

import java.util.Scanner;
import java.util.Arrays;

public class PainterCalc {

        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            int totalWallCoverage = 0;
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
                case "y" -> {
                    System.out.println("How many walls would you like to paint?:");
                    numberOfWalls = scan.nextInt();
                    System.out.println("How many ml is in per can you will be using?:");
                    mlPerCan = scan.nextInt();
                    int[] wallCoverageArr = new int[numberOfWalls];

                    /* Same code as bellow but in a for loop:
                       for(i = 0; i < numberOfWalls; i++){
                        int wallLength = 0;
                        int wallHeight = 0;

                        System.out.println("what is the height in ft of wall number " + i + " ?:");
                        wallHeight = scan.nextInt();

                        System.out.println("what is the length in ft of wall number " + i + "?:");
                        wallLength = scan.nextInt();

                        wallCoverage = wallCoverage + (wallHeight*wallLength); //Adds the Sq-ft per wall onto the current total.
                       }
                    */

                    while (i < numberOfWalls) {

                        int wallLength;
                        int wallHeight;

                        System.out.println("what is the height in ft of wall number " + (i + 1) + " ?:");
                        wallHeight = scan.nextInt();

                        System.out.println("what is the length in ft of wall number " + (i + 1) + "?:");
                        wallLength = scan.nextInt();

                        wallCoverageArr[i] = wallHeight * wallLength;
                        totalWallCoverage = totalWallCoverage + (wallHeight * wallLength); //Adds the Sq-ft per wall onto the current total.
                        i++;

                    }
                    System.out.println("This is the breakdown of how many Sq-ft each wall is: " + Arrays.toString(wallCoverageArr));

                    coveragePerCan = (coveragePerHalfL * (mlPerCan / 500));
                    numOfCans = totalWallCoverage / coveragePerCan;
                    System.out.println("The total Sq-ft you need to paint is: " + totalWallCoverage);
                    if (totalWallCoverage % coveragePerCan > 0) {
                        numOfCans++;
                        System.out.println("The number of chosen size cans the painter needs for this coverage is: " + numOfCans + ", and you will have leftover paint");
                    } else {
                        System.out.println("The number of chosen size cans the painter needs for this coverage is: " + numOfCans);
                    }
                    System.out.println("Thank you for using my paint calculator! :D");
                }
                case "n" -> {
                    System.out.println("We will now stop and exit the program!");
                    System.out.println("Thank you for not using my paint calculator :(");
                }
                default -> {
                    System.out.println("Sorry Wrong Answer!.....");
                    System.out.println("Try Again!..............");
                }
            }

       }
}
