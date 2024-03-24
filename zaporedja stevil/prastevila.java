package vaja_rpp;
import java.util.Scanner;

public class prastevila {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Vnesite pozicijo praštevila: ");
        int n = scanner.nextInt();
        
		if (n> 0 && n==(int)n) {

        int stevilo = 1, stevec = 0, i;//zacnemo z 1 in nastavimo stevec do n na 0

        while (stevec < n) {//prva zanka se izvaja dokler ne dosezemo n pri vsaki iteraciji se poveca stevilo
            stevilo ++;
            for (i = 2; i <= stevilo; i++) {
                if (stevilo % i == 0) {//preverja se ce je stevilo deljivo z vsemi stevilo do njega, ko ugotovi deljivost gre na drugi if 
                    break;
                }
            }
            if (i == stevilo) {// ce je prvo deljivo stevilo z njim stevilo samo potem je stevilo prastevilo in se stevec poveca za 1
                stevec ++;
            }
        }
        System.out.println("Praštevilo na poziciji " + n + " je " + stevilo);
    }
	  else {	  
	System.out.println("Napacen vnos.");

	}
}}
