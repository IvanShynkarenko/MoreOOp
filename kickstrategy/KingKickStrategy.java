package kickstrategy;
import characters.Character;
import java.util.Random;

public class KingKickStrategy implements KickStrategy {
    @Override
    public void kick(Character attacker, Character defender) {
        int damage = new Random().nextInt(attacker.power) + 1;
        System.out.println("King attack" + defender.getClass().getSimpleName() + "by" + damage);
        defender.hp -= damage;
    }
}
