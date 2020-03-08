package livingCreatures.Forest;

import enums.Locations;
import enums.Rarity;
import livingCreatures.ALivingCreatures;
import skills.DeadlySpikes;
import skills.Hugs;
import skills.NeedleStrike;

public class Cactus extends ALivingCreatures {
    public Cactus(String name, float health, float strength, float protection, float agility) {
        super(name, health, strength, protection, agility);
    }

    public Cactus(){
        super("Кактус", 80, 25, 0,0.07f);
        this.setId("enemy_cactus");
        this.setLocations(Locations.FOREST);
        this.setRarity(Rarity.COMMON);
    }

    private NeedleStrike skill1 = new NeedleStrike();
    private Hugs skill2 = new Hugs();
    private DeadlySpikes skill3 = new DeadlySpikes();

    @Override
    public void chooseSkill(ALivingCreatures gainer){
        switch ((int)(Math.floor(Math.random()*3))){
            case 0: skill1.cast(this, gainer);
                break;
            case 1: skill2.cast(this, gainer);
                break;
            case 2: skill3.cast(this, gainer);
                break;
            default: System.out.println("ОШИБКА С РАНДОМОМ В ВЫБОРЕ УМЕНИЯ");
                break;
        }
    }
}
