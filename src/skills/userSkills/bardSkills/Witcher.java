package skills.userSkills.bardSkills;

import livingCreatures.ALivingCreatures;
import skills.ASkills;

import java.util.Scanner;

public class Witcher extends ASkills {
    public Witcher(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public Witcher() {
        super("'Ведьмаку заплатите чеканной монетой...'", 0, 1);
    }

    Scanner sc = new Scanner(System.in);

    @Override
    public void cast(ALivingCreatures user, ALivingCreatures enemy) {
        boolean workingChooseSkill = true;
        while(workingChooseSkill) {
            System.out.println("Выберите умение, которое вы хотите использовать:\n" +
                    "1.Чудесная песня\n2.Прелестная песня\n3.Замечательная песня");
            switch (sc.nextLine()) {
                case "1":
                    System.out.println(user.getName() + " поёт чудесную мелодию: " + getNameSkill());
                    workingChooseSkill = false;
                    break;
                case "2":
                    System.out.println(user.getName() + " поёт прелестную мелодию: " + getNameSkill());
                    workingChooseSkill = false;
                    break;
                case "3":
                    System.out.println(user.getName() + " поёт замечательную мелодию: " + getNameSkill());
                    workingChooseSkill = false;
                    break;
                default:
                    System.out.println("Такого умения не существует, повторите выбор");
            }
        }
    }

}
