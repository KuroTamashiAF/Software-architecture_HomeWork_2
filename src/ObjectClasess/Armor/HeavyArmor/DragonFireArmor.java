package ObjectClasess.Armor.HeavyArmor;

public class DragonFireArmor extends HeavyArmor{
    private double resistance  =  0.61;
    public DragonFireArmor(String name) {
        super(name);
    }

    @Override
    public double getResistance() {
        return resistance;
    }
}
