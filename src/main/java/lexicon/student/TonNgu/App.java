package lexicon.student.TonNgu;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //testing NameRepository functions
      String[] newNames = {"Test Name1","Test Name2", "Test Name3", "Test Name4", "Test Name5" };
        NameRepository.setNames(newNames); //store names from newNames array

        /*String findTestResult = NameRepository.find("Test Name5"); //check if the name here is already stored
        if (findTestResult != null) {
            System.out.println("Name found");
        } else {
            System.out.println("Name not found");
        }*/

        if (NameRepository.add("Test Name6") == false){
        System.out.println("Name already added");
        }
        else{
            System.out.println("New name added");
        }

        String[] allStoredNames = NameRepository.findAll();
        for (String abc : allStoredNames) { //print all stored names
            System.out.println(abc);
        }

    }

}
