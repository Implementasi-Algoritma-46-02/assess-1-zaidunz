import java.util.Scanner;

public class Soal04 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner userInput = new Scanner(System.in);
		String kode = userInput.nextLine();
		int jumlahjam = userInput.nextInt();
		int perjam = 30000;
		int tunjangan = 0;

		switch (kode) {
			case "DES":
				tunjangan = 600000;
				break;
			case "PRG":
				tunjangan = 1200000;
				break;
			case "WRT":
				tunjangan = 400000;
				break;
			case "MKT":
				tunjangan = 500000;
				break;
			default:
				break;
		}
		double total = 0;
		double totaljam = jumlahjam * perjam;
		if (jumlahjam > 160 && jumlahjam < 175) {
			double diskon = (double) totaljam * 0.05;
			total = (int) (totaljam + tunjangan + diskon);

			System.out.printf("%.1f", total);
		} else if (jumlahjam > 175) {
			double diskon = (double) totaljam * 0.07;
			total = (int) (totaljam + tunjangan + diskon);

			System.out.printf("%.1f ", total);

		} else {
			total = (int) (totaljam + tunjangan);

			System.out.printf("%.1f ", total);
		}
	}

}
