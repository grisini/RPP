package vaja_rpp;

import java.util.Scanner;

public class romb {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Vnesite dimenzijo romba: ");
		int n = scanner.nextInt();

		if (n % 2 == 1) {

			int i = 0;
			while (i < n) {
				System.out.println(" ".repeat(n - i - 1) + "*".repeat(2 * i + 1));// repeat izvede ukaz toliko krat kot
																					// je rezulatat v oklepaju
				i++;
			}

			i = n - 2;// dobimo i za eno manj�i od n zato ga zmanj�amao za 2 (pravzaprav gremo obratno
						// kot smo prej le da sedaj zni�ujemo i) ostanejo enako formule
			while (i >= 0) {
				System.out.println(" ".repeat(n - i - 1) + "*".repeat(2 * i + 1));
				i--;
			}
		} else {
			System.out.println("Vneseno �tevilo ni liho. Poskusite znova.");
		}

	}
}