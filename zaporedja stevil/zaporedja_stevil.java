package vaja_rpp;

import java.util.Scanner;

public class zaporedja_stevil {
	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
			
		System.out.println("Vnesite dolzino zaporedja lihih fibonaccijevih stevil:");
		int n = scanner.nextInt();
		int s = 0;

		n= Math.round((n-2)*3/2) + 3;//zmnozimo z ustreznim faktorjem da dobimo samo liha stevila

		if (n> 0 && n==(int)n) {
		 
		    System.out.print("Zaporedje lihih fibonaccijevih števil: ");//algoritem fibinacija
		 
			int f=0;
			int f1=1;
			int f2=1;
			
			  for (int i=1; i<=n;i++) {
			    if (i<3) {
			    f=1;
			    }
			    else {
				f=f1+f;
				f1=f2;
				f2=f;
			    }
			    
			    if (f%2!=0) {
			    System.out.print(f+" ");
		        s += f;//ustvarili smo novo spremeljivko s =0 in sedaj na koncu vsakega sklopa pristejemo f

		}}
		System.out.print("Vsota stevil je: "+ s);
		}
			  else {	  
		System.out.println("Napacen vnos.");

		}}}
