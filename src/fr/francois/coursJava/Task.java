package fr.francois.coursJava;

// class Task
public class Task {
	public String title;
	public String description;
	public boolean completed = false;
	
	// Task contructor
	public Task(String description, String title) {
		// this correspond à l'objet courant ex: tache1...etc
		this.description = description;
		this.title = title;
	}
	public void complete() {
		completed = true;
	}
	
}
