package dev.damian_szmigielski;

public class Task1FizzBuzz {
    public static void main(String[] args) {
        boolean FizzBuzz = true;
        while (FizzBuzz) {
            for (int number = 1; number <= 100; number++) {
                if (number % 3 == 0 && number % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (number % 5 == 0) {
                    System.out.println("Buzz");
                } else if (number % 3 == 0) {
                    System.out.println("Fizz");
                } else {
                    System.out.println(number);
                    
                }

            }
        }
    }
}


