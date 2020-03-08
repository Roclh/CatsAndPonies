package skills;

import livingCreatures.ALivingCreatures;

public class InvisibleBlow extends ASkills{
    public InvisibleBlow(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public InvisibleBlow() {
        super("Невидимый удар", 4, 0.78f);
    }

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        System.out.println(enemy.getName() + " использует умение " + getNameSkill() + ", игнорируя ловкость");

        if (Math.random() <= this.getAccuracy()) {
            System.out.println("Атака врага " + enemy.getName() + " наносит "
                    + (enemy.getStrength() + getDamage() - user.getProtection()) + " урона");
            user.setRemainingHealth(user.getRemainingHealth() - (enemy.getStrength() + getDamage() - user.getProtection()));
        }
        else System.out.println(enemy.getName() + " не попал");
    }

}
