package com.example.Lab3;

import java.util.ArrayList;

public class Solver {
    public Solution solve(QuadraticEquation equation) {
        double a = equation.getA();
        double b = equation.getB();
        double c = equation.getC();

        double discriminant = b * b - 4 * a * c;

        if (a == 0) {
            if (b == 0) {
                // Бесконечное количество корней
                return new Solution("x ∈ R");
            }
            // Линейное уравнение
            double root = -c / b;
            ArrayList<Double> roots = new ArrayList<>();
            roots.add(root);
            return new Solution(roots);
        } else if (discriminant > 0) {
            // Два действительных корня
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            ArrayList<Double> roots = new ArrayList<>();
            roots.add(root1);
            roots.add(root2);
            return new Solution(roots);
        } else if (discriminant == 0) {
            // Один действительный корень
            double root = -b / (2 * a);
            ArrayList<Double> roots = new ArrayList<>();
            roots.add(root);
            return new Solution(roots);
        } else {
            // Нет действительных корней
            return new Solution("Нет действительных корней");
        }
    }
}
