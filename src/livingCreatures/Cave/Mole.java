package livingCreatures.Cave;

import enums.Locations;
import enums.Rarity;
import livingCreatures.ALivingCreatures;
import skills.AttackFromGround;
import skills.Echolocation;
import skills.healingSkills.PowerOfEarth;

public class Mole extends ALivingCreatures {
    public Mole(String name, float health, float strength, float protection, float agility) {
        super(name, health, strength, protection, agility);
    }

    public Mole() {
        super("Крот", 80, 15, 0, 0.2f);
        this.setId("enemy_mole");
        this.setLocations(Locations.CAVE);
        this.setRarity(Rarity.COMMON);
    }

    private AttackFromGround skill1 = new AttackFromGround();
    private PowerOfEarth skill2 = new PowerOfEarth();
    private Echolocation skill3 = new Echolocation();

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

