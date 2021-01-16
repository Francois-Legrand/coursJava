package fr.francois.coursJava.contructor;

public class Voitures {
	int roues = 4;
	int volant = 1;
	int vitesse = 5;
	int carosserie = 1;
	int siege = 5;
	
	public Voitures(int roues, int volant, int vitesse, int carosserie, int siege) { //Je suis un contructeur et je contruit des voitures en initialisant des paramètres
		
		this.roues = roues;
		this.volant = volant;
		this.vitesse = vitesse;
		this.carosserie = carosserie;
		this.siege = siege;
	}
	
	
}
