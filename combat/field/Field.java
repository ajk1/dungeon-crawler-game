package combat.field;

import combat.field.tiles.Tile;
import combat.field.tiles.TileType;
import combat.field.tiles.VoidTile;

public class Field {

	private Tile[][] tiles;
	
	/**
	 * A field contains a bunch of tiles
	 * @param width		Width of the field in tiles
	 * @param height	Height of the field in tiles
	 */
	public Field(int width, int height) {
		tiles = new VoidTile[width][height];
	}
	
	/**
	 * Sets a tile in the field
	 * @param type		Tile type
	 * @param xPos		x position
	 * @param yPos		y position
	 */
	public void setTile(TileType type, int xPos, int yPos) {
		try {
			switch(type) {
				case NORMAL:
					tiles[xPos][yPos] = new Tile();
					break;
				case VOID:
					tiles[xPos][yPos] = new VoidTile();
					break;
				default:
					System.err.println("That's not a recognized tile enum");
					break;
			}
		}
		catch (IndexOutOfBoundsException e) {
			System.err.println("Out of bounds of the field\n\te");
		}
	}
}
