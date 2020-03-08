package livingCreatures.Road;

import enums.Locations;
import enums.Rarity;
import livingCreatures.ALivingCreatures;
import skills.Sprint;
import skills.SurpriseAttack;
import skills.healingSkills.DarkForce;

public class Cart extends ALivingCreatures {
    public Cart(String name, float health, float strength, float protection, float agility) {
        super(name, health, strength, protection, agility);
    }

    public Cart(){
        super("Телега", 50, 5,0,0);
        this.setId("enemy_cart");
        this.setLocations(Locations.ROAD);
        this.setRarity(Rarity.COMMON);
    }

    private SurpriseAttack skill1 = new SurpriseAttack();
    private DarkForce skill2 = new DarkForce();
    private Sprint skill3 = new Sprint();

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
