package com.maxlogic;

import com.maxlogic.geometric.Circunference;
import com.maxlogic.geometric.GeometricShape;

import java.util.*;

public class Main {
    private static float average() {
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter numbers or press X to exit: ");
        while (true) {
            System.out.print("\tEnter the number: ");
            Scanner sc = new Scanner(System.in);
            String invalue = sc.nextLine();
            if (invalue.equalsIgnoreCase("X"))
                break;
            numbers.add(Integer.parseInt(invalue));
        }
        Float sum = 0f;
        for (int i = 0; i < numbers.size(); i++)
            sum += numbers.get(i);
        float average = sum / numbers.size();
        return average;
    }

    private static double product() {
        List<Double> realNumbers = new ArrayList<>();

        System.out.println("Enter real numbers or press X to exit: ");
        while (true) {
            System.out.print("\tEnter the number: ");
            Scanner sc = new Scanner(System.in);
            String invalue = sc.nextLine();
            if (invalue.equalsIgnoreCase("X"))
                break;
            realNumbers.add(Double.parseDouble(invalue));
        }
        double prod = 1;

        for (int i = 0; i < realNumbers.size(); i++)
            prod *= realNumbers.get(i);
        return prod;

    }

    private static Circunference getCircumference() {
        float ratio = 0;
        while (true) {
            System.out.print("Enter the ratio of the circumference: ");
            Scanner sc = new Scanner(System.in);
            try {
                ratio = sc.nextFloat();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Must enter a real number ");
            }
        }
        return new Circunference(ratio);
    }

    private static boolean multipleOf() {
        boolean result = true;
        float dividend = 0;

        List<Float> divisor = new ArrayList<>();
        while (true) {
            System.out.print("Enter the dividend: ");
            Scanner sc = new Scanner(System.in);
            try {
                dividend = sc.nextFloat();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Must enter a real number ");
            }
        }

        while (true) {
            System.out.print("Enter the divisors. press x to finish: ");
            Scanner sc = new Scanner(System.in);
            String divisorString = sc.nextLine();
            if (divisorString.equalsIgnoreCase("X"))
                break;
            try {
                divisor.add(Float.parseFloat(divisorString));
            } catch (NumberFormatException e) {
                System.out.println("Must enter a real number ");
            }
        }

        for (int i = 0; i < divisor.size(); i++) {
            if ((dividend % divisor.get(i)) == 0)
                System.out.println("the number " + dividend + " is multiple of " + divisor.get(i));
            else {
                System.out.println("the number " + dividend + " isn't multiple of " + divisor.get(i));
                result = false;
            }
        }

        return result;
    }

    private static String reverseString(String in) {
        String out = "";
        for (int i = in.length() - 1; i >= 0; i--) {
            out += in.charAt(i);
        }
        return out;
    }

    private static int reverseNumber(int number) {
        int rev = 0;
        while (number != 0) {
            int digit = number % 10;
            rev = rev * 10 + digit;
            number = number / 10;
        }
        return rev;
    }

    private static double geometricMeanLog() {
        List<Double> values = new ArrayList<>();
        while (true) {
            System.out.println("Enter number, press 'X' if finish: ");
            Scanner sc = new Scanner(System.in);
            String value = sc.nextLine();
            if (value.equalsIgnoreCase("x"))
                break;
            try {
                values.add(Double.valueOf(value));
            } catch (NumberFormatException e) {
                System.out.println("Please enter an double value!!!");
            }
        }
        double lnSumValue = values.stream().reduce(0.0, (ans, i) -> ans + Math.log(i));
        return Math.exp((1.0 / values.size()) * lnSumValue);

    }

    private static double geometricMean() {
        List<Double> values = new ArrayList<>();
        while (true) {
            System.out.println("Enter number, press 'X' if finish: ");
            Scanner sc = new Scanner(System.in);
            String value = sc.nextLine();
            if (value.equalsIgnoreCase("x"))
                break;
            try {
                values.add(Double.valueOf(value));
            } catch (NumberFormatException e) {
                System.out.println("Please enter an double value!!!");
            }
        }
        double sumValue = values.stream().reduce(1.0, (ans, i) -> ans * i);
        return Math.pow(sumValue, 1.0 / values.size());

    }

    private static int sumOfDigits() {
        int sum = 0;
        System.out.println("Enter an integer number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int digit = number;

        while (digit != 0) {
            sum += digit % 10;
            digit = digit / 10;
        }
        return sum;
    }

    private static String multipleOfThree(int init, int end){
        String multiples;
        Set<String> multiplesSet = new HashSet<>();

        for ( int i=init; i<= end; i++){
            if ( i%3 == 0) multiplesSet.add(String.valueOf(i));
        }
        multiples = multiplesSet.stream().sorted().reduce("",(ans,i) -> ans.length() > 0 ? ans + ", " + i : ans + i);
        return multiples;
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("Select the assesment to execute.");
            System.out.println("\t  1. Java program to find out the average of a set of integers");
            System.out.println("\t  2. Java program to find the product of a set of real numbers");
            System.out.println("\t  3. Java program to find the circumference and area of a circle with a given radius");
            System.out.println("\t  4. Java program to check whether the given integer is a multiple of 5");
            System.out.println("\t  5. Java program to check whether the given integer is a multiple of a set of numbers");
            System.out.println("\t  6. Java program to find the average of 5 numbers using a while loop");
            System.out.println("\t  7. Java program to display the given integer in the reverse order");
            System.out.println("\t  11. Java program to find the geometric mean of n numbers");
            System.out.println("\t  12. Java program to find the sum of the digits of an integer using a while loop");
            System.out.println("\t  13. Java program to display all the multiples of 3 within the range 10 to 50");

            System.out.println("\t 46. Exit");
            Scanner sc = new Scanner(System.in);
            String optString = sc.nextLine();
            int opt = 0;
            try {
                opt = Integer.parseInt(optString);
            } catch (NumberFormatException e) {
                System.out.println("Only numbers are accepted");
            }
            if (opt == 46)
                break;

            switch (opt) {
                case 1:
                    float avr = average();
                    System.out.println("the average of the numers is " + avr);
                    break;
                case 2:
                    double prd = product();
                    System.out.println("the product of the real numbers is " + prd + "\n");
                    break;
                case 3:
                    GeometricShape circ = getCircumference();
                    System.out.println("the perimeter of the circumference is  " + circ.perimeter());
                    System.out.println("the area of the circumference is " + circ.area() + "\n");
                    break;
                case 4:
                case 5:
                    multipleOf();
                    break;
                case 6:
                    System.out.println("Not implemented yet");
                    break;
                case 7:
                    System.out.println("Enter a number");
                    sc = new Scanner(System.in);
                    System.out.println(reverseNumber(sc.nextInt()));
                    break;
                case 11:
                    System.out.println("The Geometric mean is: " + geometricMeanLog());
                    break;
                case 12:
                    System.out.println("The sum of the digits of an integer is: " + sumOfDigits());
                    break;
                case 13:
                    System.out.println("the multiple of 3 in the range of 10 to 50 is : " + multipleOfThree(10,50));
                    break;

            }
        }
    }
}