package ObjectClasess.Weapon;

public class Sword extends Weapon{
    private int damage = 25;

    public Sword(String name) {
        super(name);
    }

    public int getDamage() {
        return damage;
    }
}
