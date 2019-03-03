package com.company;

public class Main{
    public static void main(String[] args){
        Circle circle =new Circle(20);
        System.out.println("半径"+circle.radius+"cmの面積は"+circle.getArea()+"㎠");
        System.out.println("半径"+circle.radius+"cmの円周の長さは"+circle.getCircumference()+"cm");
    }
}