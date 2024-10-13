import characters.Character;

public class Main {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        Character c1 = factory.createCharacter();
        Character c2 = factory.createCharacter();

        GameManager manager = new GameManager();
        manager.fight(c1, c2);
    }
}
