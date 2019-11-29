import java.util.Scanner;

public class Drill7{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "Ibu Kota Jawa Barat adalah ?" );
		keyboard.next();

		System.out.println( "4,0 x 5,0 = " );
		keyboard.nextInt();
		//Akan terjadi error apabila kita mengetik jawaban dengan angka desimal seperti 4,0 x 5,0 = 20,0
		//dikarenakan ada rumus Integer yang dimana rumus itu hanya untuk angka bulat bukan desimal
		//jadi untuk menjawab pertanyaan diatas cukup ketik 20 saja

		System.out.println( "Berapa jumlah 1.2 + 4.5 = ");
		keyboard.nextDouble();
		//Akan error apabila kita mengetik jawaban dengan tanda koma (,), contoh 1.2 + 4.5 = 5,7
		//Akan error apabila kita mengetik dengan adanya tombol spasi
		//Akan berhasil apabila kita mengetik jawaban dengan tanda titik (.), contoh 1.2 + 4.5 = 5.7
		//Berhasil juga apabila mengetik dengan angka bulat saja

		System.out.println( "Mengapa ayam menyebrang jalan ?" );
		keyboard.next();
	}
}