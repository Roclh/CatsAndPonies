package livingCreatures.Cave;

import enums.Locations;
import enums.Rarity;
import livingCreatures.ALivingCreatures;
import skills.Bite;
import skills.Echolocation;
import skills.InvisibleBlow;
import skills.WingStrike;
import skills.healingSkills.DarkForce;

public class Vampire extends ALivingCreatures {
    public Vampire(String name, float health, float strength, float protection, float agility) {
        super(name, health, strength, protection, agility);
    }

    public Vampire() {
        super("Вампир", 100, 20, 0, 0.3f);
        this.setId("enemy_vampire");
        this.setLocations(Locations.CAVE);
        this.setRarity(Rarity.UNCOMMON);
    }

    private InvisibleBlow skill1 = new InvisibleBlow();
    private Bite skill2 = new Bite();
    private DarkForce skill3 = new DarkForce();

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
