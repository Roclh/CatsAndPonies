package skills.healingSkills;

import livingCreatures.ALivingCreatures;
import skills.ASkills;

public class HugYourself extends ASkills {
    public HugYourself(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public HugYourself() {
        super("Самообъятия", 0, 0.8f);
    }

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        System.out.println(enemy.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy()) {
            System.out.println(enemy.getName() + " крепко-крепко обнимает себя и восстанавливает " + (enemy.getHealth()*0.1) + " здоровья");
            if (enemy.getRemainingHealth() >= (enemy.getHealth() - enemy.getHealth()*0.1)) enemy.setRemainingHealth(enemy.getHealth());
            else enemy.setRemainingHealth(enemy.getHealth()*0.1f + enemy.getRemainingHealth());
        }
        else System.out.println(enemy.getName() + " перехотел обниматься");
    }
}
