package ObjectClasess.Warrior;

import ObjectClasess.Armor.Armor;
import ObjectClasess.Weapon.Weapon;

public class  Knight extends Warrior{
    private int HP = 100;
    public Knight(Armor armor, Weapon weapon, String name) {
        super(armor, weapon, name);
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
}
