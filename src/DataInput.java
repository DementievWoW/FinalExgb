import Exeption.DataInputEx;

import java.util.Scanner;

public class DataInput {
    public String[] enterData() throws DataInputEx {
        Scanner iScanner = new Scanner(System.in);
            System.out.println("Введите строку через ПРОБЕЛ (строка должна содержать Ф.И.О, дату рождения - dd.mm.yyyy, номер телефона - цифры, пол - f/m ) : ");
            String data = iScanner.nextLine();
            String[] arrayData = data.split(" ");

        if (arrayData.length != 6) {
            if(arrayData.length < 6){
                throw new DataInputEx("Ex: Data < 6, она равна: ", arrayData.length );
            }
            else{
                throw new DataInputEx("Ex: Data > 6, она равна: ", arrayData.length );
            }
        } else {
        return arrayData;
        }


    }
}