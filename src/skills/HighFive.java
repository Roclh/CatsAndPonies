package skills;

import livingCreatures.ALivingCreatures;

import java.util.Scanner;

public class HighFive extends ASkills{
    public HighFive(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public HighFive() {
        super("Дай пять!", 6, 1);
    }

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        Scanner sc = new Scanner(System.in);

        boolean answer = true;

            System.out.println(getNameSkill() + "\nВы даёте пять или игнорируете просьбу пресонажа " + enemy.getName() +
                    "?\n1.дам пять\n2.проигнорирую");
        while (answer) {
            int answerNum = sc.nextInt();
            if (answerNum == 1) {
                switch ((int)(Math.random()*2)) {
                    case 1: System.out.println(enemy.getName() + ": 'Класс, давай я восстановлю тебе "
                            + getDamage() + " здоровья, для такого и не жалко'");
                        user.setRemainingHealth(user.getRemainingHealth() + getDamage());
                        if (user.getRemainingHealth() > user.getHealth()) user.setRemainingHealth(user.getHealth());
                        break;
                    case 0: System.out.println(enemy.getName() + " даёт такую сильную пятюню, что этот удар отнимает у вас "
                    + getDamage() + " здоровья");
                        user.setRemainingHealth(user.getRemainingHealth() - getDamage());
                        if (user.getRemainingHealth() > user.getHealth()) user.setRemainingHealth(user.getHealth());
                        break;
                    default:
                        break;
                }
                answer = false;
            }
            else if (answerNum == 2) {
                System.out.println(enemy.getName() + ": 'А я думал, ты не такой...'");
                if (Math.random() <= this.getAccuracy() && Math.random() > user.getAgility()) {
                    System.out.println("Атака врага " + enemy.getName() + " наносит "
                            + (enemy.getStrength() + getDamage() - user.getProtection()) + " урона");
                    user.setRemainingHealth(user.getRemainingHealth() - (enemy.getStrength() + getDamage() - user.getProtection()));
                }
                else System.out.println(enemy.getName() + " не попал");
                answer = false;
            }
            else System.out.println("Напишите 1 или 2");
        }
    }
}
