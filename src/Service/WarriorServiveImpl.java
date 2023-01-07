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

        System.out.printf(" %d HP %s \n ", war1.getHP(),war1.getName() );
        System.out.printf(" %d HP %s \n ", war2.getHP(),war2.getName() );
        System.out.printf(" %s атакует %s \n", war1.getName(),war2.getName());
        war2.setHP(war2.getHP() - war1.getWeapon().getDamage());
        System.out.printf(" %s атакует %s \n", war2.getName(),war1.getName());
        war1.setHP(war1.getHP() - war2.getWeapon().getDamage());


    }

    public static void main(String[] args) {
        LeatherArmor LA1 = new LeatherArmor("LeatherArmor");
        GlassArmor LA2 = new GlassArmor("GlassArmor");
        DragonFireArmor HA1 = new DragonFireArmor("DragonFireArmor");
        LegendSlayerArmor HA2 = new LegendSlayerArmor("LegendSlayerArmor");
        HuntBow bow1 = new HuntBow("HuntBow");
        SniperBow bow2 = new SniperBow("SniperBow");
        BlackRitual SW1 = new BlackRitual("BlackRitual");
        Katana SW2 = new Katana("Katana");
        Archer archer  = new Archer(LA1, bow1, "Alex");
        Knight knight  = new Knight(HA1,SW1, "Otr" );
        WarriorService rrr = new WarriorServiveImpl();

        rrr.fight(archer,knight );







    }
}
