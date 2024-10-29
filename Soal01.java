
public class Soal01 {
	final static String valid = " valid";
	final static String tidakvalid = " tidak valid";

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		int bilangan1= 123;
		int bilangan2= 456;
		int bilangan3= 789;
		int bilangan4= 101;
		int bilangan5= 135;
		String result1 = identifikasi(bilangan1);
		String result2 = identifikasi(bilangan2);
		String result3 = identifikasi(bilangan3);
		String result4 = identifikasi(bilangan4);
		String result5 = identifikasi(bilangan5);
		System.out.println(bilangan1+result1);
		System.out.println(bilangan2+result2);
		System.out.println(bilangan3+result3);
		System.out.println(bilangan4+result4);
		System.out.println(bilangan5+result5);
	}
		private static String identifikasi(int bilangan) {
			int ratusan = (bilangan / 100) ;
			int puluhan = (bilangan/10) % 10;
			int satuan = bilangan % 2;	
			if (ratusan>puluhan && puluhan> satuan && satuan == 0) {

				String hasil = String.format("%s", tidakvalid);
				return hasil;
			} else {
				String hasil = String.format("%s %d %d %d", valid, ratusan,puluhan, satuan);
				return hasil;
			}
	}
}
