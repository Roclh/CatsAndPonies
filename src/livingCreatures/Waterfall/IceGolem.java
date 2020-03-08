package livingCreatures.Waterfall;

import enums.Locations;
import enums.Rarity;
import livingCreatures.ALivingCreatures;
import skills.BlowWithCosh;
import skills.IceStones;
import skills.Sprint;

public class IceGolem extends ALivingCreatures {
    public IceGolem(String name, float health, float strength, float protection, float agility) {
        super(name, health, strength, protection, agility);
    }

    public IceGolem() {
        super("Ледяной голем", 200, 10, 0,0);
        this.setId("enemy_icegolem");
        this.setLocations(Locations.WATERFALL);
        this.setRarity(Rarity.UNCOMMON);
    }

    private IceStones skill1 = new IceStones();
    private BlowWithCosh skill2 = new BlowWithCosh();
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
