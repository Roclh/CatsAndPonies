package skills;

import livingCreatures.ALivingCreatures;

public class AnnoyingMelody extends ASkills{
    public AnnoyingMelody(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public AnnoyingMelody() {
        super("Заедающая мелодия", 7, 0.77f);
    }

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        System.out.println(enemy.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy() && Math.random() > user.getAgility()) {
            System.out.println("Атака врага " + enemy.getName() + " игнорирует броню и наносит "
                    + (enemy.getStrength() + getDamage()) + " урона");
            user.setRemainingHealth(user.getRemainingHealth() - (enemy.getStrength() + getDamage()));
        }
        else System.out.println(enemy.getName() + " не попал");
    }
}