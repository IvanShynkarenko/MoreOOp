package kickstrategy;
import characters.Character;

public class ElfKickStrategy implements KickStrategy {
    @Override
    public void kick(Character attacker, Character defender) {
        if (defender.power < attacker.power) {
            System.out.println("Elf kill" + defender.getClass().getSimpleName());
            defender.hp = 0;
        } else {
            System.out.println("Elf made weaker" + defender.getClass().getSimpleName());
            defender.power--;
        }
    }
}
