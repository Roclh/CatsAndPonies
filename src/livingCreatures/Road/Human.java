package livingCreatures.Road;

import enums.Locations;
import enums.Rarity;
import livingCreatures.ALivingCreatures;
import skills.HighFive;
import skills.HitWithBagOfMoney;
import skills.Punch;
import skills.Sprint;
import skills.healingSkills.SittingOnBottle;

public class Human extends ALivingCreatures {
    public Human(String name, float health, float strength, float protection, float agility) {
        super(name, health, strength, protection, agility);
    }

    public Human() {
        super("Человек", 100, 20, 0,0.2f);
        this.setId("enemy_human");
        this.setLocations(Locations.ROAD);
        this.setRarity(Rarity.UNCOMMON);
    }

    private Sprint skill1 = new Sprint();
    private SittingOnBottle skill2 = new SittingOnBottle();
    private Punch skill3 = new Punch();

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
