package com.example.Lab3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class Lab3Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab3Application.class, args);

		Solver solver = new Solver();

		// D > 0 test
		QuadraticEquation equation1 = new QuadraticEquation(1, -2, 0);
		Solution solution1 = solver.solve(equation1);
		printSolution("D > 0 test", solution1);

		// D = 0 test
		QuadraticEquation equation2 = new QuadraticEquation(1, -2, 1);
		Solution solution2 = solver.solve(equation2);
		printSolution("D = 0 test", solution2);

		// D < 0 test
		QuadraticEquation equation3 = new QuadraticEquation(1, 2, 2);
		Solution solution3 = solver.solve(equation3);
		printSolution("D < 0 test", solution3);

		// a = 0 test
		QuadraticEquation equation4 = new QuadraticEquation(0, -2, 1);
		Solution solution4 = solver.solve(equation4);
		printSolution("a = 0 test", solution4);

		// zero x coefficient test
		QuadraticEquation equation5 = new QuadraticEquation(0, 0, 0);
		Solution solution5 = solver.solve(equation5);
		printSolution("zero x coefficient test", solution5);
	}

	private static void printSolution(String testName, Solution solution) {
		System.out.print(testName + ": ");
		Object result = solution.get();
		if (result instanceof ArrayList) {
			// Это список корней
			ArrayList<Double> roots = (ArrayList<Double>) result;
			System.out.println(roots);
		} else {
			// Это строка
			System.out.println(result);
		}
	}
}
