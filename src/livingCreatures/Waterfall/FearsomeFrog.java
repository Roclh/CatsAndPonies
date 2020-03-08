package livingCreatures.Waterfall;

import enums.Locations;
import enums.Rarity;
import livingCreatures.ALivingCreatures;
import skills.SurpriseAttack;
import skills.TongueStrike;
import skills.healingSkills.DarkForce;

public class FearsomeFrog extends ALivingCreatures {
    public FearsomeFrog(String name, float health, float strength, float protection, float agility) {
        super(name, health, strength, protection, agility);
    }

    public FearsomeFrog() {
        super("Грозная лягушка", 50, 10, 0,0.3f);
        this.setId("enemy_fairy");
        this.setLocations(Locations.WATERFALL);
        this.setRarity(Rarity.COMMON);
    }

    private TongueStrike skill1 = new TongueStrike();
    private DarkForce skill2 = new DarkForce();
    private SurpriseAttack skill3 = new SurpriseAttack();

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
