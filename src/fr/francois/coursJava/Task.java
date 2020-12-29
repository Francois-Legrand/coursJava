package fr.francois.coursJava;

// class Task
public class Task {
	public String title;
	public String description;
	public boolean completed = false;
	
	// Task contructor
	public Task(String desc, String titl) {
		description = desc;
		title = titl;
	}
	public void complete() {
		completed = true;
	}
	
}
