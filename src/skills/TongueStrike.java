package skills;

import livingCreatures.ALivingCreatures;

public class TongueStrike extends ASkills{
    public TongueStrike(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public TongueStrike() {
        super("Удар языком", 3, 0.93f);
    }

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        System.out.print(enemy.getName() + " использует умение " + getNameSkill() + " в");
        switch ((int)(Math.floor(Math.random()*5))) {
            case 0:  System.out.println(" нос");
                break;
            case 1: System.out.println(" глаз");
                break;
            case 2: System.out.println(" ухо");
                break;
            case 3: System.out.println(" шею");
                break;
            case 4: System.out.println(" пяточку");
                break;
            default: System.out.println("ОШИБКА С ВЫБОРОМ МЕСТА ПОПАДАНИЯ ЯЗЫКА");
                break;
        }

        if (Math.random() <= this.getAccuracy() && Math.random() > user.getAgility()) {
            System.out.println("Атака врага " + enemy.getName() + " наносит "
                    + (enemy.getStrength() + getDamage()) + " урона, игнорируя броню");
            user.setRemainingHealth(user.getRemainingHealth() - (enemy.getStrength() + getDamage()));
        }
        else System.out.println(enemy.getName() + " не попал");
    }
}
