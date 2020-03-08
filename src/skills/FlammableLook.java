package skills;

import livingCreatures.ALivingCreatures;

public class FlammableLook extends ASkills{
    public FlammableLook(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public FlammableLook() {
        super("Воспламеняющий взгляд", 6, 0.46f);
    } //воспламенение (уменьшение здоровья на damage в течение 3х следующих ходов)

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        System.out.println(enemy.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy() && Math.random() > user.getAgility()) {
            System.out.println("Атака врага " + enemy.getName() + " наносит "
                    + (enemy.getStrength() + getDamage() - user.getProtection()) + " урона");
            user.setRemainingHealth(user.getRemainingHealth() - (enemy.getStrength() + getDamage() - user.getProtection()));
        }
        else System.out.println(enemy.getName() + " не попал");
    }
}
