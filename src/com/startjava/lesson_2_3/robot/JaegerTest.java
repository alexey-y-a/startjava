package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    
    public static void main(String[] args) {
        Jaeger gipsyDanger = new Jaeger();
        gipsyDanger.setModelName("Gipsy Danger");
        gipsyDanger.setMark("Mark-3");
        gipsyDanger.setOrigin("United States of America");
        gipsyDanger.setHeight(79.25f);
        gipsyDanger.setWeight(1980f);
        gipsyDanger.setSpeed(7);
        gipsyDanger.setStrength(8);
        gipsyDanger.setArmor(6);

        System.out.println("Gipsy Danger:");
        System.out.println(gipsyDanger);
        gipsyDanger.move();
        gipsyDanger.attack();

        Jaeger strikerEureka = new Jaeger("Striker Eureka", "Mark-5", "Australia", 76.2f, 
                6650f, 10, 10, 9);

        System.out.println("\nStriker Eureka:");
        System.out.println(strikerEureka);
        strikerEureka.move();
        strikerEureka.attack();
    }
}