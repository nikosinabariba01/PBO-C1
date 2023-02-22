//Nama file: Mtitik.java
//Pembuat: Naufal Arya Ramadhan
//Deskripsi: Program untuk menguji kelas titik

public class Mtitik {
    public static void main(String[] args){
        titik t1,t2,t3;
        t1 = new titik();
        t1.setAbsis(1);
        t1.setOrdinat(2);

        t2 = new titik();
        t2.setAbsis(3);
        t2.setOrdinat(4);

        t3 = new titik();
        t3.setAbsis(5);
        t3.setOrdinat(6);

        System.out.println("Absis dari t1: "+t1.getAbsis());
        System.out.println("Ordinat dari t1: "+t1.getOrdinat()+"\n");

        System.out.println("Absis dari t2: "+t2.getAbsis());
        System.out.println("Ordinat dari t2: "+t2.getOrdinat()+"\n");

        System.out.println("Absis dari t3: "+t3.getAbsis());
        System.out.println("Ordinat dari t3: "+t3.getOrdinat()+"\n");

        System.out.println("jumlah objek titik: "+t1.getCounterTitik()+"\n");
    }
}
