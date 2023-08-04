package Exeption;

public class DataInputEx extends Exception{

    private int size;
    public DataInputEx(String message, int size ){
        super(message);
        this.size = size;
    }
    public int getSizeArray(){return size;}
    public String getMessage() {
        return super.getMessage()+getSizeArray();
    }
}
