package ObjectClasess.Armor.LightArmor;

import ObjectClasess.Armor.Armor;

public class HeavyArmor extends Armor {
    private double resistance  = 0.55;
    public HeavyArmor(String name) {
        super(name);
    }

    public double getResistance() {
        return resistance;
    }
}
