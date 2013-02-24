/*
* Slim Tones: III (Temporary)
* 
* With source text from "Soldier One Love" by Alvin T. Mwijuka
* 
* Created by Alvin T. Mwijuka
* Copyright (c) 2012 Massachusetts Institute of Technology. 
* All rights reserved.
* 
*/
package Slim_Tones;

import java.util.Random;

public class Slim_Tones_III {
	static Random generator = new Random();

	static String[] consonant = {"b","c","d","f","g","h","k","l","m","n","p","r","s","t","ch","ph","st","sh"};
	static String[] vowel = {"a","e","i","o", "u", "y"};
	static String[] article = {"A","The"};
	static String[] source = {"calm happens when you realize", 
		"the anxieties are different",
		"and there is only one solo",
		"the sharing of blood at Day's Paradise",
		"creates an evasion of enlightenment",

		"we flex our stretchy muscles",
		"howl even at the next windings",
		"whose circles look sharp as",
		"they put things away",

		"affect happens when you realize",
		"the soldiers are different",
		"A warrior strikes alone with the",
		"cohesion around him"};

	public static void main(String[] args) {	

		while (true){

			String noun = getNoun();
			String verb = getVerb();
			System.out.println(get(source));
			System.out.println("The" + noun + " has come and has"+ verb+"d");
			
			System.out.println(get(source));
			System.out.println(get(source));
			System.out.println("A" + noun + " will come and"+ verb);			
			System.out.println();

			try {				
				Thread.sleep(14000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
		}
	}

	public static String get (String[] array) {
		int rnd = generator.nextInt(array.length);
		return array[rnd];
	}

	public static String getVerb(){
		String[] bConsonant = {"ch","ph","cr","tr","st","sh"}; // beginning
		String[] eConsonant = {"b","c","d","f","g","k","l","m","n","p","r","t"}; // ending
		return " " + get(bConsonant)+get(vowel)+get(eConsonant) + 'e';
	}

	public static String getNoun(){	
		return " " + get(consonant) + get(vowel) + get(consonant) + get(vowel);
	}

}
