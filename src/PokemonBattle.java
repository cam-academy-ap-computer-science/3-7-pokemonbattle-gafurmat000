/* BattleStart *
 * write a method that is called battleStart()
 * method battleStart() prompts user to choose their first pokemon battle
 * battleStart returns the name of the pokemon chosen
 * battleStart will be one of the methods in main
 * 
 * Damage *
 * Next method is gonna be called damage()
 * damage takes a pokemon's name and uses it as a parameter and returns hp after damage is done
 * using the equation to find damage. damage = (2*Level+10/250 + Attack/Defense * Base + 2) * Modifier
 * find the modifier by using this equation, modifier = Same Type attack bonus (STAB) * Random
 * 
 * statsTable *
 * create a method called statsTable
 * the table should show up, that accepts the user’s Pokemon name, and stats as parameters
 */
import java.util.*;  // Scanner
public class PokemonBattle {

	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		String username = battleStart();
		int hp = Damage(username);
		StatsTable(username, hp); 
	}
	public static String battleStart() {
		System.out.println("Another trainer is issuing a challenge!");
		System.out.println("Zebstrika appeared.");
		System.out.println("Which Pokemon do you choose?");
			String username = userInput.nextLine();
			System.out.println("You chose " + username + "!");
			System.out.println("It's a Pokemon battle between Zebstrika and " + username + "! Go!");
			System.out.println();
			return username;
	}
	public static int Damage(String username) {
		System.out.println("Zebstrika used Thunderbolt!");
		System.out.println("Trainer what are your " + username + "'s stats?");
		System.out.print("Level: ");    
		int Level = userInput.nextInt();
		System.out.print("Attack: ");
		int Attack = userInput.nextInt();
		System.out.print("Defense: ");
		int Defense = userInput.nextInt();
		System.out.print("Base: ");
		int Base = userInput.nextInt();
		System.out.print("STAB: ");
		int STAB = userInput.nextInt();
		System.out.print("HP: ");
		int HP = userInput.nextInt();
		System.out.println();
		double Modifier = (0.85 + (Math.random() * 0.15)) * STAB; //equation for modifier
		int Damage = (int)((((2 * Level + 10) / (250)) + ((Attack / Defense) * Base) + 2) * Modifier); //
		System.out.println(username + " sustained " + Damage + " points of damage."); 
		int hp = HP - 10; // new hp after attack
		System.out.println("HP, after damage, is now " + hp);
		System.out.println();
		return hp;
		
	}
	public static void StatsTable(String username,int hp) { 
		System.out.println("Name     "+ username);
		System.out.println("Level     40");
		System.out.println("------------------------------"); 
		System.out.println("HP     " + hp);
		System.out.println("Attack     51");
		System.out.println("Defense    51");
		System.out.println("Sp. Atk   121");
		System.out.println("Sp. Def   81");
		System.out.println("Speed 	  107");
		System.out.println("------------------------------"); 
	}
}
		