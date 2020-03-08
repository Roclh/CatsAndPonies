package skills.healingSkills;

import livingCreatures.ALivingCreatures;
import skills.ASkills;

public class PrayerToHolyPony extends ASkills {
    public PrayerToHolyPony(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public PrayerToHolyPony() {
        super("Молитва святому пони", 0, 0.5f);
    }

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        System.out.println(enemy.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy()) {
            System.out.println(enemy.getName() + " восстанавливает " + (enemy.getHealth()*0.15) + " здоровья. Слава Святому Пони!");
            if (enemy.getRemainingHealth() >= (enemy.getHealth() - enemy.getHealth()*0.15)) enemy.setRemainingHealth(enemy.getHealth());
            else enemy.setRemainingHealth(enemy.getHealth()*0.15f + enemy.getRemainingHealth());
        }
        else System.out.println("Святой пони не услышал молитвы");
    }
}
