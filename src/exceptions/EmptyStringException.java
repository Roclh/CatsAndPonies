package exceptions;

public class EmptyStringException extends Exception{
    String errMes = "Пустая строка";

    public void printMessage(){
        System.out.println(errMes);
    }
}
