package skills;

import livingCreatures.ALivingCreatures;

import java.util.Scanner;

public class BlowToHead extends ASkills{
    public BlowToHead(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public BlowToHead() {
        super("Удар по голове", 8, 0.94f);
    }

    Scanner sc = new Scanner(System.in);

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        System.out.println(enemy.getName() + " использует умение " + getNameSkill());

        boolean trueAnswer = false;
        switch ((int)(Math.floor(Math.random()*5))) {
            case 0:
                System.out.println(enemy.getName() + " спрашивает: 'Сколько будет 2+2*2?'");
                if (sc.nextLine().equals("6")) {
                    System.out.println("Тебе повезло, не буду тебя трогать в этот раз");
                    trueAnswer = true;
                }
                break;
            case 1:
                System.out.println(enemy.getName() + " спрашивает: 'Сколько месяцев имеют 28 дней?'");
                if (sc.nextLine().equals("12")) {
                    System.out.println("Тебе повезло, не буду тебя трогать в этот раз");
                    trueAnswer = true;
                }
                break;
            case 2:
                System.out.println(enemy.getName() + " спрашивает: 'Сколько лет в году?'");
                if (sc.nextLine().equals("1")) {
                    System.out.println("Тебе повезло, не буду тебя трогать в этот раз");
                    trueAnswer = true;
                }
                break;
            case 3:
                System.out.println(enemy.getName() + " спрашивает: 'В каком числе цифр столько," +
                        " сколько букв в его названии?'");
                int answer = sc.nextInt();
                if (answer == 100 || answer == 1000000) {
                    System.out.println("Тебе повезло, не буду тебя трогать в этот раз");
                    trueAnswer = true;
                }
                break;
            case 4:
                System.out.println(enemy.getName() + " спрашивает: 'Напиши два двумя цифрами ?'");
                if (sc.nextLine().equals("10")) {
                    System.out.println("Тебе повезло, не буду тебя трогать в этот раз");
                    trueAnswer = true;
                }
                break;
            default:
                System.out.println("ОШИБКА С ВЫБОРОМ УМЕНИЯ 'УДАР ПО ГОЛОВЕ'");
                break;
        }

        if (trueAnswer == false) {
            System.out.println(enemy.getName() + " говорит: 'ХАХАХА, готовься к смерти!'");
            if (Math.random() <= this.getAccuracy() && Math.random() > user.getAgility()) {
                System.out.println("Атака врага " + enemy.getName() + " наносит "
                        + (enemy.getStrength() + getDamage() - user.getProtection()) + " урона");
                user.setRemainingHealth(user.getRemainingHealth() - (enemy.getStrength() + getDamage() - user.getProtection()));
            } else System.out.println(enemy.getName() + " не попал");
        }
    }
}
