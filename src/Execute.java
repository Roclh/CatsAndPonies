import exceptions.EmptyStringException;
import livingCreatures.Forest.Cactus;
import livingCreatures.Forest.Dwarf;
import livingCreatures.Forest.OliverTree;
import livingCreatures.User;

import java.util.Scanner;

public class Execute {
    public Execute(User user) {
        Scanner sc = new Scanner(System.in);
        Fight fight = new Fight();
        Randomizer randomizer = new Randomizer();
        boolean workingMenu = true;
        while (workingMenu) {
            System.out.println("**********Меню**********\n1.Выбор другой локации\n2.Посмотреть инвентарь\n3.Поиск драки" +
                    "\n4.Поиск квеста\n5.Посмотреть свои характеристики\n6.Изменить имя\n7.Выход");
            switch (sc.nextLine()) {
                case "1":
                    Location.ChangeLocation(user);
                    break;
                case "2":
                    break;
                case "3":
                    System.out.println("*поиск драки*");

                    float strength = user.getStrength();
                    float protection = user.getProtection();
                    float agility = user.getAgility();

                    int result = randomizer.searchForFight(user);
                    switch (result) {
                        case 0:
                            System.out.println("Вы победили");
                            if (user.getRemainingHealth() > user.getHealth()) user.setRemainingHealth(user.getHealth());
                            user.setStrength(strength);
                            user.setProtection(protection);
                            user.setAgility(agility);
                            break;
                        case 1:
                            System.out.println("Вы проиграли");
                            workingMenu = false;
                            break;
                        default:
                            break;
                    }
                    break;
                case "4":
                    ;
                    break;
                case "5":
                    user.ParametersOfUser();
                    break;
                case "6":
                    while (true) {
                        System.out.println("Введите новое имя");
                        try {
                            user.setName(sc.nextLine());
                            break;
                        } catch (EmptyStringException ignored) {

                        }
                    }
                    break;
                case "7":
                    workingMenu = false;
                    break;
                default:
                    System.out.println("Отсутствует такой вариант ответа. Повторите попытку");
                    break;
            }
        }
    }
}
