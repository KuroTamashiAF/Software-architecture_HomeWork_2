package ObjectClasess.Armor.HeavyArmor;

public class LegendSlayerArmor extends HeavyArmor{
    private double resistance  = 0.53;
    public LegendSlayerArmor(String name) {
        super(name);
    }

    @Override
    public double getResistance() {
        return resistance;
    }
}
