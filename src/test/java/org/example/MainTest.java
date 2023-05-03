package org.example;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class AClassWithOneJUnitTest {

    @Test
    void shouldReturnRightAmountOfDays() {
        long days = Main.getNumberOfDaysOnEarth(Main.convertBirthDate("09-03-1984"), LocalDate.now());
        assertEquals(14299,days);
    }
@Test
    void shouldInputExistingBirthdate() {
        LocalDate now = LocalDate.now();
        LocalDate birthdate = Main.convertBirthDate("12-12-2025");
        assertTrue(birthdate.isAfter(now));
    }

}