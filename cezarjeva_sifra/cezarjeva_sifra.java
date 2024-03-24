import java.util.Scanner;

public class cezarjeva_sifra {

    public static String cezarjevaSifra(String sporocilo, int kljuc, String nacin) {
        
        String rezultat = "";
        int premik;

        for (char znak : sporocilo.toCharArray()) { // Pretvori vhodni niz v tabelo znakov in gre cez vsak znak
            if (Character.isLetter(znak)) { // Preveri, ali je trenutni znak crka
                premik = Character.isUpperCase(znak) ? 65 : 97;//lociranje na ASCII tabeli ce je velika 65, ce je mala 97
                int novZnak = znak - premik + kljuc;//izrcunamo pozicijo
                if (novZnak >= 91 && novZnak <= 96) {//odzamemo del, ki ni abeceda
                    novZnak -= 91;
                }
                rezultat += (char) ((znak - premik + kljuc) % 26 + premik); // dobimo razultat deljenje z 26 je poslidica dolzine abecede
            } else {
                rezultat += znak; // ce trenutni znak ni crka, ga pusti nespremenjenega
            }
        }

        return rezultat;
    }

    public static void main(String[] args) {
        Scanner vhod = new Scanner(System.in);

        System.out.println("Izberite stevilko pred zeljeno operacijo: ");
        System.out.println("1. Sifriranje");
        System.out.println("2. Desifriranje");
        String nacin = vhod.nextLine();

        String vnos ="";

        if (nacin.equals("2")){

        vnos ="de";  

        }

        System.out.println("Vnesite sporocilo za " + vnos + "sifriranje: "); 
        String sporocilo = vhod.nextLine();

        System.out.println("Vnesite stevilo za zamik abecede: ");

        int kljuc = vhod.nextInt();

        if (nacin.equals("2")){

        kljuc = 26 - kljuc; 

        }

        

        System.out.println(vnos+"sifrirano sporočilo: " + cezarjevaSifra(sporocilo, kljuc, nacin));

    }
}