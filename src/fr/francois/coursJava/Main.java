package fr.francois.coursJava;

import java.util.Scanner;

import javax.swing.JOptionPane;

import fr.francois.visibility.*;

public class Main {

	public static void main(String[] args) {
		
		//Scanner in = new Scanner(System.in);
		
		//System.out.println("entrez une nouvelle tache");
		
		//String title = in.nextLine();
		
		//System.out.println("Description de la tache");
		
		//String description = in.nextLine();
		
		//in.close();
		
		//Task tache1 = new Task(title, description);
		
		//tache1.complete();
		
		//System.out.printf("ma premiere tache est de %s qui consite a %s", title, description);
		
		
		//Scanner in = new Scanner(System.in);
		
		//System.out.println("entrez votre nom");
		
		String name = JOptionPane.showInputDialog("Quel est ton nom ?");
		
		//System.out.println("entrez votre age");
		
		int year = Integer.parseInt(JOptionPane.showInputDialog("Quel est ton age ?"));
		
		//in.close();
		
		People people1 = new People(name, year);
		
		
		people1.setName(name);
		
		people1.setYear(year);
		
		System.out.println("Lannée de naissance de "+people1.getName()+" est "+people1.getYear());
		
		Visibility a = new Visibility();
		//En friendly tous les attribus et méthodes d'une classe sont accessibles uniquement dans le même dossier et via des classes enfants tous les attribus et méthodes d'une classe sont accessibles uniquement dans le même dossier et via des classes enfants 
		
		//a.friendlyVisible();
		
		//En public tous les attribus et méthodes d'une classe sont accessible partout dans le programme avec la possibilité d'importer une classe en dehors d'un dossier
		
		a.visible();
		
		//En protected tous les attribus et méthodes d'une classe sont accessibles uniquement dans le même dossier et via des classes enfants 
		
		//a.visibleOnlyInTheSameFolder();
		
		//En private tous les attribus et méthodes d'une classe sont accessibles uniquement dans la même classe
		
		//a.visibleOnlyInTheSameClass();
	}

}
