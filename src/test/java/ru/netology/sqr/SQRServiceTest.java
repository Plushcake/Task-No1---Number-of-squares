package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void boundaryRangeSqrLow() {
        SQRService service = new SQRService(); // Создаю сервис.
        int expected = 3; // Ожидаемый
        int actual = service.boundaryRangeSqr(200, 300);


        assertEquals(expected, actual);

    }

    @Test
    void boundaryRangeSqrHigh() {
        SQRService service = new SQRService(); // Создаю сервис.
        int expected = 3; // Ожидаемый
        int actual = service.boundaryRangeSqr(400, 500);


        assertEquals(expected, actual);

    }
}