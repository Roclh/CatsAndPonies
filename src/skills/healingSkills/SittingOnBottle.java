package skills.healingSkills;

import livingCreatures.ALivingCreatures;
import skills.ASkills;

public class SittingOnBottle extends ASkills {
    public SittingOnBottle(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public SittingOnBottle() {
        super("Присест на бутылку", 0, 0.8f);
    }

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        System.out.println(enemy.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy()) {
            System.out.println(enemy.getName() + " аккуратно присаживается и восстанавливает половину здоровья");
            if (enemy.getRemainingHealth() >= (enemy.getHealth()/2)) enemy.setRemainingHealth(enemy.getHealth());
            else enemy.setRemainingHealth(enemy.getHealth()/2 + enemy.getRemainingHealth());
        }
        else System.out.println(enemy.getName() + " не нашёл бутылку с узким горлышком");
    }
}
