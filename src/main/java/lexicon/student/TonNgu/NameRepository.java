package lexicon.student.TonNgu;

import java.util.Arrays;

public class NameRepository {
    private static String[] names = new String[3];

    public static int getSize() {
        return names.length;
    }

    public static void setNames(String[] names) {
        for (int i = 0; i < 3; i++) {
            NameRepository.names[i] = names[i];
        }
    }

    public static void clear() {
        names = new String[names.length];
    }

    public static String[] findAll() {

    }


}
