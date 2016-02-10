package combat.entities;

import combat.field.Field;

/**
 * Object that moves around
 * and has an HP bar
 * 
 * @author Kevin
 *
 */
public class Entity extends Object{
	
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

	private int HP;
	
	public Entity(Field field) {
		this.field = field;
	}
	
	
}
