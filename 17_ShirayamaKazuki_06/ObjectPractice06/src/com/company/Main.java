package com.company;
import sun.awt.image.BufferedImageDevice;
import java.io.IOException;
import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)throws IOException{
        Scanner scanner=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        CoinCase A=new CoinCase();

        for(int i=0; i<5 ; i++)
        {   System.out.println("硬貨の種類を入力してください");
            int coin= Integer.parseInt(br.readLine());
            System.out.print( "硬貨の枚数を入力してください");
            int count=Integer.parseInt(br.readLine());
            A.AddCoins(coin,count);
        }

        System.out.print("500円は"+ A.GetCount(500)+"枚");
        System.out.print("　100円は"+ A.GetCount( 100 ) + "枚");
        System.out.print("　50円は"+ A.GetCount( 50 ) + "枚");
        System.out.print("　10円は" + A.GetCount( 10 ) + "枚");
        System.out.print("　5円は" + A.GetCount( 5 ) + "枚");
        System.out.println("　1円は" + A.GetCount( 1 ) + "枚");
        System.out.println("　総額は"+A.GetAmount()+"円です。");
    }
}

