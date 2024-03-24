import java.util.Scanner;

public class vektorji2 {
    public static void main(String[] args) {
        Scanner vhod = new Scanner(System.in);

        System.out.println("Vnesite dimenzijo matrik: ");
        int n = vhod.nextInt();
        vhod.nextLine();  // konec branja

        System.out.println("Vnesite matriko A:");
        int[][] matrikaA = beri_matriko(vhod, n);

        System.out.println("Vnesite matriko B:");
        int[][] matrikaB = beri_matriko(vhod, n);

        mnozi_matrike(matrikaA, matrikaB);
    }

    public static int[][] beri_matriko(Scanner vhod, int n) {
       
        int[][] matrika = new int[n][n];//polje polj n*n

        for (int i = 0; i < n; i++) {
            String[] vhod_matrika = vhod.nextLine().split(" ");//preberemo in razrezemo matriko v vrsti

            for (int j = 0; j < n; j++) {
                matrika[i][j] = Integer.parseInt(vhod_matrika[j]);//zapisemo matriko v obliki num
            }
        }
        return matrika;
    }

    public static void mnozi_matrike(int[][] matrikaA, int[][] matrikaB) {
       
        int n = matrikaA.length;
        int[][] rezultat = new int[n][n];//ustavrimo polje polj za rezultat

        for (int i = 0; i < n; i++) {//mnozimo vsa poljamed seboj
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    rezultat[i][j] += matrikaA[i][k] * matrikaB[k][j];
                }
            }
        }

        System.out.println("Zmnožek matrik A * B:");
        for (int i = 0; i < n; i++) {//zapisemo kot matriko
            for (int j = 0; j < n; j++) {
                System.out.print(rezultat[i][j] + " ");
            }
            System.out.println();
        }
    }
}