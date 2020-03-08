package skills;

import livingCreatures.ALivingCreatures;

public class ASkills implements ICast{
    private String nameSkill;
    private float damage;
    private float accuracy;

    public ASkills(String nameSkill, float damage, float accuracy) {
        this.nameSkill = nameSkill;
        this.damage = damage;
        this.accuracy = accuracy;
    }

    public String getNameSkill() {
        return nameSkill;
    }

    public void setNameSkill(String nameSkill) {
        this.nameSkill = nameSkill;
    }

    public float getDamage() {
        return damage;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }

    public float getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(float accuracy) {
        this.accuracy = accuracy;
    }

    public void cast(ALivingCreatures aLivingCreature1, ALivingCreatures aLivingCreature2) {

    }
}
