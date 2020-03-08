package skills;

import livingCreatures.ALivingCreatures;

public class ITried extends ASkills{
    public ITried(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public ITried() {
        super("Your whole life 'I tried' and now YOU ARE GOING TO DIE", 9, 0.48f);
    }

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        System.out.println(enemy.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy()) {
            System.out.println("Атака врага '" + enemy.getName() + "' наносит "
                    + (enemy.getStrength() + getDamage() - user.getProtection()) + " урона, не смотря на все ваши старания");
            user.setRemainingHealth(user.getRemainingHealth() - (enemy.getStrength() + getDamage() - user.getProtection()));
        }
        else System.out.println(enemy.getName() + " не попал");
    }
}

