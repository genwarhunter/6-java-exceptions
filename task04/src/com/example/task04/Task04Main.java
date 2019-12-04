package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(-5));
         */
    }

    static String getSeason(int monthNumber) {
        String[] Season = new String[]{"зима", "весна", "лето", "осень"};
        if (monthNumber >= 1 && monthNumber <= 12) {
            return Season[(monthNumber % 12) / 3];
        } else {
            throw new MyException("monthNumber" + " " + monthNumber + " " + "is invalid, month number should be between 1..12");
        }
    }

}