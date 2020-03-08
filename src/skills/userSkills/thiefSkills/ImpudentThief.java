package skills.userSkills.thiefSkills;

import livingCreatures.ALivingCreatures;
import skills.ASkills;

public class ImpudentThief extends ASkills {
    public ImpudentThief(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public ImpudentThief() {
        super("Наглый воришка", 0.25f, 0.6f);
    }

    @Override
    public void cast(ALivingCreatures user, ALivingCreatures enemy) {
        System.out.println(user.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy() && Math.random() > enemy.getAgility()) {
            System.out.print(user.getName() + " ворует"
                    + (getDamage() * 100) + "% здоровья у " + enemy.getName());
            if (user.getRemainingHealth() <= (user.getHealth() - (enemy.getRemainingHealth() * getDamage())))
                user.setRemainingHealth(user.getHealth());
            else user.setRemainingHealth(user.getRemainingHealth() + (enemy.getRemainingHealth() * getDamage()));

            if ((enemy.getRemainingHealth() - (enemy.getRemainingHealth() * getDamage())) <= 0)
                enemy.setRemainingHealth(0);
            else enemy.setRemainingHealth(enemy.getRemainingHealth() - (enemy.getRemainingHealth() * getDamage()));
        } else System.out.println("У " + user.getName() + " не получилось своровать здоровье у врага");
    }
}
