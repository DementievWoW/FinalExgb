package Person;

import java.util.Date;

public class Person {

   private String firstName;
    private String lastName;
    private String middleName;
    private String dateBorn;
    private int phoneNumber;
    private Gender gender;


    public Person(String firstName, String lastName, String middleName, int phoneNumber, Gender gender, String dateBorn ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.dateBorn = dateBorn;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }
    public String getDateBorn() {
        return dateBorn;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }
}
