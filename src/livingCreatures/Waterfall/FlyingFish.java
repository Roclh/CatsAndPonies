package livingCreatures.Waterfall;

import enums.Locations;
import enums.Rarity;
import livingCreatures.ALivingCreatures;
import skills.RichFoam;
import skills.WaterColumn;
import skills.WingStrike;

public class FlyingFish extends ALivingCreatures {
    public FlyingFish(String name, float health, float strength, float protection, float agility) {
        super(name, health, strength, protection, agility);
    }

    public FlyingFish() {
        super("Летучая рыба", 50, 15,0,0.3f);
        this.setId("enemy_flyingfish");
        this.setLocations(Locations.WATERFALL);
        this.setRarity(Rarity.COMMON);
    }

    private WaterColumn skill1 = new WaterColumn();
    private RichFoam skill2 = new RichFoam();
    private WingStrike skill3 = new WingStrike();

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
