package org.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;



class MainTest {

    @Test
    void shouldReturnRightAmountOfDays() {
        long days = Main.getNumberOfDaysOnEarth(Main.convertBirthDate("09-03-1984"), LocalDate.now());
        Assertions.assertEquals(14299, days);
    }
@Test
    void shouldInputExistingBirthdate() {
        LocalDate now = LocalDate.now();
        LocalDate birthdate = Main.convertBirthDate("12-12-2025");
        assertTrue(birthdate.isAfter(now));
    }
    @Test
    public void testGetNumberOfDaysOnEarth() {
        LocalDate date = LocalDate.of(2000, 1, 1);
        LocalDate now = LocalDate.of(2023, 5, 3);
        long expectedDays = 8523;

        long actualDays = Main.getNumberOfDaysOnEarth(date, now);

        Assertions.assertEquals(expectedDays, actualDays);
    }

    @Test
    public void testConvertBirthDate() {
        String birthdate = "01-01-2000";
        LocalDate expectedDate = LocalDate.of(2000, 1, 1);

        LocalDate actualDate = Main.convertBirthDate(birthdate);

        Assertions.assertEquals(expectedDate, actualDate);
    }

}