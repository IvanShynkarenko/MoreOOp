import characters.*;
import java.util.Random;

public class CharacterFactory {
    public Character createCharacter() {
        Character[] characters = { new Hobbit(), new Elf(), new King(), new Knight() };
        return characters[new Random().nextInt(characters.length)];
    }
}
