package lexicon.student.TonNgu;

public class NameRepository {
    private static String[] names = new String[3];

    public static int getSize() { //return array names size
        return names.length;
    }

    public static void setNames(String[] names) { //send in a new array to replace current names array's content
        for (int i = 0; i < 3; i++) {
            NameRepository.names[i] = names[i];
        }
    }

    public static void clear() { //clear the content of current names array
        names = new String[names.length];
    }

    public static String[] findAll() { //return the content of current names array in a new array newNames
        String[] newNames = new String[3];
        for (int i = 0; i < 3; i++) {
            newNames[i] = names[i];
        }
        return newNames;
    }
}
