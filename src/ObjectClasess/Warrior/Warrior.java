package ObjectClasess.Warrior;
import ObjectClasess.Armor.Armor;
import ObjectClasess.Weapon.Weapon;

public class Warrior {
    protected Armor armor;
    protected Weapon weapon;
    protected String name;

    public Warrior(Armor armor, Weapon weapon, String name) {
        this.armor = armor;
        this.weapon = weapon;
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

    public String getName() {
        return name;
    }

}
