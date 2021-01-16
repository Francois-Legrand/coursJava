package fr.francois.coursJava.heritage;

public class Daughter extends Mother {
	int grainsDeBeaute = 2;
	
	public Daughter(String yeux, String cheveux, int taille, int poids) {
		super(yeux, cheveux, taille, poids);
	}

	public Daughter(String yeux, String cheveux, int taille, int poids, int grainsDeBeate) {
		super(yeux, cheveux, taille, poids);
		
		this.grainsDeBeaute = grainsDeBeate;
		
	}
	//Surcharge de la méthode
	public void faireDuVelo(String lequel, String ou) {
		
		System.out.println("je fais du vélo de " +lequel+" dans "+ou);
		
	}
	
	public static void main(String[] args) {
		
		Daughter francois = new Daughter("bleu", "blond" , 150, 50, 1);
		
		francois.faireDuVelo("trail","les bois");
		
	}
	
	

	
	
	
}
