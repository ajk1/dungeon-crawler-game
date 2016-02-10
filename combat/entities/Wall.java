package combat.entities;

import combat.field.tiles.Tile;

/**
 * It's an impassable piece of
 * terrain
 * 
 * To be honest, this could be
 * a type of tile. However, with
 * this type of implementation,
 * we could have moving walls.
 * 
 * It might be best to have both
 * types so there are static and
 * movable walls
 * 
 * @author Kevin
 *
 */
public class Wall extends InTile{

	public Wall() {
		super();
	}
}
