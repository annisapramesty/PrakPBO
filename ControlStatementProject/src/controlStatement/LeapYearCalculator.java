package controlStatement;
import java.util.Scanner;

public class LeapYearCalculator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("-------------------------");
		System.out.println("|TABEL NAMA BULAN	|");
		System.out.println("-------------------------");
		System.out.println("|1.  Bulan Januari	|");
		System.out.println("|2.  Bulan Februari	|");
		System.out.println("|3.  Bulan Maret	|");
		System.out.println("|4.  Bulan April	|");
		System.out.println("|5.  Bulan Mei		|");
		System.out.println("|6.  Bulan Juni		|");
		System.out.println("|7.  Bulan Juli		|");
		System.out.println("|8.  Bulan Agustus	|");
		System.out.println("|9.  Bulan September	|");
		System.out.println("|10. Bulan Oktober	|");
		System.out.println("|11. Bulan November	|");
		System.out.println("|12. Bulan Desember	|");
		System.out.println("-------------------------");
		
		//memasukkan bulan dan tahun
		System.out.print("Masukkan bulan (1-12) = ");
		int bulan = input.nextInt();
		System.out.print("Masukkan tahun = ");
		int tahun = input.nextInt();
		
		//menentukan bulan ganjil atau genap menggunakan ternary
		String hasil = (bulan%2 == 0) ? "genap" : "ganjil";
		System.out.println("\nBulan tersebut adalah bulan " +hasil+ ".");
		
		//menentukan jumlah hari dalam suatu bulan
		switch(bulan) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			System.out.print("Jumlah hari dalam bulan " +bulan+ " di tahun " +tahun+ " adalah 31.");
			break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			System.out.print("Jumlah hari dalam bulan " +bulan+ " di tahun " +tahun+ " adalah 30.");
			break;
		case 2 :
			if ((tahun%4 == 0)&&!(tahun%100 == 0))
				System.out.print("Jumlah hari dalam bulan " +bulan+ " di tahun " +tahun+ " adalah 29. "
						+ "\nTahun " +tahun+ " merupakan tahun kabisat.");
			else
				System.out.print("Jumlah hari dalam bulan " +bulan+ " di tahun " +tahun+ " adalah 28."
						+ "\nTahun " +tahun+ " bukan tahun kabisat.");
			break;
		default:
			System.out.println("Input tidak valid.");
			break;
		}

	}

}

//Nama : Annisa Sugi Pramesty
//NIM  : 1197050018