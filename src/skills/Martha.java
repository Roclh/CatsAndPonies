package skills;

import livingCreatures.ALivingCreatures;

import java.util.Scanner;

public class Martha extends ASkills{
    public Martha(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public Martha() {
        super("'Откуда ты знаешь Марту?'", 4,1);
    }

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        Scanner sc = new Scanner(System.in);

        System.out.println(enemy.getName() + " спрашивает: " + getNameSkill());
        sc.nextLine();
        System.out.println(enemy.getName() + ": плевать, потому что тебе всё равно конец!");

        if (Math.random() <= this.getAccuracy() && Math.random() > user.getAgility()) {
            System.out.println(enemy.getName() + " атакует и наносит "
                    + (enemy.getStrength() + getDamage() - user.getProtection()) + " урона");
            user.setRemainingHealth(user.getRemainingHealth() - (enemy.getStrength() + getDamage() - user.getProtection()));
        }
        else System.out.println(user.getName() + " увернулся от атаки");
    }
}
