
import java.util.Scanner;

public class vektorji {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vnesite vektor: ");
        String[] vhod = scanner.nextLine().split(" ");//z metodo split razrezemo vektor na dele

        int[] vektor = new int[vhod.length];//ustavarimo polje njegove dolzine

        for (int i = 0; i < vhod.length; i++) {
            vektor[i] = Integer.parseInt(vhod[i]);//izpolnimo polje z cleni iz vhoda (vhod[i]), ki jih z Integer.parseInt pretvorimo v int - pravzaprav polje prepisemo v num obliko
        }


        System.out.println("Vnesite število za množenje ali drugi vektor: ");
        String[] vhod2 = scanner.nextLine().split(" ");


        if (vhod2.length == 1) {//prepoznama skalar

            int stevilo = Integer.parseInt(vhod2[0]);
            mnozenje_vektorja_s_skalarjem(vektor, stevilo);

        } 
        else if (vhod2.length == vektor.length) {// prepoznamo vektor

            int[] vektor2 = new int[vhod2.length];
            
            for (int i = 0; i < vhod2.length; i++) {// ga prepisemo v primerno obliko
                vektor2[i] = Integer.parseInt(vhod2[i]);
            }
            skalarniprodukt(vektor, vektor2);

        } 
        
        else {
            System.out.println("Napaka: Drugi vektor mora biti stevilo ali enake dolžine kot prvi vektor.");
        }
    }

    public static void mnozenje_vektorja_s_skalarjem(int[] vektor, int stevilo) {
       
        System.out.print("Izhodni vektor: ");

        for (int i = 0; i < vektor.length; i++) {//v obliki zanke mnozimo vsak clen polja z stevilom
            vektor[i] *= stevilo;
            System.out.print(vektor[i] + " ");
        }
    }

    public static void skalarniprodukt(int[] vektor1, int[] vektor2) {

        int product = 0;

        for (int i = 0; i < vektor1.length; i++) {//v obliki zanke izracunamo skalarni produkt
            
            product += vektor1[i] * vektor2[i];
        }
        System.out.println("Skalarni produkt vektorjev A x B: " + product);
    }
}