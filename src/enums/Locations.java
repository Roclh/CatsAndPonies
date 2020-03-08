package enums;

public enum Locations {
    PONYVILLE, ROAD, MEWT, FOREST, RAINBOWPARK, WATERFALL, CAVE;

    public static String getRusLocations(Locations locations) {
        switch (locations) {
            case PONYVILLE:
                return "Понивилль";
            case ROAD:
                return "Дорога";
            case MEWT:
                return "Мьют";
            case FOREST:
                return "Лес";
            case RAINBOWPARK:
                return "Радужный парк";
            case WATERFALL:
                return "Водопад";
            case CAVE:
                return "Пещера";
            default:
                return "ОШИБКА В ТРАНСЛИТЕ";
        }
    }

    public static String getRusLocations(int locations) {
        switch (locations) {
            case 1:
                return "Понивилль";
            case 2:
                return "Дорога";
            case 3:
                return "Мьют";
            case 4:
                return "Лес";
            case 5:
                return "Радужный парк";
            case 6:
                return "Водопад";
            case 7:
                return "Пещера";
            default:
                return "ОШИБКА В ТРАНСЛИТЕ В ENUMS ЛОКАЦИИ";
        }
    }

    public static Locations getLocationsByNum(int num) {
        switch (num) {
            case 1:
                return PONYVILLE;
            case 2:
                return ROAD;
            case 3:
                return MEWT;
            case 4:
                return FOREST;
            case 5:
                return RAINBOWPARK;
            case 6:
                return WATERFALL;
            case 7:
                return CAVE;
            default:
                System.out.println("У ВАС ТОПИРЬ ТУТ NULL");
                return null;
        }
    }
}
