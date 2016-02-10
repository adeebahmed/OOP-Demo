
public class Bat extends Creature implements Flyer {

	//constructor
	public Bat(String name) {
		super(name);
	}
	
	//methods
	public void eat(Thing t) {
		if(t == null)
                    return;
		
		if (t.getClass().getSimpleName().equals("Thing")) 
                    System.out.println(this + " won't eat a " + t);
                else 
                    super.eat(t);
		
	}
	
	public void fly() {
		System.out.println(this + " is blindly flying.");
	}

	public void move() {
		fly();
	}
	
}
