package skills;

import livingCreatures.ALivingCreatures;

public class Echolocation extends ASkills{
    public Echolocation(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public Echolocation() {
        super("Эхолокация", 4, 0.84f);
    }

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        System.out.println(enemy.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy() && Math.random() > user.getAgility()) {
            System.out.println("Атака врага " + enemy.getName() + " игнорирует броню и наносит "
                    + (enemy.getStrength() + getDamage()) + " урона. Ваши уши сильно пострадали");
            user.setRemainingHealth(user.getRemainingHealth() - (enemy.getStrength() + getDamage()));
        }
        else System.out.println(enemy.getName() + " не попал");
    }
}
