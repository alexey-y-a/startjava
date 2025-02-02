package com.startjava.lesson_2_3_4.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender("m");
        wolf.setNickName("Alfa");
        wolf.setWeight(30);
        wolf.setAge(10);
        wolf.setColor("white");
        System.out.println("Пол = " + wolf.getGender());
        System.out.println("Кличка = " + wolf.getNickName());
        System.out.println("Вес = " + wolf.getWeight());
        System.out.println("Возраст = " + wolf.getAge());
        System.out.println("Цвет = " + wolf.getColor());
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
        wolf.setNickName("Beta");
        wolf.setWeight(40);
        wolf.setAge(15);
        wolf.setColor("Black");
        System.out.println("Кличка = " + wolf.getNickName());
        System.out.println("Вес = " + wolf.getWeight());
        System.out.println("Возраст = " + wolf.getAge());
        System.out.println("Цвет = " + wolf.getColor());
    }
}