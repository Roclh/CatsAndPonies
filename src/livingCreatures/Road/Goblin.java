package livingCreatures.Road;

import enums.Locations;
import enums.Rarity;
import livingCreatures.ALivingCreatures;
import skills.HitWithBagOfMoney;
import skills.StabWithKnife;
import skills.healingSkills.ComplimentToYourself;

public class Goblin extends ALivingCreatures {
    public Goblin(String name, float health, float strength, float protection, float agility) {
        super(name, health, strength, protection, agility);
    }

    public Goblin() {
        super("Гоблин", 50, 10, 0,0.6f);
        this.setId("enemy_goblin");
        this.setLocations(Locations.ROAD);
        this.setRarity(Rarity.COMMON);
    }

    private StabWithKnife skill1 = new StabWithKnife();
    private ComplimentToYourself skill2 = new ComplimentToYourself();
    private HitWithBagOfMoney skill3 = new HitWithBagOfMoney();

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

