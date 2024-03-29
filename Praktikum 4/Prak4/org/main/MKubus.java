/**
 * File      : MKubus.java		                     15/03/23
 * Penulis   : Niko Geraldi Sinabariba
 * Deskripsi : Driver class untuk bujur sangkar dan kubus
 */

package org.main;
import org.bangundatar.*;
import org.bangunruang.*;

public class MKubus {
    public static void main(String[] args) {
        BujurSangkar bujurSangkar = new BujurSangkar(4);
        Kubus kubus = new Kubus(bujurSangkar);
        System.out.println("Luas permukaan kubus dengan panjang sisi 4 satuan: "+kubus.hitungLuasAlas());
        System.out.println("Volume kubus dengan panjang sisi 4 satuan: "+kubus.hitungVolume());
    }
}
