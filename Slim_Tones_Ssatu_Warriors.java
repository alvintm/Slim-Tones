/*
* Slim Tones: Ssatu Warriors (Three Warriors)
* 
* With source text from "Soldier One Love" by Alvin T. Mwijuka
* 
* Inspired by the movie, The Day The Earth Stood Still (1955)
* 
* Created by Alvin T. Mwijuka
* Copyright (c) 2013 Massachusetts Institute of Technology. 
* All rights reserved.
* 
*/
import java.util.Random;

public class Slim_Tones_Ssatu_Warriors {
	
	static Random generator = new Random();
	static String[] vowel = {"a","e"};
	static String[] source = {"calm happens when they realize", 
		"the anxieties are different",
		"there is only one solo",
		"the sharing of blood at Day's Paradise",
		"creations and evasions of enlightenment",

		"they flex their stretchy muscles",
		"howling even at the next windings",
		"those circles look sharp",
		"they put things away",

		"affect happens when they realize",
		"the soldiers are different",
		"warriors strike alone",
		"with cohesion around them"};

	public static void main(String[] args) {	

		while (true){

			String tone = getTone();
			System.out.println(get(source));
			System.out.println("three stand" + tone + ", in kind");			
			System.out.println(get(source));
			System.out.println(get(source));
			System.out.println(getTone() + "\t" + tone + "\t" + getTone());
			System.out.println("warriors in" + getTone() + " strike alone");
			System.out.println();

			try {				
				Thread.sleep(16000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
		}
	}

	public static String get (String[] array) {
		int rnd = generator.nextInt(array.length);
		return array[rnd];
	}

	public static String getTone(){
		String[] bConsonant = {"kl","pl","gl","vl","sl","bl"}; // beginning
		String[] eConsonant = {"b","d","f","g","k","l","m","n","p","r","t"}; // ending
		return " " + get(bConsonant)+get(vowel)+get(eConsonant) + 'u';
	}

}
