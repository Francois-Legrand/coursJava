package fr.francois.coursJava.stati;

public class People {
	private String nom;
	private int age;
	protected static int nombreDePersonne;
	
	public People(String nom, int age) {
		this.nom = nom;
		this.age = age;
		nombreDePersonne++;
	}
	
}
