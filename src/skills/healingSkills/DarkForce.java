package skills.healingSkills;

import livingCreatures.ALivingCreatures;
import skills.ASkills;

public class DarkForce extends ASkills {
    public DarkForce(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public DarkForce() {
        super("Тёмная сила", 0, 0.7f);
    }

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        System.out.println(enemy.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy()) {
            System.out.println(enemy.getName() + " восстанавливает " + (enemy.getHealth()*0.2) + " здоровья");
            if (enemy.getRemainingHealth() >= (enemy.getHealth() - enemy.getHealth()*0.2)) enemy.setRemainingHealth(enemy.getHealth());
            else enemy.setRemainingHealth(enemy.getHealth()*0.2f + enemy.getRemainingHealth());
        }
        else System.out.println(enemy.getName() + " не нашёл сил для использования умения");
    }
}
