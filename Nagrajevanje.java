package vaja_rpp;

import java.util.Scanner;

public class Nagrajevanje {

	public static void main(String[] args) {
		Scanner vhod = new Scanner(System.in);
		System.out.print("Vpisi stevilo ur, ki jih je delovec potreboval za delo: ");
		float cas = vhod.nextFloat();

		if (cas <= 2) {
			System.out.println("Vnos je neveljaven. ");
		} else if (cas > 2 && cas <= 3) {
			System.out.println("Delovec je zelo uncinkovit. ");
			System.out.print(" Vnesite stevilo let zaposlitve pri podjetju ");
			float leta = vhod.nextFloat();
			if (leta <= 3) {
				System.out.println("Delovec pridobi nagrado 100 eur. ");
			}
			if (leta > 3 && leta <= 5) {
				System.out.println("Delovec pridobi nagrado 200 eur. ");
			}
			if (leta > 5) {
				System.out.println("Delovec pridobi nagrado 300 eur. ");

			}
		} else if (cas > 3 && cas <= 4) {
			System.out.println("Delovec naj poveca ucinkovitost. ");
		} else if (cas > 4 && cas <= 5) {
			System.out.println("Delovec je napoten na dodatno usposabljanje. ");
		} else if (cas > 5) {
			System.out.println("Delovec mora zapustiti podjetje. ");
		}

	}
}
