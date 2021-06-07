package ex13;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Juan Nicora
 */

/*
Exercise 13 - Determining Compound Interest
Simple interest is something you use only when making a quick guess. Most investments use a compound interest formula, which will be much more accurate. And this formula requires you to incorporate exponents into your programs.

Write a program to compute the value of an investment compounded over time. The program should ask for the starting amount, the number of years to invest, the interest rate, and the number of periods per year to compound.

The formula you’ll use for this is A = P(1 + r/n)^(n*t) where

P is the principal amount.
r is the annual rate of interest.
t is the number of years the amount is invested.
n is the number of times the interest is compounded per year.
A is the amount at the end of the investment.

Example Output
What is the principal amount? 1500
What is the rate? 4.3
What is the number of years? 6
What is the number of times the interest is compounded per year? 4
$1500 invested at 4.3% for 6 years compounded 4 times per year is $1938.84.

Constraints
Prompt for the rate as a percentage (like 15, not .15). Divide the input by 100 in your program.
Ensure that fractions of a cent are rounded up to the next penny.
Ensure that the output is formatted as money.
 */

import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        int principal = in.nextInt();

        System.out.print("What is the rate? ");
        double rate = in.nextDouble();

        System.out.print("What is the number of years? ");
        int years = in.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        double compounded = in.nextDouble();

        double inv = Math.round(((Math.pow(principal * ( 1 + ((rate / 100) / compounded)), (compounded * years)))*100)/100);

        System.out.println("$" + principal + " invested at " + rate + "% for " + years + " years compounded " + compounded + " times per year is $" + inv);
    }
}
