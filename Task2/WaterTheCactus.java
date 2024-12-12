package ru.inno.course.exam.Task2;

import java.time.LocalDate;

public class WaterTheCactus {
    public static void main(String[] args) {
        // Дата последнего полива
        LocalDate lastWateredDate = LocalDate.of(2025, 4, 20);
        CactusWatering cactusWatering = new CactusWatering();

        // Дата следующего полива
        LocalDate nextWateringDate = cactusWatering.next(lastWateredDate);

        if (nextWateringDate != null) {
            System.out.println("Следующий полив кактуса должен быть: " + nextWateringDate);
        } else {
            System.out.println("Пока кактус поливать не нужно.");
        }
    }
}

