package livingCreatures.Ponyville;

import enums.Locations;
import enums.Rarity;
import livingCreatures.ALivingCreatures;
import skills.DeadlyAttack;
import skills.EvilEnergy;
import skills.SurpriseAttack;
import skills.healingSkills.AngelDust;

public class LiveHorseshoe extends ALivingCreatures {
    public LiveHorseshoe(String name, float health, float strength, float protection, float agility) {
        super(name, health, strength, protection, agility);
    }

    public LiveHorseshoe(){
        super("Живая подкова", 60, 5,0,0);
        this.setId("enemy_livehorseshoe");
        this.setLocations(Locations.PONYVILLE);
        this.setRarity(Rarity.COMMON);
    }

    private DeadlyAttack skill1 = new DeadlyAttack();
    private SurpriseAttack skill2 = new SurpriseAttack();
    private EvilEnergy skill3 = new EvilEnergy();

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
