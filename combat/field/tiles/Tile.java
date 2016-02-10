package combat.field.tiles;

import combat.entities.InTile;

/**
 * It's a tile
 * Pretty self-explanatory
 * @author Kevin
 *
 */

public class Tile{	
	private InTile o_inTile;
	
	private int x, y;
	
	public Tile(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Tile(int x, int y, InTile ob) {
		this.x = x;
		this.y = y;
		forcePlaceInTile(ob);
	}
	
	public int x() {
		return x;
	}
	
	public int y() {
		return y;
	}
	
	public boolean isEnterable() {
		return true;
	}
	
	/**
	 * Places an object (entity, rock, wall, etc.)
	 * in the tile
	 * @param placee
	 */
	public void forcePlaceInTile(InTile placee) {
		o_inTile = placee;
		placee.setTile(this);
	}
	
	/**
	 * Tries to place an object
	 * into the tile
	 * 
	 * returns true if successful
	 * 	
	 * @param placee	object to be placed
	 * @return			True if object is placed successfully
	 */
	public boolean placeInTile(InTile placee) {
		if (o_inTile == null) {
			o_inTile = placee;
			Tile temp = placee.getTile();
			// If the character has been in a tile before
			if (temp != null)
				temp.clear();
			placee.setTile(this);
			return true;
		}
		return false;
	}
	
	public void clear() {
		o_inTile = null;
	}
	
	public InTile getInTile() {
		return o_inTile;
	}
}
