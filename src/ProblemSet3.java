/**
 * Problem Set 3.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * conditional control structures. It's also your first introduction to methods,
 * so things look a little different. The main method is done for you. Lines 31-40
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

// Copyright (c) 2019. UCVTS and its affiliated.

import java.util.Scanner;

public class ProblemSet3 {
    double gpa;
    String rank;
    String suit;
    char thirdCharacter;
    double paycheck;
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ProblemSet3 ps = new ProblemSet3();

        // comment out or uncomment as needed

        ps.sign(); // executes Exercise 1
        ps.parity(); // executes Exercise 2
        ps.ordered(); // executes Exercise 3
        ps.gpa(); // executes Exercise 4
        ps.grade(); // executes Exercise 5
        ps.cards(); // executes Exercise 6
        ps.leapYear(); // executes Exercise 7
        ps.state(); // executes Exercise 8
        ps.months(); // executes Exercise 9
        ps.salary(); // executes Exercise 10

        in .close();
    }

    /*
     * Exercise 1.
     *
     * Prompt the user to enter an integer. Is it positive, negative, or zero?
     */

    public void sign() {

        System.out.print("\nEnter an integer: ");
        int integerToTest = in .nextInt();

        if (integerToTest < 0) {
            System.out.println("\nNegative.\n");
        } else if (integerToTest == 0) {
            System.out.println("\nZero. Neither negative nor positive.\n");
        } else {
            System.out.println("\nPositive.\n");
        }
    }

    /*
     * Exercise 2.
     *
     * Prompt the user to enter an integer. Is it even or odd?
     */

    public void parity() {

        System.out.print("Enter an integer: ");
        int integerToTest = in .nextInt();

        if (integerToTest % 2 == 0) {
            System.out.println("\nEven.\n");
        } else {
            System.out.println("\nOdd.\n");
        }
    }

    /*
     * Exercise 3.
     *
     * Prompt the user to enter three integers. How are the integers ordered?
     */

    public void ordered() {
        System.out.println("Enter three integers.\n");
        System.out.print("Enter integer: ");
        int firstInteger = in .nextInt();
        System.out.print("Enter integer: ");
        int secondInteger = in .nextInt();
        System.out.print("Enter integer: ");
        int thirdInteger = in .nextInt();

        if (firstInteger < secondInteger && secondInteger < thirdInteger) {
            System.out.println("\nStrictly increasing.");
        } else if (firstInteger <= secondInteger && secondInteger <= thirdInteger) {
            System.out.println("\nIncreasing.");
        } else if (firstInteger > secondInteger && secondInteger > thirdInteger) {
            System.out.println("\nStrictly decreasing.");
        } else if (firstInteger >= secondInteger && secondInteger >= thirdInteger) {
            System.out.println("\nDecreasing.");
        } else {
            System.out.println("\nUnordered.");
        }
    }

    /*
     * Exercise 4.
     *
     * Prompt the user to enter a letter grade. What's the corresponding GPA?
     */

    public void gpa() {

        System.out.print("\nEnter a letter grade: "); in .nextLine();
        String grade = in .nextLine();
        grade = grade.toUpperCase();

        if (grade.charAt(0) == 'A') {
            gpa = 4.00;
        } else if (grade.charAt(0) == 'B') {
            gpa = 3.00;
        } else if (grade.charAt(0) == 'C') {
            gpa = 2.00;
        } else if (grade.charAt(0) == 'D') {
            gpa = 1.00;
        } else if (grade.charAt(0) == 'F') {
            gpa = 0.00;
            System.out.printf("\nYour GPA is %.2f", gpa);
            System.out.print(".\n");
            return;
        }

        if (grade.length() == 2) {
            if (grade.charAt(1) == '+' && (grade.charAt(0) != 'F' || grade.charAt(0) != 'f')) {
                gpa += 0.33;
            } else if (grade.charAt(1) == '-' && (grade.charAt(0) != 'F' || grade.charAt(0) != 'f')) {
                gpa -= 0.33;
            }
        }

        System.out.printf("\nYour GPA is %.2f", gpa);
        System.out.print(".\n");
    }

    /*
     * Exercise 5.
     *
     * Prompt the user to enter a grade. What's the corresponding letter grade?
     */

    public void grade() {
        System.out.print("\nEnter a grade: ");
        double grade = in .nextDouble(); in .nextLine();

        if (grade > 100) {
            System.out.println("\nGrades above 100 are invalid.");
        } else if (grade < 0) {
            System.out.println("\nGrades below 0 are invalid.");
        } else if (grade <= 100 && grade >= 90) {
            System.out.println("\nYou received an A.");
        } else if (grade < 90 && grade >= 80) {
            System.out.println("\nYou received a B.");
        } else if (grade < 80 && grade >= 70) {
            System.out.println("\nYou received a C.");
        } else if (grade < 70 && grade >= 60) {
            System.out.println("\nYou received a D.");
        } else {
            System.out.println("\nYou received an F.");
        }
    }

    /*
     * Exercise 6.
     *
     * Prompt the user to enter a playing card. What card was entered?
     */

    public void cards() {
        System.out.print("\nEnter a card: ");
        String card = in .nextLine();
        card = card.toUpperCase();
        char firstCharacter = card.charAt(0);
        char secondCharacter = card.charAt(1);
        if (card.length() == 3) {
            thirdCharacter = card.charAt(2);
        }


        if (firstCharacter == 'A') {
            rank = "Ace";
        } else if (firstCharacter == 'K') {
            rank = "King";
        } else if (firstCharacter == 'Q') {
            rank = "Queen";
        } else if (firstCharacter == 'J') {
            rank = "Jack";
        } else if (firstCharacter == '1') {
            rank = "Ten";
        } else if (firstCharacter == '9') {
            rank = "Nine";
        } else if (firstCharacter == '8') {
            rank = "Eight";
        } else if (firstCharacter == '7') {
            rank = "Seven";
        } else if (firstCharacter == '6') {
            rank = "Six";
        } else if (firstCharacter == '5') {
            rank = "Five";
        } else if (firstCharacter == '4') {
            rank = "Four";
        } else if (firstCharacter == '3') {
            rank = "Three";
        } else if (firstCharacter == '2') {
            rank = "Two";
        }

        if (secondCharacter == 'C' || thirdCharacter == 'C') {
            suit = "Clubs";
        } else if (secondCharacter == 'D' || thirdCharacter == 'D') {
            suit = "Diamonds";
        } else if (secondCharacter == 'H' || thirdCharacter == 'H') {
            suit = "Hearts";
        } else if (secondCharacter == 'S' || thirdCharacter == 'S') {
            suit = "Spades";
        }

        System.out.println("\n" + rank + " of " + suit + ".");

    }

    /*
     * Exercise 7.
     *
     * Prompt the user to enter a year. Is it a leap year or not?
     */

    public void leapYear() {
        System.out.print("\nEnter a year: ");
        int year = in .nextInt();

        while (year < 0) {
            System.out.print("\nInvalid entry. Enter a year greater than 0: ");
            year = in .nextInt();
        }

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("\n" + year + " is a leap year.");
        } else {
            System.out.println("\n" + year + " is not a leap year.");
        }
    }

    /*
     * Exercise 8.
     *
     * Prompt the user to enter a temperature. At that temperature, is water a solid,
     * liquid, or gas?
     */

    public void state() {
        System.out.print("\nEnter a temperature: ");
        double temperature = in .nextDouble();
        System.out.print("Enter a scale: ");
        char scale = in .next().charAt(0);
        scale = Character.toUpperCase(scale);

        final int FAH_FREEZE_PT = 32;
        final int FAH_BOIL_PT = 212;
        final int CEL_FREEZE_PT = 0;
        final int CEL_BOIL_PT = 100;

        if (scale != 'F' && scale != 'C') {
            System.out.println("\nThat's not a valid scale.");
        } else if (scale == 'F') {
            if (temperature <= FAH_FREEZE_PT) {
                System.out.println("\nSolid.");
            } else if (temperature > FAH_FREEZE_PT && temperature < FAH_BOIL_PT) {
                System.out.println("\nLiquid.");
            } else if (temperature >= FAH_BOIL_PT) {
                System.out.println("\nGas.");
            }
        } else if (scale == 'C') {
            if (temperature <= CEL_FREEZE_PT) {
                System.out.println("\nSolid.");
            } else if (temperature > CEL_FREEZE_PT && temperature < CEL_BOIL_PT) {
                System.out.println("\nLiquid.");
            } else if (temperature >= CEL_BOIL_PT) {
                System.out.println("\nGas.");
            }
        }

    }

    /*
     * Exercise 9.
     *
     * Prompt the user to enter a month. How many days are in that month?
     */

    public void months() { in .nextLine();
        System.out.print("\nEnter a month: ");
        String month = in .nextLine();

        month = month.toLowerCase();
        if (month.equals("january") || month.equals("march") || month.equals("may") || month.equals("july") || month.equals("august") || month.equals("october") || month.equals("december")) {
            System.out.println("\n31 days.");
        } else if (month.equals("april") || month.equals("june") || month.equals("september") || month.equals("november")) {
            System.out.println("\n30 days.");
        } else if (month.equals("february")) {
            System.out.println("\n28 or 29 days.");
        } else {
            System.out.println("\nThat's not a valid month.");
        }
    }

    /*
     * Exercise 10.
     *
     * Prompt the user to enter a wage and hours worked. How much money will be made?
     */

    public void salary() {
        System.out.print("\nWage: ");
        double wage = in .nextDouble();
        while (wage < 0.01) {
            System.out.println("Invalid entry. Enter a wage greater than 0: ");
        }
        System.out.print("Hours: ");
        double hours = in .nextDouble();
        while (hours < 0) {
            System.out.println("Invalid entry. Enter a number of hours greater than 0: ");
        }

        double overtime = hours - 40;

        if (overtime > 0) {
            hours = 40;
            double overtimePay = overtime * (1.5 * wage);
            paycheck = (wage * hours) + overtimePay;
        } else if (overtime <= 0) {
            paycheck = wage * hours;
        }

        System.out.printf("\nYou'll make $%,.2f", paycheck);
        System.out.print(" this week.\n\n");

    }
}
