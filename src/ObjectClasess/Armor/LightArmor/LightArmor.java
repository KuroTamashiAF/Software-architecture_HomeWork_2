package ObjectClasess.Armor.LightArmor;

import ObjectClasess.Armor.Armor;

public class LightArmor extends Armor {
    private double resistance  =  0.25;

    public LightArmor(String name) {
        super(name);
    }

    public double getResistance() {
        return resistance;
    }
}
