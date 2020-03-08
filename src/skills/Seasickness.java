package skills;

import livingCreatures.ALivingCreatures;

public class Seasickness extends ASkills{
    public Seasickness(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public Seasickness() {
        super("Морская болезнь", 5, 0.47f);
    }

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        System.out.println(enemy.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy() && Math.random() > user.getAgility()) {
            System.out.println("Атака врага " + enemy.getName() + " наносит "
                    + (enemy.getStrength() + getDamage() - user.getProtection()) + " урона. Вас укачивает.");
            if (Math.random() < 0.5) System.out.println("Вас тошнит и вы теряете " + getDamage() + " здоровья и столько же силы");
            user.setRemainingHealth(user.getRemainingHealth() - (enemy.getStrength() + getDamage() - user.getProtection()));
            if (0 >= (user.getStrength() - getDamage())) user.setStrength(0);
            else user.setStrength(user.getStrength() - getDamage());
        }
        else System.out.println(enemy.getName() + " не попал");
    }
}
