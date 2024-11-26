package org.example;

import org.example.FactorialCalculator;

import java.math.BigInteger;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FactorialCalculator calculator = new FactorialCalculator();

        // Тестируем программу с n = 10
        try {
            int n = 10;
            List<BigInteger> factorials = calculator.getFirstNFactorials(n);
            System.out.println("Первые " + n + " факториалов:");
            for (BigInteger factorial : factorials) {
                System.out.println(factorial);
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
