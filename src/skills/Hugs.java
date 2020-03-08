package skills;

import livingCreatures.ALivingCreatures;

import java.util.Scanner;

public class Hugs extends ASkills{
    public Hugs(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public Hugs() {
        super("Обнимашки", 4, 0.88f);
    }

    Scanner sc = new Scanner(System.in);

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        System.out.println(enemy.getName() + " спрашивает: 'Хочешь обняться?'");

        boolean answer = true;

        while (answer) {
            switch (sc.nextLine()){
                case "да":System.out.println(enemy.getName() + " использует умение " + getNameSkill());
                    if (Math.random() <= this.getAccuracy() && Math.random() > user.getAgility()) {
                        System.out.println(enemy.getName() + " обнимает со всей силы и наносит "
                                + (enemy.getStrength() + getDamage() - user.getProtection()) + " урона");
                        user.setRemainingHealth(user.getRemainingHealth() - (enemy.getStrength() + getDamage() - user.getProtection()));
                    } else System.out.println(enemy.getName() + " не попал");
                    answer = false;
                    break;
                case "нет": System.out.println(enemy.getName() + " говорит: 'Ну и ладно('");
                    answer = false;
                    break;
                default: System.out.println("Напишите да или нет");
                    break;
            }
        }
    }
}
