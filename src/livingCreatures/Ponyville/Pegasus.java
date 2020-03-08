package livingCreatures.Ponyville;

import enums.Locations;
import enums.Rarity;
import livingCreatures.ALivingCreatures;
import skills.Bite;
import skills.WingStrike;
import skills.healingSkills.PrayerToHolyPony;

public class Pegasus extends ALivingCreatures {
    public Pegasus(String name, float health, float strength, float protection, float agility) {
        super(name, health, strength, protection, agility);
    }

    public Pegasus(){
        super("Пегас", 100, 15, 0,0.2f);
        this.setId("enemy_pegasus");
        this.setLocations(Locations.PONYVILLE);
        this.setRarity(Rarity.UNCOMMON);
    }

    private Bite skill1 = new Bite();
    private WingStrike skill2 = new WingStrike();
    private PrayerToHolyPony skill3 = new PrayerToHolyPony();

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
