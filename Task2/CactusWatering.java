package ru.inno.course.exam.Task2;

import java.time.LocalDate;
import java.time.Month;
import java.util.EnumSet;

public class CactusWatering {
    private final EnumSet<Month> winter = EnumSet.of(Month.DECEMBER, Month.JANUARY, Month.FEBRUARY);
    private final EnumSet<Month> spring = EnumSet.of(Month.MARCH, Month.APRIL, Month.MAY);
    private final EnumSet<Month> summer = EnumSet.of(Month.JUNE, Month.JULY, Month.AUGUST);
    private final EnumSet<Month> fall = EnumSet.of(Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER);

    public LocalDate next(LocalDate previous) {
        Month month = previous.getMonth();

        if (winter.contains(month)) {
            // Зимой поливаем раз в месяц
            return previous.plusMonths(1);
        } else if (spring.contains(month) || fall.contains(month)) {
            // Весной и осенью поливаем раз в неделю
            return previous.plusWeeks(1);
        } else if (summer.contains(month)) {
            // Летом проверяем влажность
            if (HumiditySensor.humidity() < 30) {
                return previous.plusDays(20); // Поливаем через 20 дней
            }
        }

        return null;
    }
}