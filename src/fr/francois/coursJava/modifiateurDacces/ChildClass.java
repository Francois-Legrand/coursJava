package fr.francois.coursJava.modifiateurDacces;

public class ChildClass extends AnotherClass{

	public static void main(String[] args) {
		Cars voiture = new Cars(0, 0, 0, 0, 0);
		
		voiture.demarrer();
		
		voiture.freiner();
		
		voiture.esp();
		
		//voiture.ouvrirLeToit(); Je suis disponible que dans ma classe

	}

}
