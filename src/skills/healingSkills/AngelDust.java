package skills.healingSkills;

import livingCreatures.ALivingCreatures;
import skills.ASkills;

public class AngelDust extends ASkills {
    public AngelDust(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public AngelDust() {
        super("Angel dust", 0, 0.6f);
    }

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        System.out.println(enemy.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy()) {
            System.out.println(enemy.getName() + " что-то активно нюхает и восстанавливает половину здоровья. Вы удивлены");
            if (enemy.getRemainingHealth() >= (enemy.getHealth()/2)) enemy.setRemainingHealth(enemy.getHealth());
            else enemy.setRemainingHealth(enemy.getHealth()/2 + enemy.getRemainingHealth());
        }
        else System.out.println(enemy.getName() + " не нашёл " + getNameSkill());
    }
}
