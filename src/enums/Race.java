package enums;

public enum Race {
    CAT, PONY, UNICORN, PEGASUS;

    public static String getRusRace(Race race) {
        switch (race) {
            case CAT:
                return "Котик";
            case PONY:
                return "Пони";
            case UNICORN:
                return "Единорог";
            case PEGASUS:
                return "Пегас";
            default:
                return "ОШИБКА В ТРАНСЛИТЕ";
        }
    }
}
