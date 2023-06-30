package test;

class Superobject { 
	public void paint() { 
		draw();
		
	
}
	public void draw() {
		draw();
		System.out.println("Super object");
	}
}

class Subobject extends Superobject { 
	
	public void paint() {
		super.draw();
		
	}
	public void draw() {
		System.out.println("Sub object");
	}
}


public class Test03 {
	public static void main(String[] args) {
		Superobject a = new Superobject();
		a.paint();
	}
}
