package lexicon.student.TonNgu;

public class App {
    public static void main(String[] args) {
        //testing NameRepository functions
        String[] newNames = {"Tony" + " " + "Nguyen", "Mehrdad" + " " + "Javan", "Simon" + " " + "Elbrink"};
        NameRepository.setNames(newNames); //store names from newNames array
        String[] allStoredNames = NameRepository.findAll();
        for (String abc : allStoredNames) { //print all stored names
            System.out.println(abc);
        }
        String findTestResult = NameRepository.find("Maria");
        if (findTestResult != null) {
            System.out.println("Name found");
        } else {
            System.out.println("Name not found");
        }
    }

}
