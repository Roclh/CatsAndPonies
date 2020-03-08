package livingCreatures.Mewt;

import enums.Locations;
import enums.Rarity;
import livingCreatures.ALivingCreatures;
import skills.AttackWithCuteness;
import skills.healingSkills.FileNails;
import skills.healingSkills.PrayerToHolyCat;

public class CatWithManicure extends ALivingCreatures {
    public CatWithManicure(String name, float health, float strength, float protection, float agility) {
        super(name, health, strength, protection, agility);
    }

    public CatWithManicure() {
        super("Котик с маникюром", 100, 20, 0,0.08f);
        this.setId("enemy_catwithmanicure");
        this.setLocations(Locations.MEWT);
        this.setRarity(Rarity.UNCOMMON);
    }

    private AttackWithCuteness skill1 = new AttackWithCuteness();
    private PrayerToHolyCat skill2 = new PrayerToHolyCat();
    private FileNails skill3 = new FileNails();

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
