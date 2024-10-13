import characters.Character;

public class GameManager {
    public void fight(Character c1, Character c2) {
        System.out.println("Fight between " + c1 + " and " + c2);
        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            if (!c2.isAlive()) {
                System.out.println(c2 + " is dead!");
                break;
            }
            c2.kick(c1);
            if (!c1.isAlive()) {
                System.out.println(c1 + " is dead!");
                break;
            }
        }
        System.out.println("The fight is over.");
    }
}
