package org.example;


/**
 Домашняя работа, задача:
 ========================

 a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
 b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
 поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
 c. Для хранения фруктов внутри коробки можно использовать ArrayList;
 d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
 вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
 e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
 подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
 Можно сравнивать коробки с яблоками и апельсинами;
 f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
 Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
 Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
 g. Не забываем про метод добавления фрукта в коробку.
 */

public class Main {
    public static void main(String[] args) {

        Orange orange1 = new Orange();
        System.out.println("Вес апельсина: " + orange1.getWeight());
        Apple apple1 = new Apple();

        AppleBox appleBox1 = new AppleBox(0);
        appleBox1.addFruit(apple1,5);
        System.out.println(appleBox1);
        appleBox1.addFruit(apple1,5);
        System.out.println(appleBox1);
        appleBox1.addFruit(apple1,5);
        System.out.println(appleBox1);

        OrangeBox orangeBox1 = new OrangeBox(15);
        System.out.println("Сравним коробку апельсинов №1 с коробкой яблок №1");
        System.out.println(orangeBox1);
        System.out.println(appleBox1);
        System.out.println(orangeBox1.compare(appleBox1));
        System.out.println("Сравним коробку яблок №2 с коробкой яблок №1");
        AppleBox appleBox2 = new AppleBox(15);
        System.out.println(appleBox2.compare(appleBox1));

        orangeBox1.addFruit(orange1,15);
        System.out.println(orangeBox1);
        System.out.println("Сравним коробку яблок №2 с коробкой апельсинов №1");
        System.out.println(appleBox2.compare(orangeBox1));

        OrangeBox orangeBox2 = new OrangeBox(5);
        System.out.println(orangeBox2);
        System.out.println("Пересыпали коробку апельсинов №1 в коробку апельсинов №2");
        orangeBox1.addBox(orangeBox2);
        System.out.println(orangeBox2);
        System.out.println(orangeBox1);

    }
}