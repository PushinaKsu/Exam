package ru.inno.course.exam;

import java.util.Random;
import java.util.Scanner;

public class RPS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int userScore = 0;
        int computerScore = 0;

        System.out.println("Игра: Камень-Ножницы-Бумага!");
        System.out.println("Введите К (Камень), Н (Ножницы) или Б (Бумага).");

        for (int round = 1; round <= 5; round++) {
            System.out.print("\nРаунд " + round + ". Ваш выбор: ");
            String userChoice = scanner.nextLine().trim().toUpperCase();

            if (!userChoice.equals("К") && !userChoice.equals("Н") && !userChoice.equals("Б")) {
                System.out.println("Ошибка ввода. Выберите К, Н или Б.");
                round--;
                continue;
            }

            String[] options = {"К", "Н", "Б"};
            String computerChoice = options[random.nextInt(3)];
            System.out.println("Компьютер выбрал: " + computerChoice);

            if (userChoice.equals(computerChoice)) {
                System.out.println("Ничья!");
            } else if (
                    (userChoice.equals("К") && computerChoice.equals("Н")) ||
                            (userChoice.equals("Н") && computerChoice.equals("Б")) ||
                            (userChoice.equals("Б") && computerChoice.equals("К"))
            ) {
                userScore += points(userChoice);
                System.out.println("Вы выиграли этот раунд!");
            } else {
                computerScore += points(computerChoice);
                System.out.println("Компьютер выиграл этот раунд!");
            }
        }

        System.out.println("\nИтоговый счет: Вы: " + userScore + " - Компьютер: " + computerScore);
        System.out.println(userScore > computerScore ? "Вы победили!" : (userScore < computerScore ? "Компьютер победил!" : "Ничья!"));
    }

    private static int points(String choice) {
        return switch (choice) {
            case "К" -> 1; // Камень - 1 балл
            case "Н" -> 2; // Ножницы - 2 балла
            case "Б" -> 5; // Бумага - 5 баллов
            default -> 0; // Неверный выбор }
        };
    }
}

