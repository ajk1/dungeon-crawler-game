package combat.field.tiles;

/**
 * It's a tile
 * Pretty self-explanatory
 * @author Kevin
 *
 */
public class Tile implements TileInterface{
	private Object o_inTile;
	
	public Tile() {
		
	}
	
	/**
	 * Places an object (entity, rock, wall, etc.)
	 * in the tile
	 * @param placee
	 */
	@Override
	public void forceSetInTile(Object placee) {
		o_inTile = placee;
	}
	
	@Override
	public void setInTile(Object placee) {
		if (o_inTile == null)
			o_inTile = placee;
	}
	
	@Override
	public Object getInTile() {
		return o_inTile;
	}
}
