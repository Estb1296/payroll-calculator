package com.pluralsight;
import java.util.Scanner;
public class Payroll {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("What is your name");
        String name=input.nextLine();
        System.out.println("How many hours have you worked?");
        float hoursWorked=input.nextFloat();
        System.out.println("What is your pay rate?");
        float payRate=input.nextFloat();

        if(hoursWorked>40){
           float totalPay= ((float)((hoursWorked-40)*(payRate*1.5))+((40*payRate)));
            System.out.printf("%s, your gross pay with overtime is: %.2f",name,totalPay);
        }
        else{
           float totalPay=(((hoursWorked)*(payRate)));
            System.out.printf("%s, your gross pay without overtime is: %.2f",name,totalPay);
        }
    }
}
