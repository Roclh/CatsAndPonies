package skills;

import livingCreatures.ALivingCreatures;

public class SurpriseAttack extends ASkills{
    public SurpriseAttack(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public SurpriseAttack() {
        super("Неожиданная атака", 8, 0.38f);
    }//оглушение на 1 ход

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        System.out.println(enemy.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy() && Math.random() > user.getAgility()) {
            System.out.println("Атака врага " + enemy.getName() + " неожиданно наносит "
                    + (enemy.getStrength() + getDamage() - user.getProtection()) + " урона");
            user.setRemainingHealth(user.getRemainingHealth() - (enemy.getStrength() + getDamage() - user.getProtection()));
        }
        else System.out.println(enemy.getName() + " не попал");
    }
}
