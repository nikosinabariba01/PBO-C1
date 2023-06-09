/**
 * File : DiskonLambda.java 09/06/2023
 * Penulis : Niko Geraldi Sinabariba
 * Deskripsi : Ekspresi lambda dasar, digunakan untuk
 * menghitung diskon
*/

interface IDiskon{
    public double hitungDiskon(int harga);
}

public class DiskonLambda{
    public static void main(String args[]){
        IDiskon diskonMerdeka = new IDiskon(){
            public double hitungDiskon(int harga){
                return harga - (harga * 0.3);
            }
        };
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };
        System.out.println("Diskon Merdeka : "+diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran : "+diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa : "+diskonBiasa.hitungDiskon(45000));
    }
}

/* diskonLebaran diimplementasikan menggunakan ekspresi lambda dengan sintaks singkat 
(harga) -> harga - (harga * 0.4). Ini berarti ketika fungsi 
hitungDiskon dipanggil dengan argumen harga, ekspresi lambda ini secara otomatis mengembalikan hasil 
pengurangan harga dengan diskon sebesar 40% (harga * 0.4). Tidak perlu penulisan blok kode yang 
panjang atau pernyataan return yang eksplisit. Sementara itu, diskonBiasa juga diimplementasikan menggunakan ekspresi lambda, 
tetapi dengan sintaks yang sedikit berbeda. Sintaks (harga) -> { return harga - (harga * 0.1); } 
menunjukkan bahwa fungsi hitungDiskon juga menerima argumen harga, tetapi menggunakan blok kode yang 
lebih panjang dengan pernyataan return yang eksplisit untuk mengembalikan hasil pengurangan harga 
dengan diskon sebesar 10% (harga * 0.1). Dengan demikian, perbedaan utama antara diskonLebaran dan 
diskonBiasa terletak pada cara implementasi yang digunakan. diskonLebaran menggunakan sintaks singkat 
tanpa memerlukan blok kode yang panjang atau pernyataan return yang eksplisit, sementara diskonBiasa 
menggunakan sintaks yang sedikit lebih rumit dengan blok kode yang lebih panjang dan pernyataan return yang eksplisit. */