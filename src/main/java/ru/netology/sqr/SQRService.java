package ru.netology.sqr;

public class SQRService {

    public int boundaryRangeSqr(int lowerBound, int upperBound) {
        int count = 0;
        for (int i = 10; i <= 99; i++) { //Перебираю числа от 10 до 99.
            if (i * i >= lowerBound && i * i <= upperBound) { // Сначало проверяеться левая часть.
                count++;
            }
        }
        System.out.println("Количество квадратов равна " +count);
        return count;
    }
}

