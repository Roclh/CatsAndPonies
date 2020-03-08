package livingCreatures.Mewt;

import enums.Locations;
import enums.Rarity;
import livingCreatures.ALivingCreatures;
import skills.ASkills;
import skills.AttackWithCuteness;
import skills.BiteAss;
import skills.FurryRetribution;
import skills.healingSkills.LickingWounds;

public class Kitten extends ALivingCreatures {
    public Kitten(String name, float health, float strength, float protection, float agility) {
        super(name, health, strength, protection, agility);
    }

    public Kitten(){
        super("Котёнок", 300, 12, 0,0.65f);
        this.setId("enemy_kitten");
        this.setLocations(Locations.MEWT);
        this.setRarity(Rarity.RARE);
    }

    private BiteAss skill1 = new BiteAss();
    private FurryRetribution skill2 = new FurryRetribution();
    private AttackWithCuteness skill3 = new AttackWithCuteness();
    private LickingWounds skill4 = new LickingWounds();

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
            case 3:
                skill4.cast(this, gainer);
                break;
            default:
                System.out.println("ОШИБКА С РАНДОМОМ В ВЫБОРЕ УМЕНИЯ");
                break;
        }
    }
}
