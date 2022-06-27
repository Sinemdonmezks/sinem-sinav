package Soru3;

public class CostumStringTR {
	String ifadem = "bugün hava çok güzel    ";

	public static void main(String[] args) {
		CostumStringTR ifade = new CostumStringTR();

		System.out.println("ifadenin uzunluğu...:" + ifade.uzunluk());
		System.out.println("ifadeyi büyük yap...:" + ifade.buyukyap());
		System.out.println("ifadeyi küçük yap...:" + ifade.kucukyap());
		System.out.println("ifadenin bosluklarını at...:" + ifade.boslukAt());
		System.out.println("ifadenin kesilmiş yeni hali ...:" + ifade.kesilecek(3, 9));
		System.out.println("ifadeler eşit mi...: " + ifade.esitmi("ali"));
		System.out.println("ifade şununla başlıyor mu...:" + ifade.baslıyormu("b"));
		System.out.println("ifade şununla bitiyor mu...:" + ifade.bitiyormu("a"));
		System.out.println("ifade de var mı...:" + ifade.varmı("bugün"));
		System.out.println("ifadenin içinde geçtiği ilk yer...:" + ifade.gectigiIlkYer("bu"));

	}

	public int uzunluk() {

		return ifadem.length();

	}

	public String buyukyap() {
		return ifadem.toUpperCase();
	}

	public String kucukyap() {
		return ifadem.toLowerCase();
	}

	public String boslukAt() {
		return ifadem.trim();
	}

	public String kesilecek(int i, int j) {

		return ifadem.substring(i, j);

	}

	public boolean esitmi(String yeniifade) {
		return ifadem.equals("yeniifade");

	}

	public boolean baslıyormu(String karakter) {
		return ifadem.startsWith("karakter");

	}

	public boolean bitiyormu(String karakter) {
		return ifadem.endsWith("karakter");

	}

	public boolean varmı(String ifade) {
		return ifadem.contains("ifade");

	}

	public int gectigiIlkYer(String n) {
		return ifadem.indexOf("n");

	}
}
