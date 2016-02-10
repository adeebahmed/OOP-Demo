
public abstract class Creature extends Thing { /* An abstrct class of thing*/

	private Thing stomach; //a stomach to hold the last thing the Creature ate
	
	public Creature(String name) {
		super(name);
		stomach = null;
	}
	
	//creatures may be asked to eat various Things
	public void eat(Thing t) {
		System.out.println(this + " has just eaten " + t);
		stomach = t; //fill the stomach with the Thing
	}
	
	//Tell the creature to move
	public abstract void move();
	
	//Make the Creature tell what is in its stomach
	public void whatDidYouEat() {
		if (stomach == null) 
                    System.out.println(super.toString() + " has had nothing to eat!");
		else
                    System.out.println(super.toString() + " ate a " + stomach);
		
	}
	
	public Thing getStomach() {
		return stomach;
	}
	
	
}
