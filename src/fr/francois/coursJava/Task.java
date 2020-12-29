package fr.francois.coursJava;

public class Task {
	public String title;
	public String description;
	public boolean completed = false;
	
	public Task(String desc, String titl) {
		description = desc;
		title = titl;
	}
	public void complete() {
		completed = true;
	}
	
}
