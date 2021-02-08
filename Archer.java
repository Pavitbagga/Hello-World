import java.util.Random;

public class Archer extends GameCharacter {

	public Archer(String name) {
		this(name, DEFAULT_STRENGTH, DEFAULT_HEALTH);
	}
	
	public Archer(String name, int strength, int health) {
		super(name, strength, health);
	}
	
	
	@Override
	public int attack() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int points = rand.nextInt(strength/2)+ (strength/2) + 1;
		System.out.println(" " + name + " shoots an arrow " +points + " points!");
		
		return points;
	}

	@Override
	public void hit(int points) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		boolean dodges = false;
		if(rand.nextInt(5) == 1) {
			dodges = true;
		}
		if(dodges) {
			System.out.println(" " + name + " dodges the attack!");
		}else {
			System.out.println(" " + name + "health reduced by " + points);
			health -= points;
		}
		
}
}
