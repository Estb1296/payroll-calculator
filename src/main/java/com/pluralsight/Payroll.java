package com.pluralsight;
import java.util.Scanner;
public class Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("How many hours have you worked? ");
        float hoursWorked = input.nextFloat();
        System.out.print("What is your pay rate? ");
        float payRate = input.nextFloat();

        grossPay(hoursWorked, payRate, name);
    }

    private static void grossPay(float hoursWorked, float payRate, String name) {
        if(hoursWorked > 40){
           float totalPay = ((hoursWorked - 40)*(payRate * 1.5f)) + (40 * payRate);
           System.out.printf("%s, your gross pay with overtime is: %.2f" , name,totalPay);
        }
        else{
           float totalPay = hoursWorked * payRate;
           System.out.printf("%s, your gross pay without overtime is: %.2f" , name,totalPay);
        }
    }
}
