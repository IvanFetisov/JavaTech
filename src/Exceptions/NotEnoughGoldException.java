package Exceptions;

public class NotEnoughGoldException extends Exception {
    public NotEnoughGoldException(String errorMessage){
        super(errorMessage);
    }

}
