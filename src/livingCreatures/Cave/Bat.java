package livingCreatures.Cave;

import enums.Locations;
import enums.Rarity;
import livingCreatures.ALivingCreatures;
import skills.*;

public class Bat extends ALivingCreatures {
    public Bat(String name, float health, float strength, float protection, float agility) {
        super(name, health, strength, protection, agility);
    }

    public Bat() {
        super("Летучая мышь", 50, 15,0,0.3f);
        this.setId("enemy_bat");
        this.setLocations(Locations.CAVE);
        this.setRarity(Rarity.COMMON);
    }

    private Echolocation skill1 = new Echolocation();
    private WingStrike skill2 = new WingStrike();
    private InvisibleBlow skill3 = new InvisibleBlow();

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
