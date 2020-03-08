package livingCreatures.Ponyville;

import enums.Locations;
import enums.Rarity;
import livingCreatures.ALivingCreatures;
import skills.CruelJoke;
import skills.FastAttackWithHooves;
import skills.healingSkills.PrayerToHolyPony;

public class RoughPony extends ALivingCreatures {
    public RoughPony(String name, float health, float strength, float protection, float agility) {
        super(name, health, strength, protection, agility);
    }

    public RoughPony(){
        super("Грубый пони", 100, 20, 0,0.1f);
        this.setId("enemy_roughpony");
        this.setLocations(Locations.PONYVILLE);
        this.setRarity(Rarity.COMMON);
    }

    private PrayerToHolyPony skill1 = new PrayerToHolyPony();
    private FastAttackWithHooves skill2 = new FastAttackWithHooves();
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
