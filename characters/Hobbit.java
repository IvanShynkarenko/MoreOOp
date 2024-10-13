package characters;
import strategies.HobbitKickStrategy;

public class Hobbit extends Character {
    public Hobbit() {
        super(0, 3, new HobbitKickStrategy());
    }
}