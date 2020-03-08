package skills;

import livingCreatures.ALivingCreatures;

public class BiteAss extends ASkills{
    public BiteAss(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public BiteAss() {
        super("Кусь за жопку", 6,0.54f);
    }

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        System.out.println(enemy.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy() && Math.random() > user.getAgility()) {
            System.out.println("Атака врага " + enemy.getName() + " отнимает " + getDamage() + " брони и наносит "
                    + (enemy.getStrength() + getDamage() - (user.getProtection() - getDamage())) + " урона");
            user.setRemainingHealth(user.getRemainingHealth() - (enemy.getStrength() + getDamage()
                    - (user.getProtection() - getDamage())));
        }
        else System.out.println(enemy.getName() + " не попал");
    }
}
