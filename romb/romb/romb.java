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
}