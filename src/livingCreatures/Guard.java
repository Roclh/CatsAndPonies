package livingCreatures;

import enums.Locations;
import enums.Rarity;
import skills.AttackWithSword;
import skills.BlowToHead;
import skills.healingSkills.SittingOnBottle;

public class Guard extends ALivingCreatures {
    public Guard(String name, float health, float strength, float protection, float agility) {
        super(name, health, strength, protection, agility);
    }

    public Guard() {
        super("Стража", 200, 15, 0, 0.02f);
        this.setId("enemy_guard");
    }

    public Guard(Locations location){
        super("Стража", 200, 15, 0, 0.02f);
        this.setId("enemy_guard");
        this.setLocations(location);
        this.setRarity(Rarity.COMMON);
    }


    private BlowToHead skill1 = new BlowToHead();
    private AttackWithSword skill2 = new AttackWithSword();
    private SittingOnBottle skill3 = new SittingOnBottle();


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
