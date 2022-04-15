package com.company;

public class Task3 {

    public static void main(String[] args) {

        // Применить на практике автоматическое преобразование, но с потерей точности: int -> float.
        //	•	Проинициализировать переменную типа int максимальным значением
        //	•	Присвоить ее значение переменной типа float.
        //	•	Вывести оба числа на экран.

        int i = 214_748_364_7;
        float b = (float) i;

        System.out.println(i + "\n" + b);
    }

}
