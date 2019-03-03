package com.company;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("半径５cmの面積は" + circle.getArea() + "㎠");
        System.out.println("半径５cmの円周の長さは" + circle.getCircumference() + "cm");
    }
}
