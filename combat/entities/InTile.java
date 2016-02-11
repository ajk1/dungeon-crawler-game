package combat.entities;

import combat.field.tiles.Tile;

/**
 * Parent class for anything that
 * exists in a tile
 * 
 * Examples include:
 * 	Wall
 * 	Party member
 * 	Enemy unit
 * 
 * @author Kevin
 *
 */
public abstract class InTile implements ObjectInterface {
	protected Tile tile;
	
	public InTile() {
	}
	
	public int x() {
		return tile.x();
	}
	
	public int y() {
		return tile.y();
	}

	public void setTile(Tile tile) {
		this.tile = tile;
	}

	public Tile getTile() {
		return tile;
	}
}
