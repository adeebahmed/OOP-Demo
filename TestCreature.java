
public class TestCreature { //acceptenace test

	public static void main(String[] args) {
		
		final int THING_COUNT = 4; //array size
		
		//Thing Section
		Thing[] things = new Thing[THING_COUNT];
		things[0] = new Thing("Thing1");
		things[1] = new Thing("Thing2");
		things[2] = new Thing("Thing3");
		things[3] = new Fly("Thing4");
		
		System.out.println("\nThings: ");
		for(int i = 0; i < THING_COUNT; i++) 
			System.out.println(things[i]);
		
		//Creature Section
		Creature[] creatures = new Creature[THING_COUNT];
		Tiger tiger = new Tiger("Timmy");
		Ant ant = new Ant("Aunt");
		Fly fly = new Fly("Fun");
		Bat bat = new Bat("Billy");
		creatures[0] = tiger;
		creatures[1] = ant;
		creatures[2] = fly;
		creatures[3] = bat;
		
		System.out.println("\nCreatures: ");
		for(int i = 0; i < THING_COUNT; i++) {
			System.out.println(creatures[i]);
			creatures[i].move(); //polymorphism - selects approprite move(); method to use
		}
		
		System.out.println("\nTesting Eat Methods: ");
		tiger.eat(ant); //tigars eat anything
		tiger.whatDidYouEat(); //prints Aunt ant
		bat.eat(tiger); //bat cant eat tigar
		bat.eat(fly); //bat can eat fly
		bat.eat(things[1]);
		ant.eat(tiger);
		ant.eat(fly);
		ant.whatDidYouEat();
		fly.eat(things[2]);
		fly.eat(things[3]);
		fly.whatDidYouEat();
                
                /*System.out.println();
                ThingTest tt = new ThingTest();
                tt.testEat();
                tt.testToString();*/
	}
}
