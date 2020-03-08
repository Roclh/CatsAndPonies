package skills;

import livingCreatures.ALivingCreatures;

public class HitWithBagOfMoney extends ASkills{
    public HitWithBagOfMoney(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public HitWithBagOfMoney() {
        super("Удар мешком с деньгами", 4, 0.47f);
    }//добавляет деньги

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        System.out.println(enemy.getName() + " использует умение " + getNameSkill());

        if (Math.random() <= this.getAccuracy() && Math.random() > user.getAgility()) {
            System.out.println("Атака врага " + enemy.getName() + " наносит "
                    + (enemy.getStrength() + getDamage() - user.getProtection()) + " урона");
            user.setRemainingHealth(user.getRemainingHealth() - (enemy.getStrength() + getDamage() - user.getProtection()));
            if (Math.random() < 0.5) {
                System.out.println(enemy.getName() + " выронял из своего мешка " + getDamage() + " монет. Вы стали богаче");
                //добавление монет
            }
        }
        else System.out.println(enemy.getName() + " не попал");
    }
}
