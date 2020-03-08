package livingCreatures.Forest;

import enums.Locations;
import enums.Rarity;
import livingCreatures.ALivingCreatures;
import skills.AnnoyingMelody;
import skills.IAmSorry;
import skills.ITried;

public class OliverTree extends ALivingCreatures {
    public OliverTree(String name, float health, float strength, float protection, float agility) {
        super(name, health, strength, protection, agility);
    }

    public OliverTree(){
        super("Oliver Tree", 320, 15, 0,0.35f);
        this.setId("enemy_olivertree");
        this.setLocations(Locations.FOREST);
        this.setRarity(Rarity.RARE);
    }

    private AnnoyingMelody skill1 = new AnnoyingMelody();
    private ITried skill2 = new ITried();
    private IAmSorry skill3 = new IAmSorry();

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
