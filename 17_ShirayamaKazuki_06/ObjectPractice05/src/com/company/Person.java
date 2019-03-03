package com.company;

public class Person {
    String name;
    String from;
    Person(String name,String from){this.name=name;this.from=from;}
    String getSelfIntroduction(){
        return ("私の名前は" + name + "です。" + from + "出身");
    }
}