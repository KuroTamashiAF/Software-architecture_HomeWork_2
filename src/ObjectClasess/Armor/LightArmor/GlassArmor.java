package ObjectClasess.Armor.LightArmor;

public class GlassArmor extends LightArmor{
    private double resistance  =  0.43;
    public GlassArmor(String name) {
        super(name);
    }

    @Override
    public double getResistance() {
        return resistance;
    }
}
