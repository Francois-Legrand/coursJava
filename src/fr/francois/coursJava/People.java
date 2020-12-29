package fr.francois.coursJava;

import java.util.Date;

import java.text.SimpleDateFormat;

public class People {
	
	private String name;
	
	private int year;
	
	private Date date = new Date();
	
	private SimpleDateFormat dateLongue = new SimpleDateFormat("yyyy");
	
	private int dateCourte = Integer.parseInt(dateLongue.format(date));
	
	public People(String name, int year) {
		
		this.name = name;
		
		this.year = year;
	}

	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		
		this.name = name;
	}

	public int getYear() {
		
		return dateCourte - year;
	}

	public void setYear(int year) {
		
		if (year < 1) {
			
			this.year = year;
			
			System.out.println("Vous ne pouvez pas faire cela");
			
			
		}else if (year >= 1 && year < 18) {
			
			System.out.println("Vous avez "+year+" ans, l'accès est donc interdit");
			
		}else {
			
			System.out.println("Vous avez "+year+" ans, vous avez accès au site");
			
			this.year = year;
		}
		
	}
}
