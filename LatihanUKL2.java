package Latihan;

import java.util.Scanner;

public class LatihanUKL2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan sebuah bilangan");
        int bilangan = input.nextInt();

        if (bilangan %2==0) {
        System.out.println("bilangan genap");
        }else{
            System.out.println("bilangan ganjil");
        }
        
    }
}
