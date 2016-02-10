package combat.entities;

import combat.field.Field;
import combat.field.tiles.Tile;

/**
 * Object that moves around
 * 
 * @author Kevin
 *
 */
public class Entity extends HasHp {
	
	/**
	 * Reference to the field it exists on
	 * 
	 * To be used in AI when you have to
	 * reference the Entity's surroundings
	 * 
	 * This might have to be put into the
	 * Object class
	 */
	private Field field; 
	
	public Entity(Field field, int hp) {
		super(hp);
		this.field = field;
	}
	
	public void moveLeft() {
		field.attemptPlace(this, tile.x() - 1, tile.y());
	}
	
	public void moveRight() {
		field.attemptPlace(this, tile.x() + 1, tile.y());
	}
	
	public void moveUp() {
		field.attemptPlace(this, tile.x(), tile.y() - 1);
	}
	
	public void moveDown() {
		field.attemptPlace(this, tile.x(), tile.y() + 1);
	}
}
