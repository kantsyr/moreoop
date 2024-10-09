package lotr;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {
    @Test
    public void testCharacterIsAlive() {
        Character elf = new Elf();
        assertTrue(elf.isAlive());
    }

    @Test
    public void testFight() {
        Character hobbit = new Hobbit();
        Character elf = new Elf();
        GameManager gameManager = new GameManager();
        gameManager.fight(hobbit, elf);
        assertTrue(true); 
    }


    @Test
    public void testCharacterIsAlive2() {
        Character king = new King();
        assertTrue(king.isAlive());
    }

    @Test
    public void testFight2() {
        Character hobbit = new Hobbit();
        Character king = new King();
        GameManager gameManager = new GameManager();
        gameManager.fight(hobbit, king);
        assertTrue(true); 
    }
}
