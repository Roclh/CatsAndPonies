package livingCreatures.Ponyville;

import enums.Locations;
import enums.Rarity;
import livingCreatures.ALivingCreatures;
import skills.FastAttackWithHooves;
import skills.MagicHorn;
import skills.healingSkills.AngelDust;
import skills.healingSkills.PrayerToHolyPony;

public class Unicorn extends ALivingCreatures {
    public Unicorn(String name, float health, float strength, float protection, float agility) {
        super(name, health, strength, protection, agility);
    }

    public Unicorn() {
        super("Единорог", 100, 20, 0,0.1f);
        this.setId("enemy_unicorn");
        this.setLocations(Locations.PONYVILLE);
        this.setRarity(Rarity.UNCOMMON);
    }

    private FastAttackWithHooves skill1 = new FastAttackWithHooves();
    private MagicHorn skill2 = new MagicHorn();
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
