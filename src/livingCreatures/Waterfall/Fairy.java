package livingCreatures.Waterfall;

import enums.Locations;
import enums.Rarity;
import livingCreatures.ALivingCreatures;
import skills.InvisibleBlow;
import skills.WingStrike;
import skills.healingSkills.AngelDust;

public class Fairy extends ALivingCreatures {
    public Fairy(String name, float health, float strength, float protection, float agility) {
        super(name, health, strength, protection, agility);
    }

    public Fairy() {
        super("Фея", 100, 15,0,0.5f);
        this.setId("enemy_fairy");
        this.setLocations(Locations.WATERFALL);
        this.setRarity(Rarity.UNCOMMON);
    }

    private InvisibleBlow skill1 = new InvisibleBlow();
    private WingStrike skill2 = new WingStrike();
    private AngelDust skill3 = new AngelDust();

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
