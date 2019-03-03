package com.company;

public class Main {
    public static void main(String[] args) {
        Person morita =new Person("森田","奈良");
        Person kimura =new Person("木村","埼玉");
        Person takayama =new Person("高山","東京");
        Person motegi =new Person("茂木","沖縄");

        System.out.println(morita.getSelfIntroduction());
        System.out.println(kimura.getSelfIntroduction());
        System.out.println(takayama.getSelfIntroduction());
        System.out.println(motegi.getSelfIntroduction());

    }
}
