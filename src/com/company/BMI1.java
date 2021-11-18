package com.company;
import java.util.Scanner;
public class BMI1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Velkommen til BMI-beregneren");

        System.out.print("Hvad vejer du i kilogram? ");
        double weight = input.nextDouble();
        System.out.print("Hvor høj er du i meter? ");
        double height = input.nextDouble();

        double bmi = weight / (height * height);
        System.out.printf("Din BMI er = %5.2f\n", + bmi);

        if (bmi < 18.5) {
            System.out.println("Du er under normalen");
        } else if (bmi < 25) {
            System.out.println("Du har en normal vægt \uD83D\uDC4D");
        } else if (bmi <= 30) {
            System.out.println("Du er over normalen ");
        } else {
            System.out.println("Du er overvægtig, desværre \uD83D\uDE22");
        }
    }
}


