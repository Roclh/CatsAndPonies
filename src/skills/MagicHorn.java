package skills;

import livingCreatures.ALivingCreatures;

public class MagicHorn extends ASkills{
    public MagicHorn(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public MagicHorn() {
        super("Магичекий рог", 7, 0.67f);
    }//кровотечение

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        System.out.println(enemy.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy() && Math.random() > user.getAgility()) {
            System.out.print("Атака врага " + enemy.getName() + " наносит "
                    + (enemy.getStrength() + getDamage() - user.getProtection()) + " урона, протыкая рогом вашу");
            switch ((int)(Math.floor(Math.random()*5))){
                case 0: System.out.println(" руку");
                    break;
                case 1: System.out.println(" ногу");
                    break;
                case 2: System.out.println(" пятку");
                    break;
                case 3: System.out.println(" шею");
                    break;
                case 4: System.out.println(" ладонь");
                    break;
                default: System.out.println("ОШИБКА С ВЫБОРОМ МЕСТА ПРОТЫКАНИЯ");
                    break;
            }
            user.setRemainingHealth(user.getRemainingHealth() - (enemy.getStrength() + getDamage() - user.getProtection()));
        }
        else System.out.println(enemy.getName() + " не попал");
    }
}
