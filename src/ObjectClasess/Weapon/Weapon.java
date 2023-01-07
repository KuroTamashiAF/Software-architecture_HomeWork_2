package ObjectClasess.Weapon;

import ObjectClasess.Weapon.Swords.Sword;

import java.util.function.Function;

public class Weapon {
    private String name;
    private int damage;

    public Weapon(String name) {
        this.name = name;
        this.damage = 0;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}
