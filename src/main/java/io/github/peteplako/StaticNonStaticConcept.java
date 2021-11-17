package io.github.peteplako;

public class StaticNonStaticConcept {
	
	String name = "Petros";
	static int age = 40;
	
	
	public void sendMail() {
		System.out.println("Edw einai to email");
	}
	
	
	public static void sum() {
		System.out.println("Edw einai to sum");
	}
	

	public static void main(String args[]) {
		
		sum();
		StaticNonStaticConcept obj = new StaticNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		System.out.println(age);
	}

}
