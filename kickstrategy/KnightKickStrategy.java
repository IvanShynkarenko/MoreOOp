package kickstrategy;
import characters.Character;

public class KnightKickStrategy implements KickStrategy {
    @Override
    public void kick(Character attacker, Character defender) {
        int damage = new java.util.Random().nextInt(attacker.power) + 1;
        System.out.println("Knight attack " + defender.getClass().getSimpleName() + "by" + damage);
        defender.hp -= damage;
    }
}
