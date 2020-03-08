package skills.userSkills.knightSkills;

import livingCreatures.ALivingCreatures;
import skills.ASkills;

public class Shield extends ASkills {
    public Shield(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public Shield() {
        super("Щит", 5, 0.84f);//защиает на 1 ход
    }

    @Override
    public void cast(ALivingCreatures user, ALivingCreatures enemy) {
        System.out.println(user.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy() && Math.random() > enemy.getAgility()) {
            System.out.print("Умение защищает на "
                    + getDamage() + " на следующий ход");
            user.setProtection(user.getProtection() + 1);
        } else System.out.println(user.getName() + " не успел поднять щит");
    }
}
