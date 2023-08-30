package lista1.atividade2;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual opção você deseja? :\n1. Celsius para Fahrenheit\n2. Fahrenheit para Celsius\nOpção: ");
        int choice = scanner.nextInt();

        double temperature;
        double convertedTemperature;

        switch (choice) {
            case 1:
                System.out.print("Digite a temperatura em Celsius: ");
                temperature = scanner.nextDouble();
                convertedTemperature = celsiusToFahrenheit(temperature);
                System.out.println("Temperatura em Fahrenheit: " + convertedTemperature);
                break;
            case 2:
                System.out.print("Digite a temperatura em Fahrenheit: ");
                temperature = scanner.nextDouble();
                convertedTemperature = fahrenheitToCelsius(temperature);
                System.out.println("Temperatura em Celsius: " + convertedTemperature);
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}