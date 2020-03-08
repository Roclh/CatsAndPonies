package skills.userSkills.magicianSkills;

import livingCreatures.ALivingCreatures;
import skills.ASkills;

public class LightRay extends ASkills {
    public LightRay(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public LightRay() {
        super("Луч света", 7,0.78f);//-ловкость врага на следующее использованное умение
    }

    @Override
    public void cast(ALivingCreatures user, ALivingCreatures enemy) {
        System.out.println(user.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy() && Math.random() > enemy.getAgility()) {
            System.out.print("Атака наносит врагу " + enemy.getName() + " "
                    + (user.getStrength() + getDamage() - enemy.getProtection()) + " урона");
            enemy.setRemainingHealth(enemy.getRemainingHealth() - (user.getStrength() + getDamage() - enemy.getProtection()));
            if(Math.random() < 0.3) {
                System.out.print(", ослепляя врага\n");
                enemy.setAgility(0);
            }
        } else System.out.println(user.getName() + " не попал");
    }
}
