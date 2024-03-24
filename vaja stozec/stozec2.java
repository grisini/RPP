
import java.util.Scanner;
import static java.lang.Math.*;

public class stozec {

    public static void main(String[] args) //skeniramo podatke
	{
		Scanner vhod= new Scanner(System.in);    
        double r, v;
        if (args.length == 2) {
            r = Double.parseDouble(args[0]);
            v = Double.parseDouble(args[1]);
        } else {
            System.out.print("Vnesite polmer osnovne ploskve stožca [cm]: ");
            r = vhod.nextDouble();
            System.out.print("Vnesite višino stožca [cm]: ");
            v = vhod.nextDouble();
        }
        double s = Math.sqrt(r*r + v*v);
    
        int izbira;

        do {//zanka do izvede vprasanja
            System.out.println("Izberite možnost:");
            System.out.println("1. Prostornina");
            System.out.println("2. Površina");
            System.out.println("3. Ploščina osnovne ploskve");
            System.out.println("4. Ploščina plašča");
            System.out.println("5. Obseg osnovne plošče");
            System.out.println("6. Izpis vseh lastnosti");
            System.out.println("7. Izhod");
            System.out.print("Vnesite izbiro: ");
            izbira = vhod.nextInt();

            switch (izbira) {//switch zaganja podprograme
                case 1:
                    prostornina(r, v);
                    break;
                case 2:
                    povrsina(r, s);
                    break;
                case 3:
                    ploscina_osnovne_plosce(r);
                    break;
                case 4:
                    ploscina_plasca(r, s);
                    break;
                case 5:
                    obseg_osnovne_ploskve(r);
                    break;
                case 6:
                    izpisiVseLastnostiStozca(r, v, s);
                    break;
                case 7:
                    System.out.println("Izhod.");
                    break;
                default:
                    System.out.println("Napačna izbira. Poskusite znova.");
            }
        } while (izbira != 7);//ko je izbira 7 vrze na izhod

	}

    public static void prostornina(double r, double v) {//prvi podprogram

        double prostornina_stozca = Math.PI*r*r*v/3;
        long prostornina = Math.round(prostornina_stozca);//zaokrozevanje
		System.out.println("Prostornina stozca: " + prostornina + " cm3");

    }

    public static void povrsina(double r, double s) {

		double povrsina_stozca= Math.PI*r*(r+s);
        double povrsina = Math.round(povrsina_stozca * 100.0) / 100.0;//zaokrozevanje na dve decimalki na celo krat 100, deljeno s 100
		System.out.println("Povrsina stozca: " + povrsina +" cm2");

    }

    public static void ploscina_osnovne_plosce(double r) {

        double ploscina_osnovne_plosce = Math.PI*r*r;
        double ploscina = Math.round(ploscina_osnovne_plosce * 100.0) / 100.0;
        System.out.println("Ploscina osnovne ploskve: " + ploscina +" cm2");

    }

    public static void ploscina_plasca(double r, double s) {

		double povrsina_plasca_stozca = Math.PI*r*s;
        double povrsina1 = Math.round(povrsina_plasca_stozca * 100.0) / 100.0;
		System.out.println("Povrsina plasca stozca: " + povrsina1 +" cm2");

    }

    public static void obseg_osnovne_ploskve(double r) {

		double obseg_osnovne_plosce = Math.PI*r*2;
        double obseg = Math.round(obseg_osnovne_plosce * 100.0) / 100.0;
		System.out.println("Obseg osnovne ploskve: " + obseg +" cm");

    }

    public static void izpisiVseLastnostiStozca(double r, double v, double s) {


        double prostornina_stozca = Math.PI*r*r*v/3;
        long prostornina = Math.round(prostornina_stozca);
		System.out.println("Prostornina stozca: " + prostornina + " cm3");
		double povrsina_stozca= Math.PI*r*(r+s);
        double povrsina = Math.round(povrsina_stozca * 100.0) / 100.0;
		System.out.println("Povrsina stozca: " + povrsina +" cm2");
        double ploscina_osnovne_plosce = Math.PI*r*r;
        double ploscina = Math.round(ploscina_osnovne_plosce * 100.0) / 100.0;
		double povrsina_plasca_stozca = Math.PI*r*s;
        double povrsina1 = Math.round(povrsina_plasca_stozca * 100.0) / 100.0;
		System.out.println("Povrsina plasca stozca: " + povrsina1 +" cm2");
		double obseg_osnovne_plosce = Math.PI*r*2;
        double obseg = Math.round(obseg_osnovne_plosce * 100.0) / 100.0;
		System.out.println("Obseg osnovne ploskve: " + obseg +" cm");


    }
}
