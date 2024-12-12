package ru.inno.course.exam.Task1;

import java.util.Scanner;

public class LoveMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину забора в сантиметрах: ");
        int fenceLength = scanner.nextInt();

        // Длина надписи
        int letters = 15; // Буквы
        int spaces = 3; // Пробелы

        int letterGroups = letters / 3; // Группы по 3 буквы 15/3=5
        int letterLength = letterGroups * 62; // Длина, занимаемая буквами 5*62=310
        int spaceLength = spaces * 12; // Длина, занимаемая пробелами 3*12=36

        int totalLength = letterLength + spaceLength; // Общая длина надписи

        // Поместится ли надпись на забор?
        if (totalLength <= fenceLength) {
            System.out.println("Надпись поместится на заборе.");
        } else {
            System.out.println("Надпись не поместится на заборе.");
        }

        scanner.close();
    }
}