/*
 * File : MLingkaran.java
 * Penulis : Niko Geraldi Sinabariba-24060121140126
 * Deskripsi : Implementasi cara menghitung luas lingkaran dengan menerima input jejari dari pengguna
 */

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan panjang jari-jari lingkaran : ");
        double jari = scan.nextDouble();
        Lingkaran lr = new Lingkaran(jari);
        System.out.println("Luas lingkaran dengan jejari "+ jari + " satuan adalah : "+ lr.hitungLuas());
    }
}