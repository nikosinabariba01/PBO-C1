/**
 * File : LambdaList.java 09/06/2023
 * Penulis : Niko Geraldi Sinabariba
 * Deskripsi : Implementasi lambda pada list, digunakan
 * sebagai perameter pada method
*/

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args){
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("rio");
        mahasiswaList.add("surti");
        mahasiswaList.add("sutejo");
        mahasiswaList.add("komang");

        mahasiswaList.forEach((nama)->System.out.println(nama));
    }
}
