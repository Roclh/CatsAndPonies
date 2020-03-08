package skills.healingSkills;

import livingCreatures.ALivingCreatures;
import skills.ASkills;

public class FileNails extends ASkills {
    public FileNails(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public FileNails() {
        super("Подпилить ноготочки", 0, 0.8f);
    }

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        System.out.println(enemy.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy()) {
            System.out.println(enemy.getName() + " активно пилит ногти и восстанавливает " + (enemy.getHealth()*0.15) + " здоровья");
            if (enemy.getRemainingHealth() >= (enemy.getHealth() - enemy.getHealth()*0.15)) enemy.setRemainingHealth(enemy.getHealth());
            else enemy.setRemainingHealth(enemy.getHealth()*0.15f + enemy.getRemainingHealth());
        }
        else System.out.println(enemy.getName() + " не нашёл пилочку");
    }
}
