package ObjectClasess.Weapon.BOW;

public class HuntBow extends Bow{
    private  int damage  = 13;
    public HuntBow(String name) {
        super(name);
    }

    @Override
    public int getDamage() {
        return damage;
    }
}
