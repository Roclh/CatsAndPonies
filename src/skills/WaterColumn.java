package skills;

import livingCreatures.ALivingCreatures;

public class WaterColumn extends ASkills{
    public WaterColumn(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public WaterColumn(){
        super("Водяной столб", 5, 0.7f);
    }

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        System.out.println(enemy.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy() && Math.random() > user.getAgility()) {
            System.out.println("Атака врага " + enemy.getName() + " наносит "
                    + (enemy.getStrength() + getDamage() - user.getProtection())
                    + " урона. Вы становитесь мокрым и вам тяжело двигаться. " + enemy.getName()
                    + " снимает с " + user.getName() + " " + user.getAgility()*0.1 +" ловкости");
            user.setRemainingHealth(user.getRemainingHealth() - (enemy.getStrength() + getDamage() - user.getProtection()));
            if (0 >= (user.getAgility() - user.getAgility()*0.1)) user.setAgility(0);
            user.setAgility(user.getAgility() - user.getAgility()*0.1f);
        } else System.out.println(enemy.getName() + " не попал");
    }
}
