package lexicon.student.TonNgu;

import javax.naming.Name;
import java.sql.SQLOutput;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //testing NameRepository functions
        String[] newNames = {"Test Name1", "Test Name2", "Test Name3", "Test Name4", "Test Name5"};
        NameRepository.setNames(newNames); //store names from newNames array

        /*String findTestResult = NameRepository.find("Test Name5"); //check if the name here is already stored
        if (findTestResult != null) {
            System.out.println("Name found");
        } else {
            System.out.println("Name not found");
        }

        if (NameRepository.add("Test Name6") == false){ //Look for the specified name in the NameRepository, if not found then it will be added.
        System.out.println("Name already added");
        }
        else{
            System.out.println("New name added");
        }

            for (String abc : NameRepository.findAll()) { //print all stored names
            System.out.println(abc);
        }

        for (String abcd : NameRepository.findByFirstName("Test")) { //look for names containing this first name and put them into an array and then prints each element out
            System.out.println(abcd);
        }*/

        for (String abcde : NameRepository.findByLastName("Name4")) { //same as above but for last names
            System.out.println(abcde);
        }
    }

}
