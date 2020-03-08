package livingCreatures;

import enums.Race;
import enums.Type;
import skills.userSkills.archerSkills.AccurateShot;
import skills.userSkills.archerSkills.HeavyArrow;
import skills.userSkills.archerSkills.SharpEye;
import skills.userSkills.bardSkills.Witcher;
import skills.userSkills.knightSkills.HeavyBlowOfSword;
import skills.userSkills.knightSkills.ImpactBySword;
import skills.userSkills.knightSkills.Shield;
import skills.userSkills.magicianSkills.BlowToHeadWithStaff;
import skills.userSkills.magicianSkills.HealingSpell;
import skills.userSkills.magicianSkills.LightRay;
import skills.userSkills.thiefSkills.ImpudentThief;

import java.util.Scanner;

public class User extends AUser {
    public User(String name, Race race, Type type, float health, float strength, float protection, float agility) {
        super(name, race, type, health, strength, protection, agility);
    }

    public User() {
        super("Имя", Race.CAT, Type.BARD, 100, 15, 2, 0.05f);
    }

    public void ParametersOfUser() {
        System.out.printf("Характеристики игрока %s:\n|Раса: %9s|Класс: %8s|Здоровье: %5.0f|\n|Сила: %9.0f|Защита: %7.0f|Ловкость: %5.2f|\n",
                this.getName(), Race.getRusRace(this.getRace()), Type.getRusType(this.getType()), this.getRemainingHealth(), this.getStrength(), this.getProtection(), this.getAgility());
    }


    public void chooseTypeSkill() {
        switch (this.getType()) {
            case ARCHER:
                this.setSkill1(new AccurateShot());
                this.setSkill2(new HeavyArrow());
                this.setSkill3(new SharpEye());
                break;
            case MAGICIAN:
                this.setSkill1(new BlowToHeadWithStaff());
                this.setSkill2(new HealingSpell());
                this.setSkill3(new LightRay());
                break;
            case KNIGHT:
                this.setSkill1(new ImpactBySword());
                this.setSkill2(new HeavyBlowOfSword());
                this.setSkill3(new Shield());
                break;
            case THIEF:
                this.setSkill1(new ImpudentThief());
                break;
            case BARD:
                this.setSkill1(new Witcher());
                break;
        }
    }

    private int getEnabledSkills() {
        if (this.getType().equals(Type.BARD)) return 1;
        return 0;
    }

    @Override
    public void chooseSkillUser(ALivingCreatures gainer, int sc) {
        switch (sc) {
            case 1:
                this.getSkill1().cast(this, gainer);
                break;
            case 2:
                this.getSkill2().cast(this, gainer);
                break;
            case 3:
                this.getSkill3().cast(this, gainer);
                break;
            case 4:
                this.getSkill4().cast(this, gainer);
                break;
            case 5:
                this.getSkill5().cast(this, gainer);
                break;
            default:
                System.out.println("ОШИБКА С ВЫБОРОМ СКИЛЛА");
                break;
        }
    }
}
