package skills.healingSkills;

import enums.Locations;
import livingCreatures.ALivingCreatures;
import skills.ASkills;

public class ComplimentToYourself extends ASkills {
    public ComplimentToYourself(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public ComplimentToYourself() {
        super("Комплимент самому себе", 0, 0.4f);
    }

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        System.out.println(enemy.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy()) {
            switch ((int)Math.floor(Math.random()*5)){
                case 0: System.out.println(enemy.getName() + " говорит себе: 'У тебя классные ушки, я видел такие в журнале'");
                    break;
                case 1: System.out.print(enemy.getName() + " говорит себе: 'Ты выгодно выделяешься среди этого сброда'");
                    break;
                case 2: System.out.println(enemy.getName() + " говорит себе: 'Ты лучший в локации " + Locations.getRusLocations(enemy.getLocations()) + "'");
                    break;
                case 3: System.out.println(enemy.getName() + " говорит себе: 'У тебя самые сильные скиллы!'");
                    break;
                case 4: System.out.println(enemy.getName() + " говорит себе: 'Тебе очень идут эти глазки;)'");
                    break;
                default: System.out.println("ОШИБКА С УМЕНИЕМ КОМПЛИМЕНТ САМОМУ СЕБЕ");
                    break;
            }
            System.out.println(enemy.getName() + " восстанавливает " + (enemy.getHealth()*0.1) + " здоровья");
            if (enemy.getRemainingHealth() >= (enemy.getHealth() - enemy.getHealth()*0.1)) enemy.setRemainingHealth(enemy.getHealth());
            else enemy.setRemainingHealth(enemy.getHealth()*0.1f + enemy.getRemainingHealth());
        }
        else System.out.println(enemy.getName() + " не оценил свой же компнимент");
    }
}
