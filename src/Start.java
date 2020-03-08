import enums.Race;
import enums.Type;
import exceptions.EmptyStringException;
import livingCreatures.ALivingCreatures;
import livingCreatures.AUser;
import livingCreatures.User;

import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User();

        while (true) {
            System.out.println("Введите своё имя");
            try {
                user.setName(sc.nextLine());
                break;
            } catch (EmptyStringException ignored) {
            }
        }

        boolean workingRace = true;
        while (workingRace) {
            System.out.println("Выберите расу: 1.Котик 2.Пони");
            switch (sc.nextInt()) {
                case 1:
                    user.setRace(Race.CAT);
                    workingRace = false;
                    break;
                case 2:
                    user.setRace(Race.PONY);
                    workingRace = false;
                    break;
                default:
                    System.out.println("Отсутствует такой вариант ответа. Повторите попытку");
                    break;
            }
        }

        boolean workingType = true;
        workingRace = true;
        if (user.getRace() == Race.PONY) {
            while (workingRace) {
                System.out.println("Выберите подрасу: 1.Пони 2.Единорог 3.Пегас");
                switch (sc.nextInt()) {
                    case 1:
                        user.setRace(Race.PONY);
                        while (workingType) {
                            System.out.println("Выберите класс: 1.Рыцарь 2.Бард");
                            switch (sc.nextInt()) {
                                case 1:
                                    user.setType(Type.KNIGHT);
                                    workingType = false;
                                    break;
                                case 2:
                                    user.setType(Type.BARD);
                                    workingType = false;
                                    break;
                                default:
                                    System.out.println("Отсутствует такой вариант ответа. Повторите попытку");
                                    break;
                            }
                        }
                        workingRace = false;
                        break;
                    case 2:
                        user.setRace(Race.UNICORN);
                        while (workingType) {
                            System.out.println("Выберите класс: 1.Маг 2.Бард");
                            switch (sc.nextInt()) {
                                case 1:
                                    user.setType(Type.MAGICIAN);
                                    workingType = false;
                                    break;
                                case 2:
                                    user.setType(Type.BARD);
                                    workingType = false;
                                    break;
                                default:
                                    System.out.println("Отсутствует такой вариант ответа. Повторите попытку");
                                    break;
                            }
                        }
                        workingRace = false;
                        break;
                    case 3:
                        user.setRace(Race.PEGASUS);
                        while (workingType) {
                            System.out.println("Выберите класс: 1.Лучник 2.Бард");
                            switch (sc.nextInt()) {
                                case 1:
                                    user.setType(Type.ARCHER);
                                    workingType = false;
                                    break;
                                case 2:
                                    user.setType(Type.BARD);
                                    workingType = false;
                                    break;
                                default:
                                    System.out.println("Отсутствует такой вариант ответа. Повторите попытку");
                                    break;
                            }
                        }
                        workingRace = false;
                        break;
                    default:
                        System.out.println("Отсутствует такой вариант ответа. Повторите попытку");
                        break;
                }
            }
        }

        workingType = true;
        if (user.getRace() == Race.CAT) {
            while (workingType) {
                System.out.println("Выберите класс: 1.Лучник 2.Маг 3.Вор 4.Бард");
                switch (sc.nextInt()) {
                    case 1:
                        user.setType(Type.ARCHER);
                        workingType = false;
                        break;
                    case 2:
                        user.setType(Type.MAGICIAN);
                        workingType = false;
                        break;
                    case 3:
                        user.setType(Type.THIEF);
                        workingType = false;
                        break;
                    case 4:
                        user.setType(Type.BARD);
                        workingType = false;
                        break;
                    default:
                        System.out.println("Отсутствует такой вариант ответа. Повторите попытку");
                        break;
                }
            }
        }
        user.chooseTypeSkill();
        new Execute(user);
    }
}

