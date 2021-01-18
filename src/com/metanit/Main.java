package com.metanit;

import java.util.Scanner; // импорт сканера

public class Main {
    public static void main (String [] args) {
        int a,b,c;

//условия if
        a = 1;
        if (a > 1) {
            System.out.println("переменная а > 1");
        } else {
            System.out.println("переменная а <= 1");
        }

// switch
        System.out.println ("Введите число");
        Scanner scan = new Scanner(System.in); // подключаем ввод чиселок
        b = scan.nextInt();
        switch (b){
            case 1: System.out.println ("Вы ввели число 1"); break; // Использование break
            case 2: System.out.println ("Вы ввели число 2"); break;
            case 3: System.out.println ("Вы ввели число 3"); break;
            case 4: System.out.println ("Вы ввели число 4"); break;
            default: System.out.println("Вы ввели неправильное число");
        }

// цикл for
        for (int i = 1; i <= 4; i++){
            System.out.println(i + ": я выполянюсь перед continue!");
            if (i > 2)
                continue; //Использование continue
            System.out.println("     "+ i + ": я выполянюсь всего два раза ;(");
        }

// цикл while
        c = 1;
        while (c < 8) {
            System.out.println("Вывести все нечётные числа до с = " + c);
            c += 2;
        }

// работа со строками

// Длина строки length
        String str1 = "Что-то пошло не так";
        System.out.println("Длина строки равна: " + str1.length());

// Добавление строки concat
        String str2 = "Что-то пошло не так. ";
        str2 = str2.concat ("Хнык-Хнык");
        System.out.println(str2);

// Индекс строки charAt
        String str3 = "Здравуствуйте, я Ваша тётя!";
        char ch1 = str3.charAt (2);
        char ch2 = str3.charAt (15);
        System.out.println("Буква 2 индекса это: " + ch1);
        System.out.println("Буква 15 индекса это: " + ch2);

// Подстрока substring
        String  str4 = "А я Ваша дядя";
        System.out.println("Кусок строки номер раз: " + str4.substring(6));
        String  str5 = str4.substring(6,9);
        System.out.println("Кусок строки номер два: " + str5);

// Удаление пробелов в строке trim
        String str6 = "     Бла-бла-бла    ";
        System.out.println("Строка без пробелов: " + str6.trim());

// Строка в большие буквы
        String str7 = "Где-то маленькие, где-то большие буквы";
        System.out.println("Привели строку в большие буковки: " + str7.toUpperCase());

// Строка в маленькие буковки
        String str8 = "Где-то маленькие, где-то большие буквы";
        System.out.println("Привели строку в маленькие буковки: " + str8.toUpperCase());

// Массивы + цикл for each
        String [] array1 = {"Первый элемент", "Второй элемент", "Третий эелемент"} ;
        int [] array2 = {1,2,5,3,2,1,7};

        for (String j:array1) {
            System.out.println("Элементы массива" + j);
        }

        for (int k = 0; k < array2.length; k++) {
            System.out.println("Элемент массива " + k + " равен " + array2[k]);
        }

// Поиск символа в строке
        String str9 = "Хорошо в лесу весной";
        int index1 = str9.indexOf("о") ;
        int index2 = str9.indexOf("Оро",0) ;
        int index3 = str9.indexOf("лес",2) ;
        int index4 = str9.indexOf("ой",25) ;
        System.out.println("В строке str9 подстрока 'о' находится на элементе под номером: " + index1 );
        System.out.println("В строке str9 подстрока 'Оро' находится на элементе под номером: " + index2 );
        System.out.println("В строке str9 подстрока 'лес' находится на элементе под номером: " + index3 );
        System.out.println("В строке str9 подстрока 'ой' находится на элементе под номером: " + index4 );





    }


}