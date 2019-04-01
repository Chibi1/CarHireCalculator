package model;

import java.util.Scanner;

public class SmegCarHire {
    private final int COST_PER_DAY = 70;
    private final int DISCOUNTED_COST_PER_DAY = 55;
    private final int FOUR_DAYS = 4;
    private final int EIGHT_DAYS = 8;
    private final double DISCOUNT_RATE = 0.9;

    private int numDaysCarHired;
    private double totalCost;

    private Scanner scanner = new Scanner(System.in);

    public void getNumDaysForHire() {
        System.out.print("How many days will the car be hired for? ");
        numDaysCarHired = scanner.nextInt();
        System.out.printf("%s %d\n", "Your number of days hiring the car is:", numDaysCarHired);
        getTotalCost();
    }

    private void getTotalCost() {
        if (numDaysCarHired > EIGHT_DAYS) {
            totalCost = numDaysCarHired*DISCOUNTED_COST_PER_DAY;
        } else if (numDaysCarHired > FOUR_DAYS) {
            totalCost = numDaysCarHired*COST_PER_DAY * DISCOUNT_RATE;
        } else {
            totalCost = numDaysCarHired*COST_PER_DAY;
        }
        System.out.printf("%s $%.2f\n\n", "The total cost of your car hire is:", totalCost);
    }

}
