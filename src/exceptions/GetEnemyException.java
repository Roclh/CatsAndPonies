package exceptions;

public class GetEnemyException extends Exception{
    private String e = "Такого элемента коллекции не существует";

    public void printErr(){
        System.out.print(e);
    }
}
