package livingCreatures.Road;

import enums.Locations;
import enums.Rarity;
import livingCreatures.ALivingCreatures;
import skills.AttackFromGround;
import skills.Hugs;
import skills.InvisibleBlow;

public class Mud extends ALivingCreatures {
    public Mud(String name, float health, float strength, float protection, float agility) {
        super(name, health, strength, protection, agility);
    }

    public Mud() {
        super("Грязь", 60, 7, 0, 0.37f);
        this.setId("enemy_mud");
        this.setLocations(Locations.ROAD);
        this.setRarity(Rarity.COMMON);
    }

    private AttackFromGround skill1 = new AttackFromGround();
    private InvisibleBlow skill2 = new InvisibleBlow();
    private Hugs skill3 = new Hugs();

    @Override
    public void chooseSkill(ALivingCreatures gainer) {
        switch ((int) (Math.floor(Math.random() * 3))) {
            case 0:
                skill1.cast(this, gainer);
                break;
            case 1:
                skill2.cast(this, gainer);
                break;
            case 2:
                skill3.cast(this, gainer);
                break;
            default:
                System.out.println("ОШИБКА С РАНДОМОМ В ВЫБОРЕ УМЕНИЯ");
                break;
        }
    }
}
