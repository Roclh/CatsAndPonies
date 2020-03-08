package livingCreatures.Road;

import enums.Locations;
import enums.Rarity;
import livingCreatures.ALivingCreatures;
import skills.BiteAss;
import skills.Punch;
import skills.healingSkills.ComplimentToYourself;

public class Ogre extends ALivingCreatures {
    public Ogre(String name, float health, float strength, float protection, float agility) {
        super(name, health, strength, protection, agility);
        this.setLocations(Locations.ROAD);
    }

    public Ogre() {
        super("Людоед", 200, 10, 0,0);
        this.setId("enemy_ogre");
        this.setLocations(Locations.ROAD);
        this.setRarity(Rarity.UNCOMMON);
    }

    private BiteAss skill1 = new BiteAss();
    private Punch skill2 = new Punch();
    private ComplimentToYourself skill3 = new ComplimentToYourself();

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
