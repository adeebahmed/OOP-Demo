import static org.junit.Assert.*;
import org.junit.Test;

public class ThingTest {

	private Thing thing;
	private Ant ant;
	private Bat bat;
	private Fly fly;
	private Tiger tiger;
	
	public ThingTest() {
		thing = new Thing("taco");
		ant = new Ant("Aunt");
		bat = new Bat("Billy");
		fly = new Fly("Fun");
		tiger = new Tiger("Timmy");
	}
	
	@Test
	public void testEat() {
		
            	tiger.eat(thing); //tiger eats everything
		assertEquals(tiger.getStomach(), thing);
		tiger.eat(bat);
		assertEquals(tiger.getStomach(), bat);
		ant.eat(bat);
		assertEquals(ant.getStomach(), bat);
		bat.eat(fly);
		assertEquals(bat.getStomach(), fly);
		bat.eat(null); //if the bat eats nothing afte eating fly, still should return fly
		assertEquals(bat.getStomach(), fly);
		bat.eat(thing);
		assertEquals(bat.getStomach(), fly); //bat can't eat Things, should return fly
		fly.eat(thing);
		assertEquals(fly.getStomach(), thing);
		fly.eat(fly);
		assertEquals(fly.getStomach(), thing); //fly can't eat a fly, still thing

	}
        
	@Test
	public void testToString() {
		assertEquals(thing.toString(), "taco" );
		assertEquals(ant.toString(), "Aunt Ant");
		assertEquals(bat.toString(), "Billy Bat");
		assertEquals(fly.toString(), "Fun Fly");
		assertEquals(tiger.toString(), "Timmy Tiger");
	}
}
