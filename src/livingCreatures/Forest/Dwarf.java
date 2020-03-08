package livingCreatures.Forest;

import enums.Locations;
import enums.Rarity;
import livingCreatures.ALivingCreatures;
import skills.AttackWithSword;
import skills.HighFive;
import skills.Kick;

public class Dwarf extends ALivingCreatures {
    public Dwarf(String name, float health, float strength, float protection, float agility) {
        super(name, health, strength, protection, agility);
    }

    public Dwarf(){
        super("Дварф", 150, 10,0, 0.08f);
        this.setId("enemy_dwarf");
        this.setLocations(Locations.FOREST);
        this.setRarity(Rarity.UNCOMMON);
    }

    private HighFive skill1 = new HighFive();
    private AttackWithSword skill2 = new AttackWithSword();
    private Kick skill3 = new Kick();

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
