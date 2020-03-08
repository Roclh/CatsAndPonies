package skills;

import livingCreatures.ALivingCreatures;

public class Kick extends ASkills{
    public Kick(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public Kick() {
        super("Удар с ноги", 6,0.60f);
    }

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        System.out.println(enemy.getName() + " использует умение " + getNameSkill());

        double accuracy = Math.random();
        if (accuracy <= this.getAccuracy() && Math.random() > user.getAgility()) {
            System.out.println("Атака врага " + enemy.getName() + " наносит "
                    + (enemy.getStrength() + getDamage() - user.getProtection()) + " урона");
            user.setRemainingHealth(user.getRemainingHealth() - (enemy.getStrength() + getDamage() - user.getProtection()));
        }
        else if(accuracy > this.getAccuracy()) {
            System.out.println(enemy.getName() + " подскользнулся, пока пытался нанести урон\n" + enemy.getName()
                    + " получает " + getDamage() + " урона");
            enemy.setRemainingHealth(enemy.getRemainingHealth() - getDamage());
        }
        else System.out.println(enemy.getName() + " не попал");
    }
}
