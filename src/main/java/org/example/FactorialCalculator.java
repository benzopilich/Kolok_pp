package org.example;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FactorialCalculator {
    // Метод для вычисления первых n факториалов
    public List<BigInteger> getFirstNFactorials(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Число n должно быть положительным.");
        }

        List<BigInteger> factorials = new ArrayList<>(n);
        BigInteger factorial = BigInteger.ONE; // факториал 0 или 1 равен 1

        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
            factorials.add(factorial);
        }
        return factorials;
    }
}
