package lexicon.student.TonNgu;

import javax.naming.Name;

public class App {
    public static void main(String[] args) {
        //testing NameRepository functions
        String[] myName = {"Tony"," ", "Nguyen"};
        NameRepository.setNames(myName);
        String[] newNames =NameRepository.findAll();
        for (String name : newNames){
            System.out.println(name);
        }
    }

}
