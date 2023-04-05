/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi2a;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class TiketBus{
	public static void main(String[] args){
		int h,j,k;
		float d,b;
		Scanner in = new Scanner(System.in);
		System.out.println(" Pembelian Tiket Bus Jurusan Padang - Jakarta");
		System.out.print(" Masukkan Jumlan Tiket yang Ingin dibeli = ");
		j = in.nextInt();
		System.out.println(" Pilihan Kelas :");
		System.out.println(" 1. Ekonomi = Rp150,000,-");
		System.out.println(" 2. Eksekutif = Rp250,000,-");
		System.out.println(" 3. Super Eksekutif = Rp350,000,-");
		System.out.print(" Masukkan Jenis Kelas = ");
		k = in.nextInt();
		h = 0; d = 0; b = 0;
		switch(k)
		{
			case 1 : {
						h = 150000 * j;
						if(j>4)
							d = ( h * 10 ) /100;
						else
							d = 0;
					 }
			break;
			case 2 : {
						h = 250000 * j;
						if(j>4)
							d = ( h * 10 ) /100;
						else
							d = 0;
					 }
			break;
			case 3 : {
						h = 350000 * j;
						if(j>4)
							d = ( h * 10 ) /100;
						else
							d = 0;
					 }
			break;
			default : System.out.println(" Pilihan Tidak Ada");
		}
		b = h - d;
		System.out.println(" Harga Awal Sebelum Diskon = " + h );
		System.out.println(" Diskon = " + d );
		System.out.println(" Harga Awal Sesudah Diskon = " + b );
	}
}
