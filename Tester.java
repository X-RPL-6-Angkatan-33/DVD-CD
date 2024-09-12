package Bert;

import java.util.Scanner;
//Driver class
public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pilihan = "";

        System.out.println("Berapa Objek yang Ingin Dibuat!(Max10)");
        int jumlah =in.nextInt();
        in.nextLine();


        if(jumlah > 10){
            System.out.println("Jumlah Maks 10");
            jumlah = 10;
        }
        
        for (int i = 0; i < jumlah; i++) {
            System.out.println("CD apa DVD ?");
            pilihan = in.nextLine();
            
            //kondisi
            if(pilihan.equalsIgnoreCase("CD")) {
                CD c1 = new CD();
                c1.print();
                
            } else if(pilihan.equalsIgnoreCase("DVD")){
                DVD d1 = new DVD();
                d1.print();
                
            } else {
                System.out.println("Inputan Salah, coba lagi.");
                i--;
            }
        }
        
        in.close();
    }
}
