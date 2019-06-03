public class InvalidInputException extends Exception {

    String msg;
    public InvalidInputException(String msg){
        super(msg);
        this.msg=msg;
    }
}
