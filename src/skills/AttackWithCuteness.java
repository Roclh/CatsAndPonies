package skills;

import livingCreatures.ALivingCreatures;

public class AttackWithCuteness extends ASkills{
    public AttackWithCuteness(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public AttackWithCuteness() {
        super("Атака милотой", 8, 0.49f);
    }

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        System.out.println(enemy.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy() && Math.random() > user.getAgility()) {
            System.out.println("Атака врага " + enemy.getName() + " ослепляет вас, игнорируя броню и наносит "
                    + (enemy.getStrength() + getDamage()) + " урона");
            user.setRemainingHealth(user.getRemainingHealth() - (enemy.getStrength() + getDamage()));
        }
        else System.out.println(enemy.getName() + " не попал");
    }
}
