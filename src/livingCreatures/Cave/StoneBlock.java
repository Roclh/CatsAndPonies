package livingCreatures.Cave;

import enums.Locations;
import enums.Rarity;
import livingCreatures.ALivingCreatures;
import skills.AttackFromGround;
import skills.BlowToHead;
import skills.IceStones;

public class StoneBlock extends ALivingCreatures {
    public StoneBlock(String name, float health, float strength, float protection, float agility) {
        super(name, health, strength, protection, agility);
    }

    public StoneBlock() {
        super("Каменная глыба", 200, 15, 0, 0f);
        this.setId("enemy_stoneblock");
        this.setLocations(Locations.CAVE);
        this.setRarity(Rarity.UNCOMMON);
    }

     private BlowToHead skill1 = new BlowToHead();
     private AttackFromGround skill2 = new AttackFromGround();
     private IceStones skill3 = new IceStones();

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
