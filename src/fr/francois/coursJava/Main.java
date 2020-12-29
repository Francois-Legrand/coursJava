package fr.francois.coursJava;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("entrez une nouvelle tache");
		
		String title = in.nextLine();
		
		System.out.println("Description de la tache");
		
		String description = in.nextLine();
		
		in.close();
		
		Task tache1 = new Task(title, description);
		
		tache1.complete();
		
		System.out.printf("ma premiere tache est de %s qui consite a %s", title, description);
		
	}

}
