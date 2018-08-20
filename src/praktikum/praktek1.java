/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

import java.util.Scanner;

/**
 *
 * @author Lenovo400S
 */
public class praktek1 {
    public static void main(String[] args){
        String identitas = "Toko Farras";
        System.out.println(identitas);
        
        System.out.println("Rincian: ");
        System.out.println("total lebih dari 100000 = diskon 10%");
        System.out.println("total lebih dari 200000 = diskon 20%");
        System.out.println("total lebih dari 500000 = diskon 50%");
        
        System.out.println("==================================");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nama Barang: ");
        System.out.println("1. Kotak Pensil");
        System.out.println("2. Buku Folio");
        System.out.println("3. Papan Dada");
        System.out.println("4. Set Alat Ujian");
        System.out.println("Masukkan no pilihan: ");
        int harga1 = scanner.nextInt();

        scanner = new Scanner(System.in);
        System.out.println("Masukkan Harga: ");
        System.out.println();
        int harga2 = scanner.nextInt();
        
        scanner = new Scanner(System.in);
        System.out.println("Masukkan jumlah: ");
        System.out.println();
        
        int harga3 = scanner.nextInt();
        
        scanner = new Scanner(System.in);
        System.out.println("hitung: ");
        System.out.println();
        
        int hasil;
        hasil = harga2 * harga3;
        System.out.println(harga2 + "*" + harga3 + "=" +hasil);
        
        
        scanner = new Scanner(System.in);
        System.out.println("diskon: ");
        System.out.println();
        
        int diskon;
        
        diskon = scanner.nextInt();
        int total;
        total = hasil * diskon/100;
        System.out.println(hasil + "*" + diskon/100 + "=" +total);
        
        System.out.print("Hasil Akhir=");
        int akhir;
        akhir = hasil - total;
        System.out.println(hasil + "-" + total + "=" +akhir);
        
        System.out.println("Terimakasih telah berkunjung");
        
        System.out.println("Kasir: Luthfarras");
        }            
    }    

