package fr.francois.visibility;

public class Visibility {
	
	double friendly;
	
	public int visible;
	
	protected String visibleOnlyInTheSameFolder;
	
	private float visibleOnlyInTheSameClass;
	
	void friendlyVisible() {
		System.out.println("visible");
	}
	
	public void visible() {
		
		System.out.println("visible");
	}
	
	protected void visibleOnlyInTheSameFolder() {
		
		System.out.println("visible");
	}
	
	private void visibleOnlyInTheSameClass() {
		
		System.out.println("visible");
	}
	
	public void getInTheSameClass() {
		
		visibleOnlyInTheSameClass();
	}
}
