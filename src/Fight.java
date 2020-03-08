import livingCreatures.ALivingCreatures;

import java.util.Scanner;

public class Fight {

    public int fightFirstUser(ALivingCreatures attacker, ALivingCreatures gainer) {
        Scanner sc = new Scanner(System.in);
        while (attacker.getRemainingHealth() > 0 || gainer.getRemainingHealth() > 0) {
            boolean workingChooseSkill = true;
            while (workingChooseSkill) {
                System.out.println("Выберите умение, которое вы хотите использовать:\n" +
                        "1." + attacker.getSkill1().getNameSkill() + "\n2." + attacker.getSkill2().getNameSkill() + "\n3."
                        + attacker.getSkill3().getNameSkill());
                switch (sc.nextLine()) {
                    case "1":
                        attacker.chooseSkillUser(gainer, 1);
                        if (gainer.getRemainingHealth() < 0) {
                            gainer.setRemainingHealth(0);
                        }
                        workingChooseSkill = false;
                        break;
                    case "2":
                        attacker.chooseSkillUser(gainer, 2);
                        if (gainer.getRemainingHealth() < 0) {
                            gainer.setRemainingHealth(0);
                        }
                        workingChooseSkill = false;
                        break;
                    case "3":
                        attacker.chooseSkillUser(gainer, 3);
                        if (gainer.getRemainingHealth() < 0) {
                            gainer.setRemainingHealth(0);
                        }
                        workingChooseSkill = false;
                        break;
                    default:
                        System.out.println("Такого умения не существует, повторите выбор");
                }
            }

            System.out.println("\nТекущее здоровье " + gainer.getName() + ": " + gainer.getRemainingHealth());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (gainer.getRemainingHealth() <= 0) return 0;
            else {
                gainer.chooseSkill(attacker);
                if (attacker.getRemainingHealth() < 0) {
                    attacker.setRemainingHealth(0);
                }
                System.out.println("\nТекущее здоровье " + attacker.getName() + ": " + attacker.getRemainingHealth());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (attacker.getRemainingHealth() <= 0) return 1;
            }
        }
        return 2;
    }

    public int fightFirstEnemy(ALivingCreatures attacker, ALivingCreatures gainer) {
        Scanner sc = new Scanner(System.in);
        while (attacker.getRemainingHealth() > 0 || gainer.getRemainingHealth() > 0) {
            attacker.chooseSkill(gainer);
            if (gainer.getRemainingHealth() < 0) {
                gainer.setRemainingHealth(0);
            }
            System.out.println("\nТекущее здоровье " + gainer.getName() + ": " + gainer.getRemainingHealth());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (gainer.getRemainingHealth() <= 0) return 1;
            else {
                boolean workingChooseSkill = true;
                while (workingChooseSkill) {
                    System.out.println("Выберите умение, которое вы хотите использовать:\n" +
                            "1." + gainer.getSkill1().getNameSkill() + "\n2." + gainer.getSkill2().getNameSkill() + "\n3."
                            + gainer.getSkill3().getNameSkill());
                    switch (sc.nextLine()) {
                        case "1":
                            gainer.chooseSkillUser(attacker, 1);
                            if (attacker.getRemainingHealth() < 0) {
                                attacker.setRemainingHealth(0);
                            }
                            workingChooseSkill = false;
                            break;
                        case "2":
                            gainer.chooseSkillUser(attacker, 2);
                            if (attacker.getRemainingHealth() < 0) {
                                attacker.setRemainingHealth(0);
                            }
                            workingChooseSkill = false;
                            break;
                        case "3":
                            gainer.chooseSkillUser(attacker, 3);
                            if (attacker.getRemainingHealth() < 0) {
                                attacker.setRemainingHealth(0);
                            }
                            workingChooseSkill = false;
                            break;
                        default:
                            System.out.println("Такого умения не существует, повторите выбор");
                    }
                }
                System.out.println("\nТекущее здоровье " + attacker.getName() + ": " + attacker.getRemainingHealth());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (attacker.getRemainingHealth() <= 0) return 0;
            }
        }
        return 2;
    }
}
