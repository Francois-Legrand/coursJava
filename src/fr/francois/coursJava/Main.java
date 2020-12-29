package fr.francois.coursJava;

import java.util.Scanner;

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
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("entrez votre nom");
		
		String name = in.nextLine();
		
		System.out.println("entrez votre age");
		
		int year = in.nextInt();
		
		in.close();
		
		People people1 = new People(name, year);
		
		
		people1.setName(name);
		
		people1.setYear(year);
		
		System.out.println("Lannée de naissance de "+people1.getName()+" est "+people1.getYear());
	}

}
