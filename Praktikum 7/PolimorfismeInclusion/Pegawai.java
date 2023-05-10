/*
 * File : Pegawai.java  
 * Penulis : Niko Geraldi Sinabariba (24060121140126)
 * Deskripsi : Representasi dari objek programmer
*/

package com.PolimorfismeInclusion;

public class Pegawai{
    private String nama;
    private int gajiPokok = 5000000;

    public void setNama(String nama){
        this.nama = nama;
    }

    public void tampilData(){
        System.out.printf("Nama: %s, Gaji pokok : %d\n", nama, gajiPokok);
    }
}
