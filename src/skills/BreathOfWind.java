package skills;

import livingCreatures.ALivingCreatures;

public class BreathOfWind extends ASkills{
    public BreathOfWind(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public BreathOfWind() {
        super("Дуновение ветра", 2,0.98f);
    }

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        System.out.println(enemy.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy() && Math.random() > (user.getAgility() + getDamage()/10)) {
            System.out.println("Атака врага " + enemy.getName() + " игнорирует броню и отнимает ловкость, наносит "
                    + (enemy.getStrength() + getDamage()) + " урона");
            user.setRemainingHealth(user.getRemainingHealth() - (enemy.getStrength() + getDamage()));
        }
        else System.out.println(enemy.getName() + " не попал");
    }
}
