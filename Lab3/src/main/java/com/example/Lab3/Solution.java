package com.example.Lab3;

import java.util.ArrayList;

public class Solution {

    private ArrayList<Double> roots;
    private String message;

    // Конструктор для корней
    public Solution(ArrayList<Double> roots) {
        this.roots = roots;
    }

    // Конструктор для сообщения
    public Solution(String message) {
        this.message = message;
    }

    public Object get() {
        if (roots != null) {
            return roots;
        } else {
            return message;
        }
    }
}
