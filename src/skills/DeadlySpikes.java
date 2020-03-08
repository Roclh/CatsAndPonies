package skills;

import livingCreatures.ALivingCreatures;

public class DeadlySpikes extends ASkills{
    public DeadlySpikes(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public DeadlySpikes() {
        super("Смертоносные шипы", 7,0.65f);
    }

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        System.out.println(enemy.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy() && Math.random() > user.getAgility()) {
            user.setProtection(user.getProtection()-1);
            System.out.println("Атака врага " + enemy.getName() + " ломает броню и наносит "
                    + (enemy.getStrength() + getDamage() - user.getProtection()) + " урона");
            user.setRemainingHealth(user.getRemainingHealth() - (enemy.getStrength() + getDamage() - user.getProtection()));
        }
        else System.out.println(enemy.getName() + " не попал");
    }
}
