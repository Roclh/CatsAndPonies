package skills;

import livingCreatures.ALivingCreatures;

public class LeafStrike extends ASkills{
    public LeafStrike(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public LeafStrike() {
        super("Удар листиком", 2, 0.78f);
    }

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        System.out.println(enemy.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy() && Math.random() > user.getAgility()) {
            System.out.println("Атака врага " + enemy.getName() + " наносит "
                    + (enemy.getStrength() + getDamage() - user.getProtection()) + " урона и восстанавливает столько же здоровье атакующему");
            user.setRemainingHealth(user.getRemainingHealth() - (enemy.getStrength() + getDamage() - user.getProtection()));
            if (enemy.getRemainingHealth() <= (enemy.getHealth()-(enemy.getRemainingHealth()
                    + enemy.getStrength() + getDamage() - user.getProtection()))) enemy.setRemainingHealth(enemy.getHealth());
            else enemy.setRemainingHealth(enemy.getRemainingHealth() + enemy.getStrength() + getDamage() - user.getProtection());
        }
        else System.out.println(enemy.getName() + " не попал");
    }
}
