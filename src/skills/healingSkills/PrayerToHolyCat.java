package skills.healingSkills;

import livingCreatures.ALivingCreatures;
import skills.ASkills;

public class PrayerToHolyCat extends ASkills {
    public PrayerToHolyCat(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public PrayerToHolyCat() {
        super("Молитва святому котику", 0, 0.5f);
    }

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        System.out.println(enemy.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy()) {
            System.out.println(enemy.getName() + " восстанавливает " + (enemy.getHealth()*0.15) + " здоровья. Слава Святому Котику!");
            if (enemy.getRemainingHealth() >= (enemy.getHealth() - enemy.getHealth()*0.15)) enemy.setRemainingHealth(enemy.getHealth());
            else enemy.setRemainingHealth(enemy.getHealth()*0.15f + enemy.getRemainingHealth());
        }
        else System.out.println("Святой котик не услышал молитвы");
    }
}
