package livingCreatures.Ponyville;

import enums.Locations;
import enums.Rarity;
import livingCreatures.ALivingCreatures;
import skills.FastAttackWithHooves;
import skills.FlammableLook;
import skills.MagicHorn;
import skills.WingStrike;

public class Alicorn extends ALivingCreatures {
    public Alicorn(String name, float health, float strength, float protection, float agility) {
        super(name, health, strength, protection, agility);
    }

    public Alicorn(){
        super("Аликорн", 300, 12, 0,0.65f);
        this.setId("enemy_alicorn");
        this.setLocations(Locations.PONYVILLE);
        this.setRarity(Rarity.RARE);
    }

    private FastAttackWithHooves skill1 = new FastAttackWithHooves();
    private FlammableLook skill2 = new FlammableLook();
    private MagicHorn skill3 = new MagicHorn();
    private WingStrike skill4 = new WingStrike();

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
            case 3:
                skill4.cast(this, gainer);
            default:
                System.out.println("ОШИБКА С РАНДОМОМ В ВЫБОРЕ УМЕНИЯ");
                break;
        }
    }
}
