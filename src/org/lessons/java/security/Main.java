package org.lessons.java.security;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
//		NAME
		
		System.out.println("Inserisci il tuo nome: ");
		
		String name=in.nextLine();
		
//		Surname
		System.out.println("Inserisci il tuo cognome:" );
		
		String surname= in.nextLine();
		
		surname=surname.replaceAll(" ", "");

//		Color
		System.out.println("Inserisci il tuo colore preferito:" );
		
		String color= in.nextLine();
		
//		Day
		
		System.out.println("Inserisci il tuo giorno di nascita:" );
		
		String day= in.nextLine();
		
		int dayInt=Integer.valueOf(day);
		
//		month
		
		System.out.println("Inserisci il tuo mese di nascita:" );
		
		String month= in.nextLine();
		
		int monthInt=Integer.valueOf(month);
		
//		Year
		
		System.out.println("Inserisci il tuo anno di nascita:" );
		
		String year= in.nextLine();
		
		int yearInt=Integer.valueOf(year);
		
		
//		Date sum
		
		int sum= dayInt+monthInt+yearInt;
		
		System.out.println("La tua password è : "+name+"-"+surname+"-"+color+"-"+sum);
		
	}
}
