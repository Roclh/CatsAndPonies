package livingCreatures.Mewt;

import enums.Locations;
import enums.Rarity;
import livingCreatures.ALivingCreatures;
import skills.FurryRetribution;
import skills.HitWithBagOfMoney;
import skills.healingSkills.LickingWounds;

public class CatThief extends ALivingCreatures {
    public CatThief(String name, float health, float strength, float protection, float agility) {
        super(name, health, strength, protection, agility);
    }

    public CatThief() {
        super("Котик вор", 100, 20,0, 0.3f);
        this.setId("enemy_catthief");
        this.setLocations(Locations.MEWT);
        this.setRarity(Rarity.UNCOMMON);
    }

    private FurryRetribution skill1 = new FurryRetribution();
    private LickingWounds skill2 = new LickingWounds();
    private HitWithBagOfMoney skill3 = new HitWithBagOfMoney();

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
