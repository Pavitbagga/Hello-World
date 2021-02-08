
public abstract class GameCharacter {
	
	protected String name;
	protected int maxStrength;
	protected int maxHealth;
	protected int strength;
	protected int health;
	protected static int DEFAULT_STRENGTH =10;
	protected static int DEFAULT_HEALTH =10;
	
	public GameCharacter() {
		this("Unknown", DEFAULT_STRENGTH , DEFAULT_HEALTH);
	}
	public GameCharacter(String name) {
		this(name , DEFAULT_STRENGTH , DEFAULT_HEALTH);
	}
	
	public GameCharacter(String name, int strength, int health) {
		super();
		this.name = name;
		this.maxStrength = strength;
		this.maxHealth = health;
		this.strength = strength;
		this.health = health;
	}
	
	public abstract int attack();
	public abstract void hit(int points);
	
	public boolean isAlive() {
		return health> 0;
	}
	
	public String getName() {
		return name;
	}
	public int getStrength() {
		return strength;
	}
	public int getHealth() {
		return health;
	}
	
	public String toString() {
		return name+ ": Strength:" + strength + " /" + maxStrength+" Health:" + health+" /" +maxHealth;
	}
}
