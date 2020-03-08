package skills;

import livingCreatures.ALivingCreatures;

public class IceStones extends ASkills{
    public IceStones(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public IceStones() {
        super("Ледяные камни", 4, 0.74f);
    }

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        System.out.println(enemy.getName() + " использует умение " + getNameSkill() + " и кидает камни в " + user.getName());

        int i = 0;
        while (i < 5){
            if (Math.random() <= this.getAccuracy() && Math.random() > user.getAgility()) {
                System.out.print(enemy.getName() + " попадает ");
                switch ((int)Math.floor(Math.random()*3)){
                    case 0: System.out.println("маленьким камнем и наносит "
                            + (enemy.getStrength() + (getDamage()/2) - user.getProtection()) + " урона");
                        user.setRemainingHealth(user.getRemainingHealth() - (enemy.getStrength() + (getDamage()/2) - user.getProtection()));
                        break;
                    case 1: System.out.println("средним камнем и наносит "
                            + (enemy.getStrength() + getDamage() - user.getProtection()) + " урона");
                        user.setRemainingHealth(user.getRemainingHealth() - (enemy.getStrength() + getDamage() - user.getProtection()));
                        break;
                    case 2: System.out.println("большим камнем и наносит "
                            + (enemy.getStrength() + (getDamage()*1.5) - user.getProtection()) + " урона");
                        user.setRemainingHealth(user.getRemainingHealth() - (enemy.getStrength() + (getDamage()*1.5f) - user.getProtection()));
                        break;
                    default:
                        break;
                }
                user.setRemainingHealth(user.getRemainingHealth() - (enemy.getStrength() + getDamage() - user.getProtection()));
            }
            else System.out.println(enemy.getName() + " не попадает камнем");
        }
    }
}
