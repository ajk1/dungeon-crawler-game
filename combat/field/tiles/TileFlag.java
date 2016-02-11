package combat.field.tiles;

public class TileFlag {

	private final int x, y;
	private final TileFlagEnum type;
	
	public TileFlag(int x, int y, TileFlagEnum type) {
		this.x = x;
		this.y = y;
		this.type = type;
	}
	
	public int x() {
		return x;
	}
	
	public int y() {
		return y;
	}
	
	public TileFlagEnum type() {
		return type;
	}
}
