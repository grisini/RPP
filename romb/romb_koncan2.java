package vaja_rpp;

import java.util.Scanner;

public class romb_koncan2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Vnesite poljuben znak:");
		String znak = scanner.nextLine();

		System.out.println("Vnesite dimenzijo romba: ");
		int n = scanner.nextInt();

		scanner.nextLine();
		
		System.out.println("Vnesite poln ali prazen ");
		String oblika = scanner.nextLine();

		System.out.println(oblika);
		
		if (oblika.compareTo("polni") == 0) {
			polni(n);
		} else {
			prazniSKrizem(n, znak);
		}
	}

	public static void polni(int n) {

		if (n % 2 == 1) {

			int i = 0;
			while (i < n) {
				System.out.println(" ".repeat(n - i - 1) + "*".repeat(2 * i + 1));// repeat izvede ukaz toliko krat kot
																					// je rezulatat v oklepaju
				i++;
			}

			i = n - 2;// dobimo i za eno manjši od n zato ga zmanjšamao za 2 (pravzaprav gremo obratno
						// kot smo prej le da sedaj znižujemo i) ostanejo enako formule
			while (i >= 0) {
				System.out.println(" ".repeat(n - i - 1) + "*".repeat(2 * i + 1));
				i--;
			}
		} else {
			System.out.println("Vneseno število ni liho. Poskusite znova.");

		}
	}

	public static void prazniSKrizem(int n, String znak) {

		if (n % 2 == 1)

		{

			int i = 1;
			System.out.println("-".repeat(n - 1) + znak);
			while (i < n) {
				System.out.println(".".repeat(n - i - 1) + znak + "-".repeat(Math.abs((2 * i - 2) / 2)) + znak
						+ "+".repeat(Math.abs((2 * i - 2) / 2)) + znak);// repeat izvede ukaz toliko krat kot je
																		// rezulatat v
																		// oklepaju
				i++;
			}

			System.out.println(znak.repeat(2 * n));// srednja vrstica
			i = n - 1;// dobimo i za eno manjši od n zato ga zmanjšamao za 2 (pravzaprav gremo obratno
						// kot smo prej le da sedaj znižujemo i) ostanejo enako formule
			while (i >= 1) {
				System.out.println(" ".repeat(n - i - 1) + znak + " ".repeat(Math.abs((2 * i - 2) / 2)) + znak
						+ " ".repeat(Math.abs((2 * i - 2) / 2)) + znak);// repeat izvede ukaz toliko krat kot je
																		// rezulatat v
																		// oklepaju
				i--;
			}
			System.out.println(" ".repeat(n - 1) + znak);
		} else {
			System.out.println("Vneseno število ni liho. Poskusite znova.");
		}

	}

}
