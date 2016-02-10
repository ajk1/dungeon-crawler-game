package combat.field.tiles;

public class VoidTile extends Tile{

	@Override
	public void forceSetInTile(Object placee) {}

	@Override
	public void setInTile(Object placee) {}

	@Override
	public Object getInTile() {
		return null;
	}

}
