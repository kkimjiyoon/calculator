package com.nhnacademy.practice;

import java.util.Scanner;

public class Main {
    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static int subtract(int number1, int number2) {
        return number1 - number2;
    }

    public static int multiply(int number1, int number2) {
        return number1 * number2;
    }

    public static int divide(int number1, int number2) {
        if(number2 == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return number1 / number2;
    }

    public static void main(String[] args) {

        System.out.println("수식을 입력해주세요:");

        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        char operator = sc.next().charAt(0);
        int number2 = sc.nextInt();

        int result = 0;

        switch (operator) {
            case '+':
                result = add(number1, number2);
                break;
            case '-':
               result = subtract(number1, number2);
                break;
            case '*':
                result = multiply(number1, number2);
                break;
            case '/':
                result = divide(number1, number2);
                break;
        }

        System.out.println("result: " + result);
        sc.close();
    }
}
