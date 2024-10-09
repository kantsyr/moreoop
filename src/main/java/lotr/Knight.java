package lotr;

import java.util.Random;

public class Knight extends Character {
    public Knight() {
        Random random = new Random();
        this.power = 2 + random.nextInt(11);
        this.hp = 2 + random.nextInt(11);
    }

    @Override
    public void kick(Character c) {
        Random random = new Random();
        int damage = random.nextInt(this.power) + 1;
        System.out.println("Knight delivers a kick " + damage + " damage to the enemy.");
        c.hp -= damage;
    }
}
