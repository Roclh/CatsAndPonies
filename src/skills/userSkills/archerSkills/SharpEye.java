package skills.userSkills.archerSkills;

import livingCreatures.ALivingCreatures;
import skills.ASkills;

public class SharpEye extends ASkills {
    public SharpEye(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public SharpEye() {
        super("Острый взгляд", 4, 0.85f);//повышает точность следующего умения на damage
    }

    @Override
    public void cast(ALivingCreatures user, ALivingCreatures enemy) {
        System.out.println(user.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy() && Math.random() > enemy.getAgility()) {
            System.out.println("Умение повышает точность следующего умения на "
                    + (getDamage()));
        } else System.out.println("Взгляд " + user.getName() + " замылился");
    }
}
