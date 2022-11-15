package org.train.price;

import java.util.Scanner;

public class CalcoloPrezzoBiglietto {
	
	/*
	Esercitazione di oggi: Biglietto del treno
	Nome repo: java-biglietto-treno
	Il programma dovrà chiedere all'utente il numero di chilometri che vuole percorrere e l'età del passeggero. Sulla base di queste informazioni dovrà calcolare il prezzo totale del viaggio, secondo queste regole:
	il prezzo del biglietto è definito in base ai km (0.21 € al km)
	va applicato uno sconto del 20% per i minorenni
	va applicato uno sconto del 40% per gli over 65

	-------------------------------------

	BONUS1: i minori di 12 anni viaggiano gratis
	BONUS2: ogni km costa 1 centesimo piu' del precedente (es: 1km = 0.21E, 2km = 0.43, 3km = 0.66E, ecc)
	*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci i km da percorrere: ");
		int userKm = sc.nextInt();
		
		System.out.print("Inserisci la tua età: ");
		int userAge = sc.nextInt();
		
		sc.close();
		
		double userTicket = 0.21 * userKm;
		
		if (userAge < 18) {
		    userTicket = (userTicket - userTicket * 20 / 100);
		    
		    if(userAge < 12) {
		    	userTicket = 0;
				System.out.println("Biglietto gratuito per i minori di 12 anni");
		    } else {
		    	System.out.println("Prezzo biglietto con sconto 20% per minorenni: " + String.format("%.2f", userTicket)+"€");
		    }
		    
		} else if (userAge > 65) {
		    userTicket = (userTicket - userTicket * 40 / 100 );
		    System.out.println("Prezzo biglietto con sconto 40% per over 65: " + String.format("%.2f", userTicket)+"€");
		} else if (userAge < 12) {
			userTicket = 0;
			System.out.println("Biglietto gratuito per i minori di 12 anni");
		} else {
			System.out.println("Prezzo biglietto intero: " + String.format("%.2f",userTicket)+"€");
		}

	}

}
