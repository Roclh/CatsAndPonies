package livingCreatures.Mewt;

import enums.Locations;
import enums.Rarity;
import livingCreatures.ALivingCreatures;
import skills.DeadlyAttack;
import skills.EvilEnergy;
import skills.FurryRetribution;

public class WoolBall extends ALivingCreatures {
    public WoolBall(String name, float health, float strength, float protection, float agility) {
        super(name, health, strength, protection, agility);
    }

    public WoolBall() {
        super("Комок шерсти", 20, 5,0, 0.7f);
        this.setId("enemy_woolball");
        this.setLocations(Locations.MEWT);
        this.setRarity(Rarity.COMMON);
    }

    private FurryRetribution skill1 = new FurryRetribution();
    private DeadlyAttack skill2 = new DeadlyAttack();
    private EvilEnergy skill3 = new EvilEnergy();

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
