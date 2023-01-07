package Service;


import ObjectClasess.Warrior.Archer;
import ObjectClasess.Warrior.Knight;

public class WarriorServiсeImpl implements  WarriorService{

    @Override
    public void fight(Archer war1 , Knight war2) {
        boolean Alive =  true;
        do{
            System.out.printf(" %d HP %s \n ", war1.getHP(),war1.getName() );
            System.out.printf(" %d HP %s \n ", war2.getHP(),war2.getName() );
            System.out.printf(" %s атакует %s \n", war1.getName(),war2.getName());
            int dmg1  = war2.getHP()- (war2.getHP() - war1.getWeapon().getDamage());
            war2.setHP(war2.getHP()- dmg1);
            System.out.printf(" %s наносит %s %d урона  \n", war1.getName(),war2.getName(), dmg1);
            System.out.printf(" %s атакует %s \n", war2.getName(),war1.getName());
            int dmg2 = war1.getHP() - (war1.getHP() - war2.getWeapon().getDamage());
            war1.setHP(war1.getHP() - dmg2);
            System.out.printf(" %s наносит %s %d урона  \n", war2.getName(),war1.getName(), dmg2);


            if (war1.getHP() <= 0 || war2.getHP() <= 0)
            {
                Alive = false;
                if (war1.getHP() <= 0){
                    System.out.println("Победитель "+ war2.getName());
                }
                if (war2.getHP() <= 0){
                    System.out.println("Победитель "+ war1.getName());
                }
            }

        }while (Alive);
    }
}
