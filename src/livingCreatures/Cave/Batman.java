package livingCreatures.Cave;

import enums.Locations;
import enums.Rarity;
import livingCreatures.ALivingCreatures;
import skills.*;
import skills.healingSkills.ComplimentToYourself;

public class Batman extends ALivingCreatures {
    public Batman(String name, float health, float strength, float protection, float agility) {
        super(name, health, strength, protection, agility);
    }

    public Batman() {
        super("Бэтмэн", 300, 30, 0, 0.1f);
        this.setId("enemy_batman");
        this.setLocations(Locations.CAVE);
        this.setRarity(Rarity.RARE);
    }

    private Echolocation skill1 = new Echolocation();
    private ComplimentToYourself skill2 = new ComplimentToYourself();
    private InvisibleBlow skill3 = new InvisibleBlow();
    private HeroicAttack skill4 = new HeroicAttack();
    private Martha skill5 = new Martha();

    @Override
    public void chooseSkill(ALivingCreatures gainer) {
        switch ((int) (Math.floor(Math.random() * 5))) {
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
