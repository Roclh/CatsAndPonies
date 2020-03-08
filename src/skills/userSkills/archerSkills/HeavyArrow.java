package skills.userSkills.archerSkills;

import livingCreatures.ALivingCreatures;
import skills.ASkills;

public class HeavyArrow extends ASkills {
    public HeavyArrow(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public HeavyArrow() {
        super("Тяжёлая стрела", 9, 0.46f);//оглушает на 1 ход с ккой-то вероятностью
    }

    @Override
    public void cast(ALivingCreatures user, ALivingCreatures enemy) {
        System.out.println(user.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy() && Math.random() > enemy.getAgility()) {
            System.out.print("Атака наносит "
                    + (user.getStrength() + getDamage() - enemy.getProtection()) + " урона");
            enemy.setRemainingHealth(enemy.getRemainingHealth() - (user.getStrength() + getDamage() - enemy.getProtection()));
            if (Math.random() < 0.4) {
                System.out.print(", оглушая врага " + enemy.getName() + " на один ход\n");
            }
        } else System.out.println(user.getName() + " не попал");
    }
}
