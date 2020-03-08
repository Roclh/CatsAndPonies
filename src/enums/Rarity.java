package enums;

public enum Rarity {
    COMMON, UNCOMMON, RARE, LEGENDARY; //Обычный, необычный, редкий, легендарный


    public static Rarity randomRare(){
        double rand = Math.random();
        if(rand < 0.55d) return COMMON;
        else if(rand < 0.90d) return UNCOMMON;
        else return RARE;

    }
}
