import enums.Locations;
import livingCreatures.User;

import java.util.Scanner;

public class Location {
    public static void ChangeLocation(User user) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вы находитесь в локации " + Locations.getRusLocations(user.getLocations()));
        boolean workingLocation = true;
        while (workingLocation) {
            if (user.getLocations() == Locations.RAINBOWPARK) {
                System.out.println("Выберите локацию, в которую хотели бы переместиться\n1.Понивиль\n2.Дорога\n3.Мьют\n" +
                        "4.Лес\n5.Водопад\n6.Назад");
                int bufLocation = sc.nextInt();
                if (bufLocation >= 1 && bufLocation <= 4) {
                    System.out.println("*перемещение в локацию " + Locations.getRusLocations(bufLocation) + "*");
                    TimeLocation();
                    System.out.println("Вы в локации " + Locations.getRusLocations(bufLocation));
                    user.setLocations(Locations.getLocationsByNum(bufLocation));
                    workingLocation = false;
                } else if (bufLocation == 5) {
                    bufLocation++;
                    System.out.println("*перемещение в локацию " + Locations.getRusLocations(bufLocation) + "*");
                    TimeLocation();
                    System.out.println("Вы в локации " + Locations.getRusLocations(bufLocation));
                    user.setLocations(Locations.getLocationsByNum(bufLocation));
                    workingLocation = false;
                } else if (bufLocation == 6) {
                    workingLocation = false;
                } else System.out.println("Отсутствует такой вариант ответа. Повторите попытку");
            } else if (user.getLocations() == Locations.PONYVILLE) {
                System.out.println("Выберите локацию, в которую хотели бы переместиться\n1.Дорога\n2.Мьют\n" +
                        "3.Лес\n4.Радужный парк\n5.Водопад\n6.Назад");
                int bufLocation = sc.nextInt();
                if (bufLocation >= 1 && bufLocation <= 5) {
                    bufLocation++;
                    System.out.println("*перемещение в локацию " + Locations.getRusLocations(bufLocation) + "*");
                    TimeLocation();
                    System.out.println("Вы в локации " + Locations.getRusLocations(bufLocation));
                    user.setLocations(Locations.getLocationsByNum(bufLocation));
                    workingLocation = false;
                } else if (bufLocation == 6) {
                    workingLocation = false;
                } else System.out.println("Отсутствует такой вариант ответа. Повторите попытку");
            } else if (user.getLocations() == Locations.ROAD) {
                System.out.println("Выберите локацию, в которую хотели бы переместиться\n1.Понивиль\n2.Мьют\n" +
                        "3.Лес\n4.Радужный парк\n5.Водопад\n6.Назад");
                int bufLocation = sc.nextInt();
                if (bufLocation >= 2 && bufLocation <= 5) {
                    bufLocation++;
                    System.out.println("*перемещение в локацию " + Locations.getRusLocations(bufLocation) + "*");
                    TimeLocation();
                    System.out.println("Вы в локации " + Locations.getRusLocations(bufLocation));
                    user.setLocations(Locations.getLocationsByNum(bufLocation));
                    workingLocation = false;
                } else if (bufLocation == 1) {
                    System.out.println("*перемещение в локацию " + Locations.getRusLocations(bufLocation) + "*");
                    TimeLocation();
                    System.out.println("Вы в локации " + Locations.getRusLocations(bufLocation));
                    user.setLocations(Locations.getLocationsByNum(bufLocation));
                    workingLocation = false;
                } else if (bufLocation == 6) {
                    workingLocation = false;
                } else System.out.println("Отсутствует такой вариант ответа. Повторите попытку");
            } else if (user.getLocations() == Locations.MEWT) {
                System.out.println("Выберите локацию, в которую хотели бы переместиться\n1.Понивиль\n2.Дорога\n" +
                        "3.Лес\n4.Радужный парк\n5.Водопад\n6.Назад");
                int bufLocation = sc.nextInt();
                if (bufLocation >= 3 && bufLocation <= 5) {
                    bufLocation++;
                    System.out.println("*перемещение в локацию " + Locations.getRusLocations(bufLocation) + "*");
                    TimeLocation();
                    System.out.println("Вы в локации " + Locations.getRusLocations(bufLocation));
                    user.setLocations(Locations.getLocationsByNum(bufLocation));
                    workingLocation = false;
                } else if (bufLocation == 1 || bufLocation == 2) {
                    System.out.println("*перемещение в локацию " + Locations.getRusLocations(bufLocation) + "*");
                    TimeLocation();
                    System.out.println("Вы в локации " + Locations.getRusLocations(bufLocation));
                    user.setLocations(Locations.getLocationsByNum(bufLocation));
                    workingLocation = false;
                } else if (bufLocation == 6) {
                    workingLocation = false;
                } else System.out.println("Отсутствует такой вариант ответа. Повторите попытку");
            } else if (user.getLocations() == Locations.FOREST) {
                System.out.println("Выберите локацию, в которую хотели бы переместиться\n1.Понивиль\n2.Дорога\n" +
                        "3.Мьют\n4.Радужный парк\n5.Водопад\n6.Назад");
                int bufLocation = sc.nextInt();
                if (bufLocation == 4 || bufLocation == 5) {
                    bufLocation++;
                    System.out.println("*перемещение в локацию " + Locations.getRusLocations(bufLocation) + "*");
                    TimeLocation();
                    System.out.println("Вы в локации " + Locations.getRusLocations(bufLocation));
                    user.setLocations(Locations.getLocationsByNum(bufLocation));
                    workingLocation = false;
                } else if (bufLocation >= 1 && bufLocation <= 3) {
                    System.out.println("*перемещение в локацию " + Locations.getRusLocations(bufLocation) + "*");
                    TimeLocation();
                    System.out.println("Вы в локации " + Locations.getRusLocations(bufLocation));
                    user.setLocations(Locations.getLocationsByNum(bufLocation));
                    workingLocation = false;
                } else if (bufLocation == 6) {
                    workingLocation = false;
                } else System.out.println("Отсутствует такой вариант ответа. Повторите попытку");
            } else if (user.getLocations() == Locations.WATERFALL) {
                System.out.println("Выберите локацию, в которую хотели бы переместиться\n1.Понивиль\n2.Дорога\n" +
                        "3.Мьют\n4.Лес\n5.Радужный парк\n6.Назад");
                int bufLocation = sc.nextInt();
                if (bufLocation >= 1 && bufLocation <= 5) {
                    System.out.println("*перемещение в локацию " + Locations.getRusLocations(bufLocation) + "*");
                    TimeLocation();
                    System.out.println("Вы в локации " + Locations.getRusLocations(bufLocation));
                    user.setLocations(Locations.getLocationsByNum(bufLocation));
                    workingLocation = false;
                } else if (bufLocation == 6) {
                    workingLocation = false;
                } else System.out.println("Отсутствует такой вариант ответа. Повторите попытку");
            }
        }
    }

    public static void TimeLocation(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print(".");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print(".");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print(".\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
