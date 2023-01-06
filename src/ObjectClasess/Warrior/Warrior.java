package ObjectClasess.Warrior;
import ObjectClasess.Armor.Armor;
import ObjectClasess.Weapon.Weapon;

public class Warrior {
    protected Armor armor;
    protected Weapon weapon;
    protected int HP;
    protected String name;

    public Warrior(Armor armor, Weapon weapon, int HP, String name) {
        this.armor = armor;
        this.weapon = weapon;
        this.HP = HP;
        this.name = name;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getHP() {
        return HP;
    }

    public String getName() {
        return name;
    }
}
