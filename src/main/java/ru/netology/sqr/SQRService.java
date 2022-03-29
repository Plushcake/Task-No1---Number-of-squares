package ru.netology.sqr;

public class SQRService {

    public int calculateSqrMath(int zephyr, int waffle) {
        for (int i = 10; i <= 99; i++) { //Перебираю числа от 10 до 99.
            if (i * i >= zephyr && i * i <= waffle) { // Сначало проверяеться левая часть.
                return i;
            }
        }
        return 0;
    }
}

