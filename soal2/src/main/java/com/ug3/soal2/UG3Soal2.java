package com.ug3.soal2;

import java.util.Scanner;
public class UG3Soal2
{
    public static void main( String[] args )
    {
        String word1 = "",
                word2 = "",
                exit = "";
        int count = 0;
        boolean statement = true;
        while(statement){
            Scanner scan = new Scanner(System.in);
            System.out.println("Bilangan Fibonacci dari kata");
            System.out.print("Masukan input pertama: ");
            word1 = scan.nextLine();
            System.out.print("Masukan input kedua: ");
            word2 = scan.nextLine();

            fibonacciNumber(word1,word2);
            System.out.print("\nKeluar dari program (ketikan exit) : ");
            exit = scan.nextLine();
            if(exit.equalsIgnoreCase("exit")){
                break;
            }

        }

    }
    public static void fibonacciNumber(String word1, String word2){
        int n1 = word1.length();
        int n2 = word2.length();
        int n3 = 0;
        int count = 10;

        System.out.print("Bilangan Fibonacci\n" + n1 + " "+ n2);
        for(int i=2;i<=count;i++){
            n3 = n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }


    }
}
