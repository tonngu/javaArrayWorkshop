package lexicon.student.TonNgu;

import java.util.Arrays;

public class NameRepository {
    private static String[] names = new String[0];

    public static int getSize() { //return array names size
        return names.length;
    }

    public static void setNames(String[] enterNames) { //send in a new array to replace current names array's content
        names = Arrays.copyOf(enterNames, enterNames.length);
    }

    public static void clear() { //clear the content of current names array
        names = new String[0];
    }

    public static String[] findAll() { //return the content of current names array in a new array newNames
        String[] newNames = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            newNames[i] = names[i];
        }
        return newNames;
    }

    public static String find(final String fullName) {
        for (String check : names) {
            if (check != null && check.equals(fullName)) {
                return check;
            }
        }
        return null;
    }

    public static boolean add(final String fullName) {
        return true;
    }
}
