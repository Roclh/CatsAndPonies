package skills.userSkills.knightSkills;

import livingCreatures.ALivingCreatures;
import skills.ASkills;

public class ImpactBySword extends ASkills {
    public ImpactBySword(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public ImpactBySword() {
        super("Удар мечом", 4, 0.98f);
    }

    @Override
    public void cast(ALivingCreatures user, ALivingCreatures enemy) {
        System.out.println(user.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy() && Math.random() > enemy.getAgility()) {
            System.out.print("Атака наносит врагу " + enemy.getName() + " "
                    + (user.getStrength() + getDamage() - enemy.getProtection()) + " урона");
            enemy.setRemainingHealth(enemy.getRemainingHealth() - (user.getStrength() + getDamage() - enemy.getProtection()));
        } else System.out.println(user.getName() + " не попал");
    }
}
