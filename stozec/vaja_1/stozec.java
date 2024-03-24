package feri.rpp.rap;

import java.util.Scanner;
import static java.lang.Math.*;

public class stozec {
	public static void main(String[] args) 
	{
		Scanner vhod= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Vnesite polmer osnovne ploskve stožca [cm]: ");  
		double r = vhod.nextDouble();  
		System.out.print("Vnesite višino stožca [cm]: ");
		double v = vhod.nextDouble();
		double s = Math.sqrt(r*r + v*v);
		double prostornina = Math.PI*r*r*v/3;
		System.out.println("Prostornina stozca: " + prostornina + " cm3");
		double povrsina_stozca= Math.PI*r*(r+s);
		System.out.println("Povrsina stozca: " + povrsina_stozca +" cm2");
		double ploscina_osnovne_plosce = Math.PI*r*r;
		System.out.println("Ploscina osnovne ploskve: " + ploscina_osnovne_plosce +" cm2");
		double povrsina_plasca_stozca = Math.PI*r*s;
		System.out.println("Povrsina plasca stozca: " + povrsina_plasca_stozca +" cm2");
		double obseg_osnovne_plosce = Math.PI*r*2;
		System.out.println("Obseg osnovne ploskve: " + obseg_osnovne_plosce +" cm");
	}
}