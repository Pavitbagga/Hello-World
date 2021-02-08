
public class Game {
	public static void main(String[] args){
		
		System.out.println("Starting a new Game");
		
		GameCharacter player1 = new Plumber("Mario", 10 , 20);

		GameCharacter player2 = new Archer("Legolas", 10 , 20);
	
		int round =0;
		while(player1.isAlive() && player2.isAlive()) {
			System.out.println("Rount " + round + ": ");
			System.out.println(" " + player1 + " ");
			System.out.println(" " + player2);
			
			if(round%2 == 0) {
				player1.hit(player2.attack());
			}else {
				player2.hit(player1.attack());
			}
			
			if(!player1.isAlive()) {
				System.out.println(player1.getName() + " has been defeated!");
			}
			if(!player2.isAlive()) {
				System.out.println(player2.getName() + " has been defeated!");
			}
				
			round++;
		}
	
	
	}
}
