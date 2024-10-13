package characters;
import strategies.KickStrategy;

public abstract class Character {
    protected int power;
    protected int hp;
    protected KickStrategy kickStrategy;

    public Character(int power, int hp, KickStrategy kickStrategy) {
        this.power = power;
        this.hp = hp;
        this.kickStrategy = kickStrategy;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void kick(Character other) {
        kickStrategy.kick(this, other);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(HP: " + hp + ", Power: " + power + ")";
    }
}
