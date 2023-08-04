package Util;

import Person.Person;

import java.io.FileWriter;
import java.io.IOException;
import java.text.MessageFormat;

public class FileHandler {
    public void WritePerson(Person person){
        try(FileWriter writer = new FileWriter(person.getLastName()+".txt", true))
        {
            // запись всей строки
            String text = String.format(
                    "LastName: %s," +
                    " MiddleName: %s," +
                    " FirstName: %s," +
                    "Дата рождения: %s" +
                    " Phone number: %d," +
                    "Gender: %s" +
                    "\n", person.getLastName(), person.getMiddleName(), person.getFirstName(),
                    person.getDateBorn(), person.getPhoneNumber(), person.getGender());
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
