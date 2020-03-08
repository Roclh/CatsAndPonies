package livingCreatures.Mewt;

import enums.Locations;
import enums.Rarity;
import livingCreatures.ALivingCreatures;
import skills.Bite;
import skills.CruelJoke;
import skills.healingSkills.PrayerToHolyCat;

public class RoughCat extends ALivingCreatures {
    public RoughCat(String name, float health, float strength, float protection, float agility) {
        super(name, health, strength, protection, agility);
    }

    public RoughCat(){
        super("Грубый кот", 100, 20,0, 0.1f);
        this.setId("enemy_roughcat");
        this.setLocations(Locations.MEWT);
        this.setRarity(Rarity.COMMON);
    }

    private Bite skill1 = new Bite();
    private PrayerToHolyCat skill2 = new PrayerToHolyCat();
    private CruelJoke skill3 = new CruelJoke();

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
