package skills;

import livingCreatures.ALivingCreatures;

public class CruelJoke extends ASkills{
    public CruelJoke(String nameSkill, float damage, float accuracy) {
        super(nameSkill, damage, accuracy);
    }

    public CruelJoke() {
        super("Жестокая шутка", 4, 0.6f);
    }

    @Override
    public void cast(ALivingCreatures enemy, ALivingCreatures user) {
        System.out.println(enemy.getName() + " использует умение " + getNameSkill());

            switch ((int)(Math.floor(Math.random()*5))) {
                case 0: System.out.print(enemy.getName() + " говорит: 'Такому как ты надо ставить памятники. Надгробные...'");
                    break;
                case 1: System.out.print(enemy.getName() + "говорит: 'Вы человек земли, плохо, что не самая лучшая её часть'");
                    break;
                case 2: System.out.print(enemy.getName() + "говорит: 'Как ты сюда попал? Неужели кто-то оставил клетку открытой?'");
                    break;
                case 3: System.out.print(enemy.getName() + "говорит: 'Если бы у меня было такое же лицо как и у тебя, то я подал бы в суд на своих родителей'");
                    break;
                case 4: System.out.print(enemy.getName() + "говорит: 'Ты всё ещё любишь природу, несмотря на то, что она сделала с тобой?'");
                    break;
                default: System.out.print("ОШИБКА ПРИ ВЫБОРЕ ШУТОК");
                    break;
            }
        if (Math.random() <= this.getAccuracy() && Math.random() > user.getAgility()) {
            System.out.println(" и наносит " + (enemy.getStrength() + getDamage() - user.getProtection()) + " урона");
            user.setRemainingHealth(user.getRemainingHealth() - (enemy.getStrength() + getDamage() - user.getProtection()));
        }
        else System.out.println("\nВас не задела шутка врага " + enemy.getName());
    }
}
