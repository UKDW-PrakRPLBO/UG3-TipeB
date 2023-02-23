package com.ug3.soal1;

import java.util.Scanner;

public class UG3Soal1
{
    public static void main( String[] args ) {
        Makanan food = new Makanan();
        Scanner scan = new Scanner(System.in);

        System.out.println("====================Data Product\"====================");
        System.out.println("Masukan Data Product Makanan Anda");
        System.out.println("Nama Makanan: ");
        food.setName(scan.nextLine());
        System.out.println("Tanggal kadaluarsa: ");
        food.setExpired(scan.nextLine());
        System.out.println("Jumlah (quantity) : ");
        food.setQuantity(scan.nextDouble());
        System.out.println("Berat (gram): ");
        food.setWeight(scan.nextDouble());

        foodData(food.getName(),food.getExpired(),food.getQuantity(),food.getWeight());

    }
        public static void foodData(String name, String expDate, double qty, double weight){
                System.out.println(
                "Nama makanan = " + name+ "\n" +
                        "Tanggal kadaluarsa = " + expDate + "\n" +
                        "Jumlah(quantity) = " + qty + "\n" +
                        "Berat = " + weight + " gram\n" +
                        "====================================================="
        );
    }

    }