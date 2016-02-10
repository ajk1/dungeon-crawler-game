package combat.entities;


/**
 * Give me a better name
 * 
 * On a side note, this
 * could be perfect for
 * a breakable wall
 * 
 * @author Kevin
 *
 */
public class HasHp extends Object{
	private int maxHp;
	private int hp;
	
	public HasHp(int hp) {
		this.maxHp = hp;
		this.hp = hp;
	}
	
	public boolean changeHp(int change) {
		this.hp += change;
		if (hp > maxHp)		// Doesn't allow over-healing
			hp = maxHp;
		return isDead();
	}
	
	public boolean isDead() {
		return hp <= 0;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getHp() {
		return hp;
	}
}
