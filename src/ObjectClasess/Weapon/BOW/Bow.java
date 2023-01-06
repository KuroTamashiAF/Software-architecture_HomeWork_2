package ObjectClasess.Weapon.BOW;

import ObjectClasess.Weapon.Weapon;

public class Bow extends Weapon {
    private int damage = 10;

    public Bow(String name) {
        super(name);
    }

    public int getDamage() {
        return damage;
    }
}
