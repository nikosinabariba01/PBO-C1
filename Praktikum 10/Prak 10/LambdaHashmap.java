/* 
 * File : LambdaHashmap.java  (06/06/2023)
 * Penulis : Niko Geraldi Sinabariba (24060121140126) 
 * Deskripsi: Menggunakan lambda untuk menampilkan data mahasiswa
*/

import java.util.HashMap;

public class LambdaHashmap {
    public static void main(String[] args) {
        HashMap<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060121140126", "Niko Geraldi Sinabariba");
        mahasiswaMap.put("24060121130021", "joo");
        mahasiswaMap.put("24060121140565", "wawa");
        mahasiswaMap.put("24060121140781", "lee");

        // menggunakan lambda
        mahasiswaMap.forEach((nim, nama) -> System.out.println(nim + " : " + nama));
    }
}
