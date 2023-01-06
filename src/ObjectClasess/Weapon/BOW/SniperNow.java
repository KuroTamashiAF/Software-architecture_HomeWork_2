package ObjectClasess.Weapon.BOW;

public class SniperNow extends Bow{
    private int damage = 25;

    public SniperNow(String name) {
        super(name);
    }

    @Override
    public int getDamage() {
        return damage;
    }
}
