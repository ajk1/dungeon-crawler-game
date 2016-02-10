package combat.field.tiles;

import combat.entities.InTile;

public class TileVoid extends Tile{	
	
	public TileVoid(int x, int y) {
		super(x, y);
	}

	@Override
	public void forcePlaceInTile(InTile placee) {}

	@Override
	public boolean placeInTile(InTile placee) {
		return false;
	}

	@Override
	public InTile getInTile() {
		return null;
	}
	
	@Override
	public boolean isEnterable() {
		return false;
	}

}
