package skills;

import livingCreatures.ALivingCreatures;

public class AttackFromGround extends ASkills{
    public AttackFromGround(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public AttackFromGround() {
        super("Атака из под земли", 4, 0.45f);
    }

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