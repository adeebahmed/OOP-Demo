
public class Fly extends Creature implements Flyer {

	
	public Fly(String name) {
		super(name);
	}
	

	public void eat(Thing t) {
		
		if(t.getClass().getSimpleName().equals("Thing")) 
                    super.eat(t);
                else  
                    System.out.println(this + " won't eat a " + t);
		
			
	}
	
	public void fly() {
		System.out.println(this + " is annoyingly buzzing.");
	}
	
	public void move() {
		fly();
	}
	
	
	
	
}
