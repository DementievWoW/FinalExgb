import Exeption.DataInputEx;
import Exeption.PersonEx;
import Util.FileHandler;

public class Main {
    public static void main(String[] args){
        while (true){
            DataInput dataInput = new DataInput();

            try {
                DataParser dataParser = new DataParser();
                FileHandler fileHandler = new FileHandler();
                fileHandler.WritePerson( dataParser.ParsingData(dataInput.enterData()));
                System.out.println("Данные записаны");
            }
            catch (DataInputEx | PersonEx ex){
                System.out.println(ex);
            }
        }

    }
}