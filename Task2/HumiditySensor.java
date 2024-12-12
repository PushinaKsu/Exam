package ru.inno.course.exam.Task2;

import java.util.Random;

//Генерация случайного уровня влажности от 0 до 100
public class HumiditySensor {
    public static int humidity() {
        Random random = new Random();
        return random.nextInt(101);
    }
}
