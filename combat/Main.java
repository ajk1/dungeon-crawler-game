package combat;

import java.util.List;

import combat.entities.Entity;
import combat.field.Field;
import combat.field.tiles.TileFlag;

public class Main {
    public static void main(String[] args) {
    	Field field = new Field(5, 5, "n n n n n"
    								+ "v n n n v"
    								+ "v v n n v"
    								+ "n n n n v"
    								+ "n n n n n");
    	Entity character = new Entity(field, 10);
    	
    	field.attemptPlace(character, 2, 2); // Broken when moving left out of the field
    	
    	System.out.println("Move left successful? " + character.moveLeft());
    	System.out.println("Position: " + character.x() + ", " + character.y());
    	
    	List<TileFlag> flags = character.getTilesInDiamond(2);
    	for (TileFlag flag : flags) {
    		System.out.println(flag.x() + ", " + flag.y() + "\t" + flag.type());
    	}
    	System.out.println("\nTiles: " + flags.size());
	}
}
