package skills;

import livingCreatures.ALivingCreatures;

public class RichFoam extends ASkills{
    public RichFoam(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public RichFoam() {
        super("Обильная пена", 6, 0.78f);
    }

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        System.out.println(enemy.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy() && Math.random() > user.getAgility()) {
            System.out.println("Атака врага " + enemy.getName() + " наносит "
                    + (enemy.getStrength() + getDamage() - user.getProtection())
                    + " урона, покрывая вас с ног до головы пеной, уменьшая ловкость на " + (getDamage()/100));
            if (user.getAgility() <= (getDamage()/100)) user.setAgility(0);
            else user.setAgility(user.getAgility() - (getDamage()/100));
            user.setRemainingHealth(user.getRemainingHealth() - (enemy.getStrength() + getDamage() - user.getProtection()));
        }
        else System.out.println(enemy.getName() + " не попал");
    }
}
