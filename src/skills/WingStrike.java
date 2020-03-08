package skills;

import livingCreatures.ALivingCreatures;

public class WingStrike extends ASkills{
    public WingStrike(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public WingStrike() {
        super("Удар крылышком", 1, 0.28f);
    }

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        System.out.println(enemy.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy() && Math.random() > user.getAgility()) {
            System.out.println(enemy.getName() + " порхает и наносит несколькими ударами "
                    + (enemy.getStrength() + getDamage() - user.getProtection()) + ", " + (enemy.getStrength() + getDamage())
                    + " и " + (enemy.getStrength() - user.getProtection() ) + " урона");
            user.setRemainingHealth(user.getRemainingHealth() - (enemy.getStrength()*3 + getDamage()*2 - user.getProtection()*2));
        }
        else System.out.println(enemy.getName() + " не попал");
    }
}
