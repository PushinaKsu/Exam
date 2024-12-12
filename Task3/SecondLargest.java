package ru.inno.course.exam.Task3;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 7, 3, 2, 0, 4, 9, 6, -5, 0 , 10};

        Arrays.sort(numbers);

        int[] sorted = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            sorted[i] = numbers[numbers.length - 1 - i];
        }

        int secondLargest = sorted[1];

        System.out.println("Второй по величине элемент: " + secondLargest);
    }
}

// так и правда проще