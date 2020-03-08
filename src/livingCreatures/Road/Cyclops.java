package livingCreatures.Road;

import enums.Locations;
import enums.Rarity;
import livingCreatures.ALivingCreatures;
import skills.BlowWithCosh;
import skills.HighFive;
import skills.Kick;
import skills.Punch;
import skills.healingSkills.HugYourself;

public class Cyclops extends ALivingCreatures {
    public Cyclops(String name, float health, float strength, float protection, float agility) {
        super(name, health, strength, protection, agility);
    }

    public Cyclops() {
        super("Циклоп", 350, 12, 0,0);
        this.setId("enemy_cyclops");
        this.setLocations(Locations.ROAD);
        this.setRarity(Rarity.RARE);
    }

    private Kick skill1 = new Kick();
    private HighFive skill2 = new HighFive();
    private HugYourself skill3 = new HugYourself();
    private BlowWithCosh skill4 = new BlowWithCosh();
    private Punch skill5 = new Punch();

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
            case 4:
                skill5.cast(this, gainer);
                break;
            default:
                System.out.println("ОШИБКА С РАНДОМОМ В ВЫБОРЕ УМЕНИЯ");
                break;
        }
    }
}
