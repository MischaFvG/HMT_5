package com.Catzen;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Homework_number_5");
        System.out.println("Task_1_of_homework_number_5");
        System.out.println("Task 1: create the program which counts quantity of hours, minutes and seconds in days");
        double n;
        Scanner w = new Scanner(System.in);
        System.out.println("Please enter quantity of days");
        n = w.nextDouble();
        System.out.println("Your quantity of days is " + n);
        System.out.println("Quantity of hours in days is " + n * 24);
        System.out.println("Quantity of minutes in days is " + n * 24 * 60);
        System.out.println("Quantity of seconds in days is " + n * 24 * 60 * 60);
        System.out.println("Task_2_of_homework_number_5");
        System.out.println("Task 2: please, create the program which demonstrates methods of string isEmpty, length, charAt, " +
                "contains, trim, valueOf, split, replace");
        System.out.println("Please enter string");
        Scanner v = new Scanner(System.in);
        String s;
        s = v.nextLine();
        System.out.println("Your string is " + s);
        if (s.isEmpty()) {
            System.out.println("Your string is empty");
        } else {
            System.out.println("Length of your string is " + s.length());
            System.out.println("The element of your string is " + s.charAt(s.length() - 1));
            if (s.contains("abcd")) {
                System.out.println("Your string contains abcd");
            } else {
                System.out.println("Your string does not contain abcd");
            }
            s = s.trim();
            System.out.println("You have just deleted spaces of your string " + s);
            int e;
            System.out.println("Please enter number");
            e = w.nextInt();
            System.out.println("Your number is " + e);
            System.out.println("You have just used valueOf on your string " + s + s.valueOf(e));
            String[] sarr = (s + s.valueOf(e)).split("\\s+");
            System.out.println("You have just used split on your string " + Arrays.toString(sarr));
            s = s.replace(s, "abcd");
            System.out.println("You have just changed your string on " + s);
            System.out.println("Your new string is " + s);
        }

        palindrome();

        steps();

        System.out.println("Task_6_of_homework_number_5");
        System.out.println("Task 6: create the program which copies one array into another which is two times bigger then the first");
        Random r = new Random();
        int n1;
        System.out.println("Please enter the size of your array");
        n1 = w.nextInt();
        System.out.println("Size of your array is " + n1);
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = r.nextInt(10);
        }
        System.out.println("Your array is " + Arrays.toString(arr1));
        int[] arr2 = new int[n1 * 2];
        for (int i = 0; i < arr2.length / 2; i++) {
            arr2[i] = arr1[i];
            arr2[arr2.length / 2 + i] = arr1[i];
        }
        System.out.println("Your array is " + Arrays.toString(arr2));
        System.out.println("Task_7_of_homework_number_5");
        System.out.println("Task 7: count the quantity of elements which are bigger then its neighbours from the left side");
        System.out.println("count the quantity of elements which are multiple two");
        System.out.println("count the quantity of elements which are less then arithmetical mean of array");
        int[] arrt = new int[10];
        for (int i = 0; i < arrt.length; i++) {
            arrt[i] = r.nextInt(10);
        }
        System.out.println("Your array is " + Arrays.toString(arrt));
        int k1 = 0;
        int k2 = 0;
        int k3 = 0;
        int sumOfArrayT = 0;
        double arMeanT;
        for (int i = 0; i < arrt.length; i++) {
            sumOfArrayT = sumOfArrayT + arrt[i];
        }
        arMeanT = (double) sumOfArrayT / (double) arrt.length;
        System.out.println("Arithmetical mean of the array is " + arMeanT);
        for (int i = 1; i < arrt.length; i++) {
            if (arrt[i] > arrt[i - 1]) {
                k1 = k1 + 1;
            }
        }
        for (int i = 0; i < arrt.length; i++) {
            if (arrt[i] % 2 == 0) {
                k2 = k2 + 1;
            }
            if (arrt[i] < arMeanT) {
                k3 = k3 + 1;
            }
        }
        System.out.println("Quantity of elements which are bigger then its neighbours from the left side is " + k1);
        System.out.println("Quantity of elements which are multiple two is " + k2);
        System.out.println("Quantity of elements which are less then arithmetical mean of array is " + k3);

        triangles();

        System.out.println("Task_8_of_homework_number_5");
        System.out.println("Task 8: create method which calculates sqrt of number by method of dichotomy");
        double b;
        System.out.println("Please enter number");
        b = w.nextDouble();
        System.out.println("Your number is " + b);
        System.out.println("Sqrt from number " + b + " is " + numberSqrt(b));
    }

    public static double numberSqrt(double b) {
        double a = 0;
        double number = b;
        double t;
        t = (a + b) / 2;
        while (Math.abs(t * t - number) > 0.00001) {
            if (t * t > number) {
                b = t;
            } else if (t * t < number) {
                a = t;
            }
            t = (a + b) / 2;
        }
        return t;
    }

    public static void steps() {
        System.out.println("Task_4_of_homework_number_5");
        System.out.println("Task 4: you play in game steps");
        System.out.println("Please count how much you have caught up");
        System.out.println("Please count all time of game");
        Scanner w = new Scanner(System.in);
        final int TIME = 5;
        int N;
        System.out.println("Please enter the quantity of steps");
        N = w.nextInt();
        System.out.println("The quantity of steps is " + N);
        double sum = 0;
        double timeSum = 0;
        double breakTime = 60;
        double t;
        for (int i = 1; i <= N; i++) {
            sum = sum + i;
            t = i * TIME + breakTime;
            System.out.println("The summary time of " + i + " steps is " + t);
            timeSum = timeSum + t;
            breakTime = breakTime * 1.2;
            System.out.println("Break time of " + i + " steps is " + breakTime);
        }
        System.out.println("All time of steps is " + timeSum);
        System.out.println("All time of steps is (mm:ss) " + timeSum / 60);

    }

    public static void triangles() {
        System.out.println("Task_7.1_of_homework_number_5");
        System.out.println("Task 7.1: count the quantity of areas of triangles which areas are less then 100");
        System.out.println("In this task I used Heron's method");
        Scanner w = new Scanner(System.in);
        int nTriangle;
        double aTriangle;
        double bTriangle;
        double cTriangle;
        double sTriangleGeron;
        double pTriangle;
        double kTriangle = 0;
        System.out.println("Please enter quantity of triangles");
        nTriangle = w.nextInt();
        System.out.println("Your quantity of triangles is " + nTriangle);
        for (int i = 1; i <= nTriangle; i++) {
            System.out.println("Please enter first side of triangle");
            aTriangle = w.nextInt();
            System.out.println("First side of " + i + " triangle is " + aTriangle);
            System.out.println("Please enter second side of triangle");
            bTriangle = w.nextInt();
            System.out.println("Second side of " + i + " triangle is " + bTriangle);
            System.out.println("Please enter third side of triangle");
            cTriangle = w.nextInt();
            System.out.println("Third side of " + i + " triangle is " + cTriangle);
            pTriangle = ((aTriangle + bTriangle + cTriangle) / 2);
            System.out.println("Half-meter of " + i + " triangle is " + pTriangle);
            sTriangleGeron = (Math.sqrt(pTriangle * (pTriangle - aTriangle) * (pTriangle - bTriangle) * (pTriangle - cTriangle)));
            System.out.println("Area of " + i + " triangle is " + sTriangleGeron);
            if (sTriangleGeron < 100) {
                kTriangle = kTriangle + 1;
            }
        }
        System.out.println("Quantity of areas of triangles which are less then 100 is " + kTriangle);
    }

    public static void palindrome() {
        System.out.println("Task_3_of_homework_number_5");
        System.out.println("Task 3: Is the string palindrome?");
        Scanner s = new Scanner(System.in);
        String string;
        System.out.println("Please enter string");
        string = s.nextLine();
        System.out.println("Your string is " + string);
        StringBuilder str = new StringBuilder(string);
        str.reverse();
        String string1 = str.toString();
        if (string.equals(string1)) {
            System.out.println("Your string is palindrome");
        } else {
            System.out.println("Your string is not palindrome");
        }

    }
}
