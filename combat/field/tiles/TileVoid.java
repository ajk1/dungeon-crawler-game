package combat.field.tiles;

public class TileVoid extends Tile{	
	
	public TileVoid(int x, int y) {
		super(x, y);
	}

	@Override
	public void forcePlaceInTile(Object placee) {}

	@Override
	public boolean placeInTile(Object placee) {
		return false;
	}

	@Override
	public Object getInTile() {
		return null;
	}
	
	@Override
	public boolean isEnterable() {
		return false;
	}

}
