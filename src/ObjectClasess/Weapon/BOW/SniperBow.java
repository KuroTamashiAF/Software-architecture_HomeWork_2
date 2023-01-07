package ObjectClasess.Weapon.BOW;

public class SniperBow extends Bow{
    private int damage = 25;

    public SniperBow(String name) {
        super(name);
    }

    @Override
    public int getDamage() {
        return damage;
    }
}
