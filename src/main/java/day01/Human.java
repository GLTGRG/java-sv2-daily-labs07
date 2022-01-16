package day01;

import java.time.LocalDate;

public class Human {

    private String name;
    private int yearOfBirth;

    public Human(String name, int yearOfBirth){
        if (isYearOfBirthValid(yearOfBirth) && isNameValid(name)){
            this.name = name;
            this.yearOfBirth = yearOfBirth;
        }
    }

    public boolean isYearOfBirthValid(int yearOfBirth){
        if (LocalDate.now().getYear()-yearOfBirth>=120){
            throw new IllegalArgumentException("Invalid Year");
        }
        return true;
    }

    public boolean isNameValid(String name){
        if(!(name != null && name.indexOf(" ") > 0)){
            throw new IllegalArgumentException("name is invalid");
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
