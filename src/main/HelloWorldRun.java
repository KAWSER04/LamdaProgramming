package main;

public class HelloWorldRun {
	
	public static void main(String[] args) {
		
		HelloWorld hr=(name)->"Hello"+ name;
		String h=hr.sayHello("kawser");
		System.out.print(h);
		
	}

}
