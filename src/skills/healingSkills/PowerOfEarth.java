package skills.healingSkills;

import livingCreatures.ALivingCreatures;
import skills.ASkills;

public class PowerOfEarth extends ASkills {
    public PowerOfEarth(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public PowerOfEarth() {
        super("Сила земли", 0, 0.6f);
    }

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        System.out.println(enemy.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy()) {
            System.out.println(enemy.getName() + " берёт ботву и восстанавливает " + (enemy.getHealth()*0.3) + " здоровья");
            if (enemy.getRemainingHealth() >= (enemy.getHealth() - enemy.getHealth()*0.3)) enemy.setRemainingHealth(enemy.getHealth());
            else enemy.setRemainingHealth(enemy.getHealth()*0.3f + enemy.getRemainingHealth());
        }
        else System.out.println(enemy.getName() + " не нашёл свободных огурцов");
    }
}
