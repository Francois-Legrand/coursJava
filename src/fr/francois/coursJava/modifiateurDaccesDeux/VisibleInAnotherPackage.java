package fr.francois.coursJava.modifiateurDaccesDeux;

import fr.francois.coursJava.modifiateurDacces.Cars;

public class VisibleInAnotherPackage {

	public static void main(String[] args) {
		Cars voiture = new Cars(0, 0, 0, 0, 0);
		
		voiture.demarrer();
		
		//voiture.freiner(); // Je ne suis pas visible dans un autre package
		
		//voiture.esp(); // Je ne suis pas visible dans un autre package
		
		//voiture.ouvrirLeToit(); Je suis disponible que la ma classe

	}

}
