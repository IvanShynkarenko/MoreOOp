package characters;
import strategies.ElfKickStrategy;

public class Elf extends Character {
    public Elf() {
        super(10, 10, new ElfKickStrategy());
    }
}
