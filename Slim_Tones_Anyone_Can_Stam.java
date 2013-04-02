/*
* Slim Tones: Anyone Can Stam
* 
* Created by Alvin T. Mwijuka
* Copyright (c) 2012 Massachusetts Institute of Technology. 
* All rights reserved.
* 
*/
import java.util.Random;

public class Slim_Tones_Anyone_Can_Stam {

static Random generator = new Random();

static String[] consonant = {"b","c","d","f","g","h","k","l","m","n","p","r","s","t","ch","ph","st","sh"};
static String[] vowel = {"a","e","i","o", "u", "ae"};
static String[] article = {" a"};
static String[] pronoun = {"Anyone","Anybody","Anything","Any","Any one","Any body","Any thing"};
static String[] number = {" many"," most"," few"," some"," several"};
static String[] election = {" choose to"," see fit to"," wish to"," prefer to"};

public static void main(String[] args) {	
	
	while (true){

		System.out.println(get(pronoun) + " can" + getVerb());
		System.out.println(get(pronoun) + " can" + getVerb());
		System.out.println(get(pronoun) + " can have" + get(article) + getNoun());
		System.out.println("    But" + get(number) + get(election) + getVerb());
		System.out.println();
		
		try {				
			Thread.sleep(12000);
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
	String[] bConsonant = {"ch","ph","cr","th","tr","st","sh","str","wr"}; // beginning
	String[] eConsonant = {"b","mp","d","f","g","h","k","l","m","n","p","r","t","ch","ph","th","st","sh"}; // ending
	return " " + get(bConsonant)+get(vowel)+get(eConsonant);
}

public static String getNoun(){	
	return " " + get(consonant) + get(vowel) + get(consonant);
}

}
