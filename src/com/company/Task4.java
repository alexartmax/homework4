package com.company;

public class Task4 {

    public static void main(String[] args) {

        // Проверить работу переполнения мантиссы числа в java.
        // 1.Создать переменную типа byte и проинициализировать ее максимальным значением.
        // 2.Выполнить операцию "инкремент" для этой переменной.
        // 3.Вывести значение на экран.

        byte f = 127;
        byte res = ++f; //можно також зробити f++ - в обох випадках переповнення відбулось, але в f++ відбуваеться після звернення

        System.out.println(f + "\n" + res);
    }
}