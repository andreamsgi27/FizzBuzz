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
        int num = scanner.nextInt();

        // Llamada a la lógica de FizzBuzz y salida del resultado
        System.out.println(fizzBuzz(num));

        scanner.close();
    }

    // Método que contiene la lógica del juego FizzBuzz
    public static String fizzBuzz(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        } else if (String.valueOf(num).contains("3") && String.valueOf(num).contains("5")) {
            return "FizzBuzz";
        } else if (num % 3 == 0 || String.valueOf(num).contains("3")) {
            return "Fizz";
        } else if (num % 5 == 0 || String.valueOf(num).contains("5")) {
            return "Buzz";
        } else {
            return String.valueOf(num);
        }
    }

}
