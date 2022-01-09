package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        tampilan atm = new tampilan();
        int pilih;

        System.out.println();
        System.out.println(" ==================================");
        System.out.println(" |            MASUKAN PIN         |");
        System.out.println(" ==================================");
        System.out.print(" | PIN : ");
        int pin = input.nextInt();
        System.out.println(" ==================================");
        if(pin == 2000018193){
            do{
                System.out.println();
                System.out.println(" ========================================");
                System.out.println(" |               SISTEM ATM             |");
                System.out.println(" ========================================");
                System.out.println(" | 1. Penarikan                         |");
                System.out.println(" | 2. Informasi Saldo                   |");
                System.out.println(" | 3. Transfer                          |");
                System.out.println(" | 4. Keluar                            |");
                System.out.println(" ========================================");
                System.out.println();
                System.out.print(" Masukan Pilihan : ");
                pilih = input.nextInt();
                System.out.println();

                switch (pilih){
                    case 1 :
                        System.out.print(" Masukan Jumlah Uang yang Akan Diambil : ");
                        int tarik = input.nextInt();
                        atm.penarikan(tarik);
                        break;
                    case 2 :
                        System.out.println("   Informasi Saldo");
                        System.out.println(" ===================");
                        atm.infosaldo();
                        break;
                    case 3 :
                        System.out.println("                          Menu Transfer      ");
                        System.out.println(" ======================================================");
                        atm.transfer();
                        break;
                    case 4 :
                        System.out.println(" Terima kasih Silahkan Masukan PIN kembali");
                        break;
                    default:
                        System.out.println(" Pilihan yang anda masukan tidak tersedia");
                }
            } while(pilih != 4);
        } else{
            System.out.println(" PIN Yang anda masukan Salah");
        }

    }
}
