package fr.francois.coursJava.heritage;

public class Mother {
	String  yeux = "bleu";
	String cheveux = "blond";
	int taille = 160;
	int poids = 60;
	
	public Mother(String yeux, String cheveux, int taille, int poids) {
		this.yeux = yeux;
		this.cheveux = cheveux;
		this.taille = taille;
		this.poids = poids;
	}

	public void faireDuVelo(String nom) {
		
		System.out.print("Je fais du "+nom);
	}


}
