package enums;

public enum Type {
    ARCHER, MAGICIAN, KNIGHT, THIEF, BARD;

    public static String getRusType(Type type) {
        switch (type) {
            case ARCHER:
                return "Лучник";
            case MAGICIAN:
                return "Маг";
            case KNIGHT:
                return "Рыцарь";
            case THIEF:
                return "Вор";
            case BARD:
                return "Бард";
            default:
                return "ОШИБКА В ТРАНСЛИТЕ";
        }
    }
}
