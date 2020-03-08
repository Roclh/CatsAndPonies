import enums.Rarity;
import exceptions.GetEnemyException;
import livingCreatures.ALivingCreatures;
import livingCreatures.AllEnemies;
import livingCreatures.Cave.*;
import livingCreatures.Forest.*;
import livingCreatures.Guard;
import livingCreatures.Mewt.*;
import livingCreatures.Ponyville.*;
import livingCreatures.Road.*;
import livingCreatures.User;
import livingCreatures.Waterfall.*;

import java.util.Scanner;

public class Randomizer {
    public Randomizer() {
    }

    public int searchForFight(ALivingCreatures user) {
        Scanner sc = new Scanner(System.in);
        Fight fight = new Fight();

        ALivingCreatures randomEnemy1;
        ALivingCreatures randomEnemy2;
        ALivingCreatures randomEnemy3;

        boolean workingSearch = true;
        boolean workingAction;
        boolean workingFightWith = true;

        int result;

        while (workingSearch) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".\n");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            workingAction = true;
            System.out.println("Нашлись следующие монстры:");
            switch ((int) Math.floor(Math.random() * 3)) {
                case 0:
                    randomEnemy1 = selectingEnemyByLocation(user);
                    System.out.println("-" + randomEnemy1.getName());
                    while (workingAction) {
                        System.out.println("Что вы хотите сделать?\n1.Драться с врагом"
                                + "\n2.Продолжить рыскать\n3.Попытаться сбежать");
                        switch (sc.nextLine()) {
                            case "1":
                                System.out.println("Ваше текущее здоровье: " + user.getRemainingHealth());
                                result = fight.fightFirstUser(user, randomEnemy1);
                                return result;
                            case "2":
                                if (Math.random() < 0.1) {
                                    System.out.println("На вас напали!\nВаше текущее здоровье: " + user.getRemainingHealth());
                                    result = fight.fightFirstEnemy(selectingEnemyByLocation(user), user);
                                    return result;
                                } else workingAction = false;
                                break;
                            case "3":
                                if (Math.random() < 0.1) {
                                    System.out.println("На вас напали!\nВаше текущее здоровье: " + user.getRemainingHealth());
                                    result = fight.fightFirstEnemy(selectingEnemyByLocation(user), user);
                                    return result;
                                } else {
                                    System.out.println("Вам удалось сбежать");
                                    return 2;
                                }
                            default:
                                System.out.println("Отсутствует такой вариант ответа. Повторите попытку");
                                break;
                        }
                    }
                    break;
                case 1:
                    randomEnemy1 = selectingEnemyByLocation(user);
                    randomEnemy2 = selectingEnemyByLocation(user);
                    System.out.println("-" + randomEnemy1.getName() + "\n-" + randomEnemy2.getName());
                    while (workingAction) {
                        System.out.println("Что вы хотите сделать?\n1.Драться с выбранным врагом"
                                + "\n2.Продолжить рыскать\n3.Попытаться сбежать");
                        switch (sc.nextLine()) {
                            case "1":
                                while (workingFightWith) {
                                    System.out.println("Выберите врага:\n1." + randomEnemy1.getName() + "\n2."
                                            + randomEnemy2.getName());
                                    switch (sc.nextLine()) {
                                        case "1":
                                            System.out.println("Вы начали драку с " + randomEnemy1.getName()
                                                    + "\nВаше текущее здоровье: " + user.getRemainingHealth());
                                            result = fight.fightFirstUser(user, randomEnemy1);
                                            return result;
                                        case "2":
                                            System.out.println("Вы начали драку с " + randomEnemy2.getName()
                                                    + "\nВаше текущее здоровье: " + user.getRemainingHealth());
                                            result = fight.fightFirstUser(user, randomEnemy2);
                                            return result;
                                        default:
                                            System.out.println("Отсутствует такой вариант ответа. Повторите попытку");
                                            break;
                                    }
                                }
                                break;
                            case "2":
                                if (Math.random() < 0.1) {
                                    System.out.println("На вас напали!\nВаше текущее здоровье: " + user.getRemainingHealth());
                                    result = fight.fightFirstEnemy(selectingEnemyByLocation(user), user);
                                    return result;
                                } else workingAction = false;
                                break;
                            case "3":
                                if (Math.random() < 0.1) {
                                    System.out.println("На вас напали!\nВаше текущее здоровье: " + user.getRemainingHealth());
                                    result = fight.fightFirstEnemy(selectingEnemyByLocation(user), user);
                                    return result;
                                } else {
                                    System.out.println("Вам удалось сбежать");
                                    return 2;
                                }
                            default:
                                System.out.println("Отсутствует такой вариант ответа. Повторите попытку");
                                break;
                        }
                    }
                    break;
                case 2:
                    randomEnemy1 = selectingEnemyByLocation(user);
                    randomEnemy2 = selectingEnemyByLocation(user);
                    randomEnemy3 = selectingEnemyByLocation(user);
                    System.out.println("-" + randomEnemy1.getName() + "\n-" + randomEnemy2.getName() + "\n-" + randomEnemy3.getName());
                    while (workingAction) {
                        System.out.println("Что вы хотите сделать?\n1.Драться с выбранным врагом"
                                + "\n2.Продолжить рыскать\n3.Попытаться сбежать");
                        switch (sc.nextLine()) {
                            case "1":
                                while (workingFightWith) {
                                    System.out.println("Выберите врага:\n1." + randomEnemy1.getName() + "\n2."
                                            + randomEnemy2.getName() + "\n3." + randomEnemy3.getName());
                                    switch (sc.nextLine()) {
                                        case "1":
                                            System.out.println("Вы начали драку с " + randomEnemy1.getName()
                                                    + "\nВаше текущее здоровье: " + user.getRemainingHealth());
                                            result = fight.fightFirstUser(user, randomEnemy1);
                                            return result;
                                        case "2":
                                            System.out.println("Вы начали драку с " + randomEnemy2.getName()
                                                    + "\nВаше текущее здоровье: " + user.getRemainingHealth());
                                            result = fight.fightFirstUser(user, randomEnemy2);
                                            return result;
                                        case "3":
                                            System.out.println("Вы начали драку с " + randomEnemy3.getName()
                                                    + "\nВаше текущее здоровье: " + user.getRemainingHealth());
                                            result = fight.fightFirstUser(user, randomEnemy3);
                                            return result;
                                        default:
                                            System.out.println("Отсутствует такой вариант ответа. Повторите попытку");
                                            break;
                                    }
                                }
                                break;
                            case "2":
                                if (Math.random() < 0.1) {
                                    System.out.println("На вас напали!\nВаше текущее здоровье: " + user.getRemainingHealth());
                                    result = fight.fightFirstEnemy(selectingEnemyByLocation(user), user);
                                    return result;
                                } else workingAction = false;
                                break;
                            case "3":
                                if (Math.random() < 0.1) {
                                    System.out.println("На вас напали!\nВаше текущее здоровье: " + user.getRemainingHealth());
                                    result = fight.fightFirstEnemy(selectingEnemyByLocation(user), user);
                                    return result;
                                } else {
                                    System.out.println("Вам удалось сбежать");
                                    return 2;
                                }
                            default:
                                System.out.println("Отсутствует такой вариант ответа. Повторите попытку");
                                break;
                        }
                    }
                    break;
                default:
                    return 2;
            }
        }
        return 2;
    }

    public ALivingCreatures selectingEnemyByLocation(ALivingCreatures user) {
        AllEnemies allEnemies = new AllEnemies();

        return allEnemies.filterByLocation(user.getLocations()).filterByRarity(Rarity.randomRare()).getRandomEnemy();

    }
}
