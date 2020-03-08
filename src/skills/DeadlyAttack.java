package skills;

import livingCreatures.ALivingCreatures;

public class DeadlyAttack extends ASkills{
    public DeadlyAttack(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public DeadlyAttack() {
        super("Смертельная атака", 0.01f, 0.33f);
    }

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        System.out.println(enemy.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy() && Math.random() > user.getAgility()) {
            System.out.println("Атака врага " + enemy.getName() + " наносит "
                    + (user.getRemainingHealth()*getDamage())
                    + " урона в 10% от вашего текущего здоровья");
            user.setRemainingHealth(user.getRemainingHealth()*getDamage());
        }
        else System.out.println(enemy.getName() + " не попал");
    }
}
