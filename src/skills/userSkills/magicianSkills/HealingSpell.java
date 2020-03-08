package skills.userSkills.magicianSkills;

import livingCreatures.ALivingCreatures;
import skills.ASkills;

public class HealingSpell extends ASkills {
    public HealingSpell(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public HealingSpell() {
        super("Лечебное заклинание", 8, 0.85f);
    }

    @Override
    public void cast(ALivingCreatures user, ALivingCreatures enemy) {
        System.out.println(user.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy() && Math.random() > enemy.getAgility()) {
            System.out.print("Умение восстанавливает "
                    + getDamage() + " здоровья");
            if (user.getHealth() <= (user.getRemainingHealth() + getDamage()))
                user.setRemainingHealth(user.getHealth());
            else user.setRemainingHealth(user.getRemainingHealth() + getDamage());
        } else System.out.println(user.getName() + " не нашёл нужной странице в книге заклинаний");
    }
}