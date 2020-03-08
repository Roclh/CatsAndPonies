package skills;

import livingCreatures.ALivingCreatures;

public class StabWithKnife extends ASkills{
    public StabWithKnife(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public StabWithKnife() {
        super("Тычок ножом", 3, 0.98f);
    }//кровотечение

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
