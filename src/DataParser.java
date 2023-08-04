import Exeption.PersonEx;
import Person.Person;
import Person.Gender;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DataParser {

    public DataParser() {

    }

    public Person ParsingData(String[] array) throws PersonEx {
        String[] arrayParsed = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            if(arrayParsed[0]==null){
                if(correctName(array[i])&&correctName(array[i+1])&&correctName(array[i+2])){
                    arrayParsed[0]=array[i];
                    arrayParsed[1]=array[i+1];
                    arrayParsed[2]=array[i+2];
                    continue;
                }
            }
            if(arrayParsed[3]==null){
                if(isPhoneNumber(array[i])){
                    arrayParsed[3]=array[i];
                    continue;
                }
            }
            if(arrayParsed[4]==null){
                if(isGender(array[i])) {
                    arrayParsed[4]=array[i];
                    continue;
                }
            }
            if(arrayParsed[5]==null){
                if (isDate(array[i])) {
                    arrayParsed[5]=array[i];
                    continue;
                }
            }

        }
        return new Person(arrayParsed[0],arrayParsed[1],arrayParsed[2],Integer.parseInt(arrayParsed[3]),
                converGender(arrayParsed[4]),arrayParsed[5]);
    }
    private Gender converGender(String str){
        if(str.equals('f')){
            return Gender.Female;
        }
        else return Gender.Male;
    }
    private boolean correctName(String firstName) throws PersonEx {
        if(!firstName.matches("[A-Za-z]+")) throw new PersonEx("firstName uncorrected");
        else return true;
    }
    private boolean isPhoneNumber(String str) throws PersonEx {
        try {
            Double.parseDouble(str);
            if (!(str.length()== 10)) throw new PersonEx("Не верный формат номера телефона");
            return true;

        } catch(NumberFormatException e){
            return false;
        }
    }
    private boolean isGender(String str) throws PersonEx {
        if (str.length()==1){
            if(!str.matches("m|f")) throw new PersonEx("Gender uncorrected");
            return true;
        }else return false;
    }
    private boolean isDate(String itemStr){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        try {
            dateFormat.parse(itemStr.trim());
            return true;

        } catch (ParseException e) {
            return false;
        }

    }
}
