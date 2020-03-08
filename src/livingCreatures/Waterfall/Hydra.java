package livingCreatures.Waterfall;

import enums.Locations;
import enums.Rarity;
import livingCreatures.ALivingCreatures;
import skills.*;

public class Hydra extends ALivingCreatures {
    public Hydra(String name, float health, float strength, float protection, float agility) {
        super(name, health, strength, protection, agility);
    }

    public Hydra() {
        super("Многоголовая гидра", 365, 10, 0,0.06f);
        this.setId("enemy_hydra");
        this.setLocations(Locations.WATERFALL);
        this.setRarity(Rarity.RARE);
    }

    private RichFoam skill1 = new RichFoam();
    private Seasickness skill2 = new Seasickness();
    private IceStones skill3 = new IceStones();
    private IcicleAttack skill4 = new IcicleAttack();
    private WaterColumn skill5 = new WaterColumn();

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
