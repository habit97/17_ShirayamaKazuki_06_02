package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Word[]words=new Word[10];
        System.out.println("わからなかった単語と意味を入力して下さい。");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();

        int index=0;
        while(!input.equals("e")){
            String []tmp=input.split("");
            Word wd=new Word(tmp[0],tmp[1]);
            words[index]=wd;
            index++;
            System.out.println("次の単語と意味を入力してください。\"e\"で終了します。");
            input = sc.nextLine();
        }
        for(int i=0;i<index;i++){
            System.out.println("単語"+words[i].word+"日本語"+words[i].meaning);
        }
        System.out.println(index+"件、登録しました。");
    }
}


//
//
//
//        Scanner scanner=new Scanner(System.in);
//        int a=0;
//        String[]word = new String[9];
//        String[]meaning=new String[9];
//
//        System.out.println("わからなかった単語と意味を入力して下さい。");
//        System.out.println("例）クラス　オブジェクトの元となる設計書");
//
//        while(!(scanner.equals("e"))){
//            System.out.println("単語と意味を入力して下さい。”e”で終了します。");
//            word=new String[]{scanner.next()};
//            meaning = new String[]{scanner.next()};
//             a++;
//        }
//        for(int i = 0; i<i; i++) {
//            System.out.println(a+1 + "件 登録されました。"+"単語；"+word[i]+"　意味；"+meaning[i]);
//        }
//        }
//        }
//
//
////配列に入力されていく方法がわからない
////”e”が入力されたら終了する方法がわからない