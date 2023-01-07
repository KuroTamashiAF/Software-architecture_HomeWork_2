package Service;

import ObjectClasess.Armor.Armor;
import ObjectClasess.Armor.HeavyArmor.DragonFireArmor;
import ObjectClasess.Armor.HeavyArmor.LegendSlayerArmor;
import ObjectClasess.Armor.LightArmor.GlassArmor;
import ObjectClasess.Armor.LightArmor.LeatherArmor;
import ObjectClasess.Warrior.Archer;
import ObjectClasess.Warrior.Knight;
import ObjectClasess.Warrior.Warrior;
import ObjectClasess.Weapon.BOW.HuntBow;
import ObjectClasess.Weapon.BOW.SniperBow;
import ObjectClasess.Weapon.Swords.BlackRitual;
import ObjectClasess.Weapon.Swords.Katana;
import ObjectClasess.Weapon.Weapon;

public class WarriorServiveImpl implements  WarriorService{




    @Override
    public void fight(Archer war1 , Knight war2) {
        System.out.printf(" %d HP первого бойца ", war1.getHP());
        System.out.printf(" %d HP второго бойца ", war2.getHP());



    }

    public static void main(String[] args) {
        Armor LA1 = new LeatherArmor("LeatherArmor");
        Armor LA2 = new GlassArmor("GlassArmor");
        Armor HA1 = new DragonFireArmor("DragonFireArmor");
        Armor HA2 = new LegendSlayerArmor("LegendSlayerArmor");
        Weapon bow1 = new HuntBow("HuntBow");
        Weapon bow2 = new SniperBow("SniperBow");
        Weapon SW1 = new BlackRitual("BlackRitual");
        Weapon SW2 = new Katana("Katana");
        Archer archer  = new Archer(LA1, bow1, "Alex");
        Knight knight  = new Knight(HA1,SW1, "Otr" );
        WarriorService rrr = new WarriorServiveImpl();

        rrr.fight(archer,knight );







    }
}
