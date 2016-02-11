package combat.entities;

import java.util.ArrayList;
import java.util.List;

import combat.field.Field;
import combat.field.tiles.Tile;
import combat.field.tiles.TileFlag;
import combat.field.tiles.TileFlagEnum;

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
	
	public boolean moveLeft() {
		return field.attemptPlace(this, tile.x() - 1, tile.y());
	}
	
	public boolean moveRight() {
		return field.attemptPlace(this, tile.x() + 1, tile.y());
	}
	
	public boolean moveUp() {
		return field.attemptPlace(this, tile.x(), tile.y() - 1);
	}
	
	public boolean moveDown() {
		return field.attemptPlace(this, tile.x(), tile.y() + 1);
	}
	
	private void addTile(List<TileFlag> temp, int x, int y){
		Tile tempTile = field.getTile(x, y);
		if (tempTile != null) {
			temp.add(new TileFlag(x, y, TileFlagEnum.NORMAL));
		}
	}
	
	/**
	 * Returns the tiles in a diamond around the
	 * character
	 * 
	 *     r
	 *   r r r
	 * r r c r r
	 *   r r r
	 *     r
	 * 
	 * @param range		range from center to the outside (+ 1 for the center)
	 * @return			list of tile flags for the tiles in range
	 */
	public List<TileFlag> getTilesInDiamond(int range) {
		List<TileFlag> temp = new ArrayList<TileFlag>();
		for (int i = -range; i <= range; i++) {
			for (int j = -range; j <= range; j++) {
				if (i == 0 && j == 0)
					continue;
				if (Math.abs(i) + Math.abs(j) <= range) {
					addTile(temp, i + tile.x(), j + tile.y());
				}
			}
		}
		return temp;
	}
	
	/**
	 * Returns the tiles in a diamond around the
	 * character
	 * 
	 * r r r r r
	 * r r r r r
	 * r r c r r
	 * r r r r r
	 * r r r r r
	 * 
	 * @param range		range from center to the outside (+ 1 for the center)
	 * @return			list of tile flags for the tiles in range
	 */
	public List<TileFlag> getTilesInSquare(int range) {
		List<TileFlag> temp = new ArrayList<TileFlag>();
		for (int i = -range; i <= range; i++) {
			for (int j = -range; j <= range; j++) {
				if (i == 0 && j == 0)
					continue;
				addTile(temp, i + tile.x(), j + tile.y());
			}
		}
		return temp;
	}
}
