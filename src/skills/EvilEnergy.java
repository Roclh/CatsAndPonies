package skills;

import livingCreatures.ALivingCreatures;

public class EvilEnergy extends ASkills{
    public EvilEnergy(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public EvilEnergy() {
        super("Злая энергия", 9, 0.4f);
    }

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        System.out.println(enemy.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy() && Math.random() > user.getAgility()) {
            System.out.println("Атака врага " + enemy.getName() + " наносит "
                    + (enemy.getStrength() + getDamage() - user.getProtection()) + " урона и уменьшает броню на " + (getAccuracy()*10));
            user.setRemainingHealth(user.getRemainingHealth() - (enemy.getStrength() + getDamage() - user.getProtection()));
            user.setProtection(user.getProtection() - (getAccuracy()*10));
        }
        else System.out.println(enemy.getName() + " не попал");
    }
}
