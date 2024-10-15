package org.factoriaf5.fizzbuzz;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FizzbuzzApplication {

	public static void main(String[] args) {
		SpringApplication.run(FizzbuzzApplication.class, args);
		Scanner scanner = new Scanner(System.in);

		
		System.out.print("Escriba un número: ");
		int num =  scanner.nextInt();
		
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("FizzBuzz");
		} else if (String.valueOf(num).contains("3") && String.valueOf(num).contains("5")) {
			System.out.println("FizzBuzz");
		} else if (num % 3 == 0 || String.valueOf(num).contains("3")) {
			System.out.print("Fizz");
		} else if (num % 5 == 0 || String.valueOf(num).contains("5")) {
			System.out.print("Buzz");
		} else {
			System.out.println(num);
		}

		scanner.close();
	}

}
