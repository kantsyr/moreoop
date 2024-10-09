package lotr;
import java.util.Random;

public class King extends Character  {
    public King() {
        Random random = new Random();
        this.power = 5 + random.nextInt(11);
        this.hp = 5 + random.nextInt(11);
    }

    @Override
    public void kick(Character c) {
        Random random = new Random();
        int damage = random.nextInt(this.power) + 1;
        System.out.println("King delivers a kick " + damage + " damage to the enemy.");
        c.hp -= damage;
    }
}
