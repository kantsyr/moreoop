package lotr;

public class Elf extends Character {
    public Elf() {
        this.power = 10;
        this.hp = 10;
    }

    @Override
    public void kick(Character c) {
        if (c.getPower() < this.power) {
            System.out.println("The elf defeats the weaker character");
            c.hp = 0;
        } else {
            System.out.println("The elf reduces the enemy's power by 1");
            c.power--;
        }
    }
}
