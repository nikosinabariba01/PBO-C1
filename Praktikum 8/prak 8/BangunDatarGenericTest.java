public class BangunDatarGenericTest{
	public static void main(String[]args){
		Lingkaran l = new Lingkaran(2);
		BangunDatarGeneric<lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
		bdg.set(l);
		System.out.println("keliling lingkaran 1 : " +bdg.hitungKeliling());
		System.out.println("tipe generic :" +bdg.get().getClass().getName());
	}
}