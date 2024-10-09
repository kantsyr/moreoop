package lotr;
public class Demo {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        Character character1 = factory.createCharacter();
        Character character2 = factory.createCharacter();

        GameManager gameManager = new GameManager();
        gameManager.fight(character1, character2);
    }
}
