package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice;
        int area, base, height, length, width = 0;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Choose a shape: ");
            System.out.println("1. Triangle");
            System.out.println("2. Square");
            System.out.println("3. Rectangle");
            System.out.println("4. Parallelogram");
            choice = in.nextInt();
            if (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
                System.out.println("Invalid answer, please try again.");
            }

        } while (choice != 1 && choice != 2 && choice != 3 && choice != 4);

        switch (choice) {
            case 1:
                System.out.println("You selected: 1. Triangle");
                base = getInput("Enter base: ");
                height = getInput("Enter height");
                area = triArea(base, height);
                System.out.println("The area of a triangle with a base of " + base + " and a height of " + height + " is " + area);
            break;
            case 2:
                System.out.println("You selected: 2. Square");
                length = getInput("Enter length: ");
                area = sqArea(length);
                System.out.println("The area of a square with a side length of " + length + " is " + area);
            break;
            case 3:
                System.out.println("You selected: 3. Rectangle");
                width = getInput("Enter width: ");
                height = getInput("Enter height: ");
                area = recArea(width, height);
                System.out.println("The area of a rectangle with a width of " + width + " and a height of " + height + " is " + area);
            break;
            case 4:
                System.out.println("You selected: 4. Parallelogram");
                base = getInput("Enter base: ");
                height = getInput("Enter height");
                area = parArea(base, height);
                System.out.println("The area of a parallelogram with a base of " + base + " and a height of " + height + " is " + area);
            break;
        }
    }
    private static int getInput(String label){
        int result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(label);
        result = sc.nextInt();
        return result;
    }

    private static int triArea(int base, int height){
        int result = 0;
        result = base * height / 2;
        return result;
    }

    private static int sqArea(int length){
        int result = 0;
        result = length * length;
        return result;
    }

    private static int recArea(int width, int height){
        int result = 0;
        result = width * height;
        return result;
    }

    private static int parArea(int base, int height) {
        int result = 0;
        result = base * height;
        return result;
    }
}
