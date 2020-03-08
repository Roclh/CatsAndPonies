package livingCreatures;

import enums.Locations;
import enums.Race;
import enums.Rarity;
import enums.Type;
import exceptions.EmptyStringException;
import skills.ASkills;

import java.util.EmptyStackException;

public class ALivingCreatures implements Comparable<ALivingCreatures>{
    private String name;
    private float health;
    private float remainingHealth;
    private float strength;
    private float protection;
    private float agility;

    private Locations locations;

    private ASkills skill1;
    private ASkills skill2;
    private ASkills skill3;
    private ASkills skill4;
    private ASkills skill5;

    private String id;
    private Rarity rarity;

    public ALivingCreatures(String name, float health, float strength, float protection, float agility) {
        this.name = name;
        this.health = health;
        this.remainingHealth = this.health;
        this.strength = strength;
        this.protection = protection;
        this.agility = agility;
        this.locations = Locations.ROAD;
    }

    public ALivingCreatures(ALivingCreatures copy) {
        this.name = copy.getName();
        this.health = copy.getHealth();
        this.remainingHealth = copy.getRemainingHealth();
        this.strength = copy.getStrength();
        this.protection = copy.getProtection();
        this.locations = copy.locations;
        this.agility = copy.getAgility();
        this.skill1 = copy.getSkill1();
        this.skill2 = copy.getSkill2();
        this.skill3 = copy.getSkill3();
        this.skill4 = copy.getSkill4();
        this.skill5 = copy.getSkill5();
    }

    public void chooseSkill(ALivingCreatures user) {

    }

    public void chooseSkillUser(ALivingCreatures user, int choose) {

    }

    public float getRemainingHealth() {
        return remainingHealth;
    }

    public void setRemainingHealth(float remainingHealth) {
        this.remainingHealth = remainingHealth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws EmptyStringException{
        name = name.trim();
        if(name.equals("")) {
            System.out.println("Строка не может быть пустой");
            throw new EmptyStringException();
        }
        if(name.contains(" ")){
            System.out.println("В имени не может быть пробелов");
            throw new EmptyStringException();
        }
        this.name = name;
    }

    public float getHealth() {
        return health;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public float getStrength() {
        return strength;
    }

    public void setStrength(float strength) {
        this.strength = strength;
    }

    public float getProtection() {
        return protection;
    }

    public void setProtection(float protection) {
        this.protection = protection;
    }

    public float getAgility() {
        return agility;
    }

    public void setAgility(float agility) {
        this.agility = agility;
    }

    public Locations getLocations() {
        return locations;
    }

    public void setLocations(Locations locations) {
        this.locations = locations;
    }

    public ASkills getSkill1() {
        return skill1;
    }

    public void setSkill1(ASkills skill1) {
        this.skill1 = skill1;
    }

    public ASkills getSkill2() {
        return skill2;
    }

    public void setSkill2(ASkills skill2) {
        this.skill2 = skill2;
    }

    public ASkills getSkill3() {
        return skill3;
    }

    public void setSkill3(ASkills skill3) {
        this.skill3 = skill3;
    }

    public ASkills getSkill4() {
        return skill4;
    }

    public void setSkill4(ASkills skill4) {
        this.skill4 = skill4;
    }

    public ASkills getSkill5() {
        return skill5;
    }

    public void setSkill5(ASkills skill5) {
        this.skill5 = skill5;
    }

    @Override
    public int compareTo(ALivingCreatures livingCreature) {
        return 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }
}
