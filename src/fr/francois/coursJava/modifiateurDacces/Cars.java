package fr.francois.coursJava.modifiateurDacces;

public class Cars {
	private int roues = 4; //Je suis disponible uniquement dans la classe voiture
	protected int volant = 1; //Je suis disponible uniquement dans les classes et les sous classes du même package
	public int vitesse = 5; //Je suis disponible partout
    int carosserie = 1; //Je suis disponible uniquement dans les classes du même package
	private int siege = 5;
	private double prix = 15000;
	
	public Cars(int roues, int volant, int vitesse, int carosserie, int siege) { //Je suis un contructeur et je contruit des voitures en initialisant des paramètres
		
		this.roues = roues;
		this.volant = volant;
		this.vitesse = vitesse;
		this.carosserie = carosserie;
		this.siege = siege;
	}

	//Je vais facilité l'utilisation des voitures aux publics et en même temps protéger mon ingénieuse construction.
	public int getRoues() {
		// Tu devra passer par moi pour récuperer cette information
		return roues;
	}

	public void setRoues(int roues) {
		// Tu devra passer par moi pour definir cette information ex:
		if(roues < 4 || roues > 5) {
			System.out.println("Nos voitures ont toutes 4 roues");
		}else {
			this.roues = roues;
		}
		
	}

	public int getVolant() {
		return volant;
	}

	public void setVolant(int volant) {
		this.volant = volant;
	}

	public int getVitesse() {
		return vitesse;
	}

	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}

	public int getCarosserie() {
		return carosserie;
	}

	public void setCarosserie(int carosserie) {
		this.carosserie = carosserie;
	}

	public int getSiege() {
		return siege;
	}

	public void setSiege(int siege) {
		this.siege = siege;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		
		this.prix = prix;
	}
	public void demarrer() {
		System.out.println("Vroom!");
	}
	
	
}

