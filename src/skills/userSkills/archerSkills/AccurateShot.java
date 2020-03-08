package skills.userSkills.archerSkills;

import livingCreatures.ALivingCreatures;
import skills.ASkills;

public class AccurateShot extends ASkills {
    public AccurateShot(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public AccurateShot() {
        super("Точный выстрел", 6,1);
    }

    @Override
    public void cast(ALivingCreatures user, ALivingCreatures enemy) {
        System.out.println(user.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy() && Math.random() > enemy.getAgility()) {
            System.out.println("Атака с высокой точностью попадает по врагу " + enemy.getName() + " и наносит "
                    + (user.getStrength() + getDamage() - enemy.getProtection()) + " урона");
            enemy.setRemainingHealth(enemy.getRemainingHealth() - (user.getStrength() + getDamage() - enemy.getProtection()));
        } else System.out.println(enemy.getName() + " увернулся");
    }
}
