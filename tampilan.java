package com.company;
import java.util.Scanner;

public class tampilan {
    Scanner input = new Scanner(System.in);

    int saldo = 500000;
    int norek ;

    void penarikan(int tarik){
        System.out.println("                       Info Penarikan                 ");
        System.out.println(" =======================================================");
        System.out.println(" Masukan Jumlah Uang yang akan Diambil : " +tarik);
        System.out.println(" -------------------------------------------------------");
        transaksi(tarik);
    }

    void infosaldo(){
        System.out.println(" Saldo Anda adalah : Rp." +saldo);
    }

    void transfer(){
        System.out.print(" Masukan No Rekening yan Akan Dituju : ");
        int norek = input.nextInt();
        System.out.println();
        if(norek == 2000018188){
            System.out.print(" Masukan Jumlah Uang yang Akan Di Transfer : ");
            int jumlahuang = input.nextInt();
            System.out.println();
            System.out.println("                 TUJUAN         ");
            System.out.println(" ----------------------------------");
            System.out.println(" No Rekening  : " +norek);
            System.out.println(" Jumalah Uang : " +jumlahuang);
            System.out.println(" ----------------------------------");
            System.out.println();
            System.out.print(" Apakah Data Sesuai ? (Y/N) ");
            char p = input.next().charAt(0);
            if(p=='Y'){
                System.out.println();
                System.out.println(" ----------------------------------");
                System.out.println(" Transaksi Sedang diproses");
                transaksi(jumlahuang);
            } else{
                System.out.println(" Transaksi Gagal");
            }
        } else if(norek == 2000018213){
            System.out.print(" Masukan Jumlah Uang yang Akan Di Transfer : ");
            int jumlahuang = input.nextInt();
            System.out.println();
            System.out.println("                 TUJUAN         ");
            System.out.println(" ----------------------------------");
            System.out.println(" No Rekening  : " +norek);
            System.out.println(" Jumalah Uang : " +jumlahuang);
            System.out.println(" ----------------------------------");
            System.out.println();
            System.out.print(" Apakah Data Sesuai ? (Y/N)");
            char p = input.next().charAt(0);
            if(p=='Y'){
                System.out.println(" Transaksi Sedang diproses");
                transaksi(jumlahuang);
            } else{
                System.out.println(" Transaksi Gagal");
            }
        } else if(norek == 2000018196){
            System.out.print(" Masukan Jumlah Uang yang Akan Di Transfer : ");
            int jumlahuang = input.nextInt();
            System.out.println();
            System.out.println("                 TUJUAN         ");
            System.out.println(" ----------------------------------");
            System.out.println(" No Rekening  : " +norek);
            System.out.println(" Jumalah Uang : " +jumlahuang);
            System.out.println(" ----------------------------------");
            System.out.println();
            System.out.print(" Apakah Data Sesuai ? (Y/N)");
            char p = input.next().charAt(0);
            if(p=='Y'){
                System.out.println(" Transaksi Sedang diproses");
                transaksi(jumlahuang);
            } else{
                System.out.println(" Transaksi Gagal");
            }
        } else if(norek == 2000018189){
            System.out.print(" Masukan Jumlah Uang yang Akan Di Transfer : ");
            int jumlahuang = input.nextInt();
            System.out.println();
            System.out.println("                 TUJUAN         ");
            System.out.println(" ----------------------------------");
            System.out.println(" No Rekening  : " +norek);
            System.out.println(" Jumalah Uang : " +jumlahuang);
            System.out.println(" ----------------------------------");
            System.out.println();
            System.out.print(" Apakah Data Sesuai ? (Y/N)");
            char p = input.next().charAt(0);
            if(p=='Y'){
                System.out.println(" Transaksi Sedang diproses");
                transaksi(jumlahuang);
            } else{
                System.out.println(" Transaksi Gagal");
            }
        } else if(norek == 2000018190){
            System.out.print(" Masukan Jumlah Uang yang Akan Di Transfer : ");
            int jumlahuang = input.nextInt();
            System.out.println();
            System.out.println("                 TUJUAN         ");
            System.out.println(" ----------------------------------");
            System.out.println(" No Rekening  : " +norek);
            System.out.println(" Jumalah Uang : " +jumlahuang);
            System.out.println(" ----------------------------------");
            System.out.println();
            System.out.print(" Apakah Data Sesuai ? (Y/N)");
            char p = input.next().charAt(0);
            if(p=='Y'){
                System.out.println(" Transaksi Sedang diproses");
                transaksi(jumlahuang);
            } else{
                System.out.println(" Transaksi Gagal");
            }
        }else{
            System.out.println(" No Rekening Tujuan Tidak Terdaftar");
        }

    }

    public int transaksi(int transaksi){
        if(this.saldo < transaksi){
            System.out.println();
            System.out.println(" ----------------------------------");
            System.out.println(" Saldo Anda Tidak Mencukupi");
            System.out.println();
            System.out.println(" Sisa Saldo : Rp." +this.saldo);
            System.out.println(" ----------------------------------");
        } else {
            System.out.println();
            System.out.println(" Transaksi Berhasil");
            System.out.println(" ----------------------------------");
            return this.saldo -= transaksi;

        }
        return this.saldo;
    }
}
