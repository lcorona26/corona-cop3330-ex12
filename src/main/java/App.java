/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Luis Corona
 */
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();
        String principal = app.readPrincipal();
        String interestRate = app.readInterest();
        String years = app.readYears();
        float calc = app.Calc(principal, interestRate, years);
        app.printOutput(interestRate, years, calc);
    }

    private void printOutput(String interestRate, String years, float calc) {
        String message = String.format("After %s years at %s%%, the investment will be worth $%.2f.", years, interestRate, calc);
        System.out.print(message);
    }

    private float Calc(String principal, String interestRate, String years) {
        int principleInt = Integer.parseInt(principal);
        float interestToInt = Float.parseFloat(interestRate) / 100;
        int yearsToInt = Integer.parseInt(years);
        float calc = Math.round((1 +(interestToInt * yearsToInt)) * (principleInt));
        return calc;
    }

    private String readPrincipal() {
        System.out.print("Enter the principal: ");
        String principal = in.nextLine();
        return principal;
    }

    private String readInterest() {
        System.out.print("Enter the rate of interest: ");
        String interest = in.nextLine();
        return interest;
    }

    private String readYears() {
        System.out.print("Enter the number of years: ");
        String years = in.nextLine();
        return years;
    }


}
