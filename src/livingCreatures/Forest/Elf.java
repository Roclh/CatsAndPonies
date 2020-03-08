package livingCreatures.Forest;

import enums.Locations;
import enums.Rarity;
import livingCreatures.ALivingCreatures;
import skills.BowBlowToHead;
import skills.FlammableLook;
import skills.healingSkills.SittingOnBottle;

public class Elf extends ALivingCreatures {
    public Elf(String name, float health, float strength, float protection, float agility) {
        super(name, health, strength, protection, agility);
    }

    public Elf() {
        super("Эльф", 100, 20, 0,0.3f);
        this.setId("enemy_elf");
        this.setLocations(Locations.FOREST);
        this.setRarity(Rarity.UNCOMMON);
    }

    BowBlowToHead skill1 = new BowBlowToHead();
    SittingOnBottle skill2 = new SittingOnBottle();
    FlammableLook skill3 = new FlammableLook();

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
