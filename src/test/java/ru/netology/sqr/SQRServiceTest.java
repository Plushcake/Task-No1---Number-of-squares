package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldCalculateSqrMath() {
        SQRService service = new SQRService (); // Создаю сервис.
        int expected = 15; // Ожидаемый
        int actual = service.calculateSqrMath (200, 300);


        assertEquals(expected,actual);

    }
}