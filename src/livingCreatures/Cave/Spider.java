package livingCreatures.Cave;

import enums.Locations;
import enums.Rarity;
import livingCreatures.ALivingCreatures;
import skills.DeadlyAttack;
import skills.DeadlySpikes;
import skills.Web;

public class Spider extends ALivingCreatures {
    public Spider(String name, float health, float strength, float protection, float agility) {
        super(name, health, strength, protection, agility);
    }

    public Spider() {
        super("Паук", 100, 20,0,0.25f);
        this.setId("enemy_spider");
        this.setLocations(Locations.CAVE);
        this.setRarity(Rarity.COMMON);
    }

    private Web skill1 = new Web();
    private DeadlySpikes skill2 = new DeadlySpikes();
    private DeadlyAttack skill3 = new DeadlyAttack();

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
