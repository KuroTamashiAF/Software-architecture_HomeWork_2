package Сollector;

import ObjectClasess.Armor.HeavyArmor.DragonFireArmor;
import ObjectClasess.Armor.HeavyArmor.LegendSlayerArmor;
import ObjectClasess.Armor.LightArmor.GlassArmor;
import ObjectClasess.Armor.LightArmor.LeatherArmor;
import ObjectClasess.Armor.LightArmor.LightArmor;
import ObjectClasess.Warrior.Archer;
import ObjectClasess.Warrior.Knight;
import ObjectClasess.Weapon.BOW.HuntBow;
import ObjectClasess.Weapon.BOW.SniperBow;
import ObjectClasess.Weapon.Swords.BlackRitual;
import ObjectClasess.Weapon.Swords.Katana;
import Service.WarriorService;
import Service.WarriorServiсeImpl;

public class collector {

    public void collectorRun(){
        LeatherArmor LA = new LeatherArmor("LeatherArmor");
        GlassArmor GA = new GlassArmor("GlassArmor");
        DragonFireArmor DFA = new DragonFireArmor("DragonFireArmor");
        LegendSlayerArmor LSA = new LegendSlayerArmor("LegendSlayerArmor");
        HuntBow HB = new HuntBow("HuntBow");
        SniperBow SB = new SniperBow("SniperBow");
        Katana SK = new Katana("Katana");
        BlackRitual SBR = new BlackRitual("BlackRitual");
        Archer Arch =  new Archer(LA, HB, "Alex" );
        Knight Kni = new Knight(DFA,SBR, "Ori" );
        WarriorService action  =  new WarriorServiсeImpl();
        action.fight(Arch, Kni);
    }

}
