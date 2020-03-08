package skills;

import livingCreatures.ALivingCreatures;

public class AttackWithSword extends ASkills {
    public AttackWithSword(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public AttackWithSword() {
        super("Атака мечом", 9, 0.4f);
    }

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        System.out.println(enemy.getName() + " использует умение " + getNameSkill());
        if((int)(Math.random()*2) == 0) {
            if (Math.random() <= this.getAccuracy() && Math.random() > user.getAgility()) {
                System.out.println("Атака врага " + enemy.getName() + " наносит "
                        + (enemy.getStrength() + getDamage() - user.getProtection()) + " урона");
                user.setRemainingHealth(user.getRemainingHealth() - (enemy.getStrength() + getDamage() - user.getProtection()));
            }
            else System.out.println(enemy.getName() + " не попал");
        }
        else {
            if (Math.random() <= this.getAccuracy() && Math.random() > user.getAgility()) {
                System.out.println("Атака врага " + enemy.getName() + " наносит двойной урон "
                        + (enemy.getStrength() + getDamage()*2 - user.getProtection()) + " урона");
                user.setRemainingHealth(user.getRemainingHealth() - (enemy.getStrength() + getDamage()*2 - user.getProtection()));
            }
            else System.out.println(enemy.getName() + " не попал");
        }
    }
}
