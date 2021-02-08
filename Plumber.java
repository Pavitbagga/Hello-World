import java.util.Random;

public class Plumber extends GameCharacter{

	public Plumber(String name) {
		this(name, DEFAULT_STRENGTH, DEFAULT_HEALTH);
	}
	
	public Plumber(String name, int strength, int health) {
		super(name, strength, health);
	}
	
	
	@Override
	public int attack() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int points = rand.nextInt(strength/2)+ (strength/2) + 1;
		System.out.println(" " + name + " swigns the Wrench of Power with " +points + " points!");
		
		return points;
	}

	@Override
	public void hit(int points) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		boolean duckInPipe = false;
		if(rand.nextInt(5) == 1) {
			duckInPipe = true;
		}
		if(duckInPipe) {
			System.out.println(" " + name + " ducks into a pipe!");
		}else {
			System.out.println(" " + name + "health reduced by " + points);
			health -= points;
		}
		
	}

}
