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
        performKick(c);
    }
}
