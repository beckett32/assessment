package com.maxlogic;

import com.maxlogic.geometric.Circunference;
import com.maxlogic.geometric.GeometricShape;

import java.util.*;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";


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
        float sum = 0f;
        for (int i : numbers)
            sum += i;
        return sum / numbers.size();
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

        for (Double realNumber : realNumbers)
            prod *= realNumber;
        return prod;

    }

    private static Circunference getCircumference() {
        float ratio;
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

    private static void multipleOf() {
        float dividend;

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

        for (Float aFloat : divisor) {
            if ((dividend % aFloat) == 0)
                System.out.println("the number " + dividend + " is multiple of " + aFloat);
            else {
                System.out.println("the number " + dividend + " isn't multiple of " + aFloat);
            }
        }

    }

    /*private  static String reverseString(String in) {
        String out = "";
        for (int i = in.length() - 1; i >= 0; i--) {
            out += in.charAt(i);
        }
        return out;
    }*/

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

        List<Double> values = geometricMeanUI();
        double lnSumValue = values.stream().reduce(0.0, (ans, i) -> ans + Math.log(i));
        return Math.exp((1.0 / values.size()) * lnSumValue);

    }

    private static List<Double> geometricMeanUI() {
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
        return values;
    }

    /*private static double geometricMean() {
        List<Double> values = geometricMeanUI();
        double sumValue = values.stream().reduce(1.0, (ans, i) -> ans * i);
        return Math.pow(sumValue, 1.0 / values.size());

    }*/

    private static int sumOfDigits() {
        int sum = 0;
        System.out.println("Enter an integer number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }

    private static String multipleOfThree(int init, int end) {
        String multiples;
        Set<String> multiplesSet = new HashSet<>();

        for (int i = init; i <= end; i++) {
            if (i % 3 == 0)
                multiplesSet.add(String.valueOf(i));
        }
        multiples = multiplesSet.stream().sorted().reduce("", (ans, i) -> ans.length() > 0 ? ans + ", " + i : ans + i);
        return multiples;
    }

    private static boolean linearSearch(String itemToSearch, List<String> items) {
        return items.stream().anyMatch(item -> item.equalsIgnoreCase(itemToSearch));
    }

    private static boolean isEvenSumDigit(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum % 2 == 0;
    }

    private static boolean isPrime(int number){
        boolean isprime =true;
        for ( int i=2; i<=number/2; i++){
            if ( !(isprime = number %i != 0)) break;
        }
        return isprime;
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println(ANSI_BLUE + "Select the assesment to execute." + ANSI_RESET);
            System.out.println(ANSI_RED + "\t  1. Java program to find out the average of a set of integers");
            System.out.println("\t  2. Java program to find the product of a set of real numbers");
            System.out.println("\t  3. Java program to find the circumference and area of a circle with a given radius");
            System.out.println("\t  4. Java program to check whether the given integer is a multiple of 5");
            System.out.println("\t  5. Java program to check whether the given integer is a multiple of a set of numbers");
            System.out.println("\t  6. Java program to find the average of 5 numbers using a while loop");
            System.out.println("\t  7. Java program to display the given integer in the reverse order");
            System.out.println("\t  11. Java program to find the geometric mean of n numbers");
            System.out.println("\t  12. Java program to find the sum of the digits of an integer using a while loop");
            System.out.println("\t  13. Java program to display all the multiples of 3 within the range 10 to 50");
            System.out.println("\t  14. Java program to display all integers within the range 100-150 whose sum of digits is an even number");
            System.out.println("\t  15. Java program to check whether the given integer is a prime number or not");
            System.out.println("\t  21. Java program to implement linear search" );
            System.out.println("\t  46. Exit"+ ANSI_RESET);
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
                case 1 -> {
                    float avr = average();
                    System.out.println("the average of the numers is " + avr);
                }
                case 2 -> {
                    double prd = product();
                    System.out.println("the product of the real numbers is " + prd + "\n");
                }
                case 3 -> {
                    GeometricShape circ = getCircumference();
                    System.out.println("the perimeter of the circumference is  " + circ.perimeter());
                    System.out.println("the area of the circumference is " + circ.area() + "\n");
                }
                case 4, 5 -> multipleOf();
                case 6 -> System.out.println("Not implemented yet");
                case 7 -> {
                    System.out.println("Enter a number");
                    sc = new Scanner(System.in);
                    System.out.println(reverseNumber(sc.nextInt()));
                }
                case 11 -> System.out.println("The Geometric mean is: " + geometricMeanLog());
                case 12 -> System.out.println("The sum of the digits of an integer is: " + sumOfDigits());
                case 13 -> System.out.printf("the multiple of 3 in the range of 10 to 50 is : %s%n", multipleOfThree(10, 50));
                case 14 -> {
                    for (int i = 100; i <= 150; i++) {
                        if (isEvenSumDigit(i))
                            System.out.println(i);
                    }
                }case 15 -> {
                    int number = 0;
                    while(true) {
                        System.out.println("Enter a number");
                        try {
                            number = sc.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("You need to enter a number!!");
                        }
                    }
                    if (isPrime(number))
                        System.out.printf("El número %s es primo %n",number);
                    else
                        System.out.printf("El número %s no es primo %n",number);

                }
                case 21 -> {
                    List<String> items = new ArrayList<>();
                    while (true) {
                        System.out.println("Enter existent value. for finish press X: ");
                        String item = sc.nextLine();
                        if (item.equalsIgnoreCase("x"))
                            break;
                        items.add(item);
                    }
                    System.out.println("Ingrese el item a buscar: ");
                    String itemToSearch = sc.nextLine();
                    if (linearSearch(itemToSearch, items))
                        System.out.println("the value '" + itemToSearch + "' exist");
                    else
                        System.out.println("the value '" + itemToSearch + "' not exist");
                }
            }
        }
    }
}