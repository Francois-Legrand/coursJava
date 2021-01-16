package fr.francois.coursJava.modifiateurDacces;

public class AnotherClass {

	public static void main(String[] args) {
		Cars voiture = new Cars(0, 0, 0, 0, 0);
		
		voiture.demarrer(); //je suis public
		
		voiture.freiner(); //je suis package private
		
		voiture.esp(); //je suis protected
		
		//voiture.ouvrirLeToit(); Je ne suis pas visible

	}

}
