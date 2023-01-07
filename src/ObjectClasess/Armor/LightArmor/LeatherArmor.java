package ObjectClasess.Armor.LightArmor;

public class LeatherArmor extends  LightArmor{
    private double resistance  =  0.33;
    public LeatherArmor(String name) {
        super(name);
    }

    @Override
    public double getResistance() {
        return resistance;
    }
}
