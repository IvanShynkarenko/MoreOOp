package kickstrategy;
import characters.Character;

public class HobbitKickStrategy implements KickStrategy {
    @Override
    public void kick(Character attacker, Character defender) {
        System.out.println(";(");
    }
}
