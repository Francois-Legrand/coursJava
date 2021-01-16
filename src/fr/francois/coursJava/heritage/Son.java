package fr.francois.coursJava.heritage;

public class Son extends Mother {
	int lipome = 1;
	
	public Son(String yeux, String cheveux, int taille, int poids) {
		super(yeux, cheveux, taille, poids);
		
	}
	
	public Son(String yeux, String cheveux, int taille, int poids, int lipome) {
		super(yeux, cheveux, taille, poids);
		this.lipome = lipome;
	}
	//redéfinition de la méthode
	public void faireDuVelo() {
		
		super.faireDuVelo("vélo d'appartement");
		
	}
	
	public static void main(String[] args) {
		
		Son francois = new Son("marron", "brun" , 180, 80, 1);
		
		francois.faireDuVelo();
		
	}
}
