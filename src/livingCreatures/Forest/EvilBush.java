package livingCreatures.Forest;

import enums.Locations;
import enums.Rarity;
import livingCreatures.ALivingCreatures;
import skills.BreathOfWind;
import skills.LeafStrike;
import skills.healingSkills.PowerOfEarth;

public class EvilBush extends ALivingCreatures {
    public EvilBush(String name, float health, float strength, float protection, float agility) {
        super(name, health, strength, protection, agility);
    }

    public EvilBush(){
        super("Злой куст", 50, 15, 0,0.5f);
        this.setId("enemy_evilbush");
        this.setLocations(Locations.FOREST);
        this.setRarity(Rarity.COMMON);
    }

    private BreathOfWind skill1 = new BreathOfWind();
    private LeafStrike skill2 = new LeafStrike();
    private PowerOfEarth skill3 = new PowerOfEarth();

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
