package skills.healingSkills;

import livingCreatures.ALivingCreatures;
import skills.ASkills;

public class LickingWounds extends ASkills {
    public LickingWounds(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public LickingWounds() {
        super("Зализывание ран", 0, 0.7f);
    }

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        System.out.println(enemy.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy()) {
            System.out.println(enemy.getName() + " восстанавливает " + (enemy.getHealth()*0.25) + " здоровья");
            if (enemy.getRemainingHealth() >= (enemy.getHealth() - enemy.getHealth()*0.25)) enemy.setRemainingHealth(enemy.getHealth());
            else enemy.setRemainingHealth(enemy.getHealth()*0.25f + enemy.getRemainingHealth());
        }
        else System.out.println(enemy.getName() + " не нашёл сил для использования умения");
    }
}
