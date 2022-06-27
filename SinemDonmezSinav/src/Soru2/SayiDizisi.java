package Soru2;

import java.util.Random;
import java.util.Scanner;

public class SayiDizisi {

	public static void main(String[] args) {
//		2. Esnek bir SayıDizi Sınıfı yazacaksınız. 
//		Bu sınıf, içinde uzunluğu önceden belli olmayan bir dizi barındıracak.
//		Bu sınıfta, aşağıdaki methodlar görev yapacaktır.
//		•Ekle, diziye sırası ile eleman ekler.
//		•Sil, diziden istenilen elemanı siler.
//		•ArayaEkle, dizinin istenilen yerine ekleme yapar.
//		•Listele, diziyi kullanıcıya döner.
//	

		SayiDizisi sayiDizisi = new SayiDizisi();
		sayiDizisi.diziOlustur();

		int value;

		System.out.println("1-DİZİYE YENİ SAYI EKLE...");
		System.out.println("2-DİZİDEN BİR SAYI SİL...");
		System.out.println("3-İSTEDİĞİN BİR YERE SAYI EKLE...");
		System.out.println("4-DİZİYİ GÖSTER");
		System.out.println("Bir durum seçin...:  ");
		Scanner sc = new Scanner(System.in);
		value = sc.nextInt();

		switch (value) {
		case 1:

			SayiDizisi.ekle();

			break;
		}

	}

	public static void ekle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("eklenecek sayıyı girin...: ");
		int ekleneceksayi = sc.nextInt();
		SayiDizisi.diziOlustur();
		int yeniDizi[] = new int[3];

	}

	public void sayiSil() {

	}

	public static void diziOlustur() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen dizinin uzunluğunu giriniz...= ");
		int uzunluk = scanner.nextInt();
		int[] dizi = new int[uzunluk];
		for (int i = 0; i < dizi.length; i++) {
			int sayi = sayiUret();
			dizi[i] = sayi;
			System.out.print(sayi + " , ");

		}
		System.out.println();
		System.out.println();
	}

	public static int sayiUret() {

		Random random = new Random();

		return random.nextInt(50);

	}

}
