package skills.userSkills.knightSkills;

import livingCreatures.ALivingCreatures;
import skills.ASkills;

public class HeavyBlowOfSword extends ASkills {
    public HeavyBlowOfSword(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public HeavyBlowOfSword() {
        super("Тяжёлый удар мечом", 9, 0.4f);//ломает броню с низкой вероятностью
    }

    @Override
    public void cast(ALivingCreatures user, ALivingCreatures enemy) {
        System.out.println(user.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy() && Math.random() > enemy.getAgility()) {
            System.out.print("Атака, попадая по врагу " + enemy.getName() + ", наносит "
                    + (user.getStrength() + getDamage() - enemy.getProtection()) + " урона");
            enemy.setRemainingHealth(enemy.getRemainingHealth() - (user.getStrength() + getDamage() - enemy.getProtection()));
            if(Math.random() < 0.1) {
             System.out.print(", ломая его броню\n");
             enemy.setProtection(0);
            }
        } else System.out.println(user.getName() + " не попал");
    }
}
