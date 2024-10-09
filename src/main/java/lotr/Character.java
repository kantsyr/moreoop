package lotr;
import java.util.Random;

public abstract class Character {
    protected int power;
    protected int hp;
    private Random random = new Random();
 
    public abstract void kick(Character c);

    public boolean isAlive() {
        return hp > 0;
    }

    public void setHp(int hp) {
        this.hp = Math.max(0, hp);
    }
    public int getHp() {
        return hp;
    }

    public int getPower() {
        return power;
    }

    protected void performKick(Character c) {
        int damage = random.nextInt(this.power) + 1;
        System.out.println(this.getClass().getSimpleName() + " delivers a kick " + damage + " damage to the enemy.");
        c.hp -= damage;
    }
}
