package livingCreatures.Waterfall;

import enums.Locations;
import enums.Rarity;
import livingCreatures.ALivingCreatures;
import skills.BreathOfWind;
import skills.NeedleStrike;
import skills.StabWithKnife;
import skills.healingSkills.AngelDust;

public class ButterflyWithAKnife extends ALivingCreatures {
    public ButterflyWithAKnife(String name, float health, float strength, float protection, float agility) {
        super(name, health, strength, protection, agility);
    }

    public ButterflyWithAKnife() {
        super("Бабочка с ножиком", 25,5,0,0.8f);
        this.setId("enemy_butterflywithknife");
        this.setLocations(Locations.WATERFALL);
        this.setRarity(Rarity.COMMON);
    }

    private BreathOfWind skill1 = new BreathOfWind();
    private AngelDust skill2 = new AngelDust();
    private StabWithKnife skill3 = new StabWithKnife();

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
