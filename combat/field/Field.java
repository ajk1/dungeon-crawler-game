package combat.field;

import combat.entities.Wall;
import combat.field.tiles.Tile;
import combat.field.tiles.TileType;
import combat.field.tiles.TileVoid;

public class Field {

	private Tile[][] tiles;
	
	/**
	 * A field contains a bunch of tiles
	 * @param width		Width of the field in tiles
	 * @param height	Height of the field in tiles
	 */
	public Field(int width, int height) {
		tiles = new TileVoid[width][height];
	}
	
	/**
	 * Tries to place an object
	 * into a tile
	 * 
	 * @param ob	Object to place
	 * @param x		x position on field
	 * @param y		y position on field
	 * 
	 * @return		true if successfully placed
	 */
	public boolean attemptPlace(Object ob, int x, int y) {
		try {
			if (x >= 0 && x < tiles.length && y >= 0 && y < tiles[0].length) {
				return tiles[x][y].placeInTile(ob);
			}
		}
		catch (NullPointerException e) {
			System.err.println("Field not initialized\n\te");
		}
		catch (IndexOutOfBoundsException e) {
			System.err.println("Out of bounds of the field\n\te");
		}
		return false;
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
					tiles[xPos][yPos] = new Tile(xPos, yPos);
					break;
				case VOID:
					tiles[xPos][yPos] = new TileVoid(xPos, yPos);
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
	
	// Ex.
	/*
	 * 	 g g g w w
	 *   w g g w g
	 *   w g g g g
	 *   w w w w w"
	 */
	public void setField(String data) {
		char[] array = data.toCharArray();
		int x = 0, y = 0;
		try {
			for (char c : array) {
				if (x >= tiles.length) {
					y++;
					x = 0;
				}
				switch(c) {
					case 'n':
						tiles[x][y] = new Tile(x++, y);
						break;
					case 'v':
						tiles[x][y] = new TileVoid(x++, y);
						break;
					case 'w':
						tiles[x][y] = new Tile(x++, y, new Wall());
						break;
					// Do nothing on these
					case ' ':
					case '\t':
					case '\n':
						break;
					default:
						System.err.println("Character " + c + " at " + x + ", " + y + " is not recognized");
						break;
				}
			}
		}
		catch (IndexOutOfBoundsException e) {
			System.err.println("Out of bounds of the field\n\te");
		}
	}
}
