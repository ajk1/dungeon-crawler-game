package combat.field.tiles;

/**
 * It's a tile
 * Pretty self-explanatory
 * @author Kevin
 *
 */

public class Tile{	
	private Object o_inTile;
	
	private int x, y;
	
	public Tile(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Tile(int x, int y, Object ob) {
		this.x = x;
		this.y = y;
		o_inTile = ob;
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
	public void forcePlaceInTile(Object placee) {
		o_inTile = placee;
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
	public boolean placeInTile(Object placee) {
		if (o_inTile == null) {
			o_inTile = placee;
			return true;
		}
		return false;
	}
	
	public Object getInTile() {
		return o_inTile;
	}
}
