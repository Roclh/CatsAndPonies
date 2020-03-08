package livingCreatures.Forest;

import enums.Locations;
import enums.Rarity;
import livingCreatures.ALivingCreatures;
import skills.BreathOfWind;
import skills.DeadlyAttack;
import skills.DeadlySpikes;
import skills.LeafStrike;

public class Floret extends ALivingCreatures {
    public Floret(String name, float health, float strength, float protection, float agility) {
        super(name, health, strength, protection, agility);
    }

    public Floret(){
        super("Цветочек", 25, 5, 0,0.7f);
        this.setId("enemy_floret");
        this.setLocations(Locations.FOREST);
        this.setRarity(Rarity.COMMON);
    }

    private LeafStrike skill1 = new LeafStrike();
    private DeadlySpikes skill2 = new DeadlySpikes();
    private BreathOfWind skill3 = new BreathOfWind();

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
