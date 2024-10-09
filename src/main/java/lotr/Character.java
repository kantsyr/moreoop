package lotr;

public abstract class Character {
    protected int power;
    protected int hp;
 
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
}
