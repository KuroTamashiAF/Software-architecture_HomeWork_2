package ObjectClasess.Warrior;

import ObjectClasess.Armor.Armor;
import ObjectClasess.Weapon.Weapon;

public class Archer extends Warrior{
    private  int HP = 60;
    public Archer(Armor armor, Weapon weapon, String name) {
        super(armor, weapon, name);
    }

    public int getHP() {
        return HP;
    }
}
