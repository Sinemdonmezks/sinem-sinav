package Soru2;

import java.util.Scanner;

public class SayiDizisii {

	int[] dizi;
	int elemanSayisi;
	int sinir;

	public SayiDizisii(int sinir) {
		this.sinir = sinir;
		dizi = new int[sinir];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("bir boyut girin");
		int boyut = sc.nextInt();
		sc.nextLine();
		SayiDizisii dizi = new SayiDizisii(boyut);
		dizi.diziyeEkle(5);
		dizi.diziYaz();
	}

	public void diziListesi(int elemanKapasitesi) {
		dizi = new int[elemanKapasitesi];
		elemanSayisi = 0;
		sinir = elemanKapasitesi;
	}

	public void diziyeEkle(int yeniSayi) {
		if (elemanSayisi < sinir) {
			dizi[elemanSayisi] = yeniSayi;
			elemanSayisi++;
		}
	}

	public void diziYaz() {
		for (int i = 0; i < elemanSayisi; i++) {
			System.out.print(dizi[i] + ",");
		}
	}
}
