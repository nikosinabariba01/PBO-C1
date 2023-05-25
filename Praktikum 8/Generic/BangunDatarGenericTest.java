/*
 * File : BangunDatarGenericTest.java  17/05/2023
 * Penulis : Niko Geraldi Sinabariba (24060121140126)
 * Deskripsi : main class untuk generic bangun datar
*/

public class BangunDatarGenericTest {
    public static void main(String[] args){
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("Keliling lingkaran : "+bdg.hitungKeliling());
        System.out.println("Tipe generic : "+bdg.get().getClass().getName());
    }
}

/*
Pemilihan nama objek generic default sering menggunakan "T" karena singkatan dari "Type" 
(Tipe) dan mewakili tipe data yang tidak diketahui atau bervariasi. Namun, kode yang baik 
sebaiknya memilih nama yang sesuai dan deskriptif sesuai konteksnya. Jika dibutuhkan, 
pengembang dapat memilih nama yang lebih spesifik dan bermakna untuk objek generic tersebut. 
Penting untuk memilih nama yang relevan agar kode menjadi lebih jelas dan mudah dipahami.
*/
