/*
 * File : Programmer.java  
 * Penulis : Niko Geraldi Sinabariba (24060121140126)
 * Deskripsi : Representasi dari objek programmer
*/

package com.PolimorfismeInclusion;

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama){
        setNama(nama);
        this.bonus = bonus;
    }

    public void tampilData(){
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}
