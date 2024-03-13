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

    public static String[] findAll() { //return the content of current names array in a new array findAllResult
        return Arrays.copyOf(names, names.length);
    }

    public static String find(final String fullName) { //Find if a name exists within the currently stored names, returns null if not
        for (String check : names) {
            if (check.equals(fullName)) {
                return check;
            }
        }
        return null;
    }

    public static boolean add(final String fullName) { //Add a name and returns true if the name doesn't yet exist within currently stored names, else returns false
        if (find(fullName) == null) {
            String[] copiedArray = Arrays.copyOf(names, names.length + 1);
            copiedArray[copiedArray.length - 1] = fullName;
            names = copiedArray;
            return true;
        } else {
            return false;
        }
    }

    public static String[] findByFirstName(final String firstName) { //search through stored names by firstName, returns an array with all hit
        String[] searchResult = new String[0];
        for (String name : names) {
            if (name.startsWith(firstName)) {
                searchResult = Arrays.copyOf(searchResult, searchResult.length + 1);
                searchResult[searchResult.length - 1] = name;
            }
        }
        return searchResult;
    }

    public static String[] findByLastName(final String lastName) { //search through stored names by lastName, returns an array with all hit
        String[] searchResult = new String[0];
        for (String name : names) {
            if (name.endsWith(lastName)) {
                searchResult = Arrays.copyOf(searchResult, searchResult.length + 1);
                searchResult[searchResult.length - 1] = name;
            }
        }
        return searchResult;
    }

    public static boolean remove(final String fullName) { //Remove a specified name from the currently stored names and return a boolean statement whether or not the name was removed
        if (find(fullName) != null) {
            String[] searchResult = new String[0];

            for (String name : names) {
                if (!name.equals(fullName)) {
                    searchResult = Arrays.copyOf(searchResult, searchResult.length + 1);
                    searchResult[searchResult.length - 1] = name;
                }
            }
            names = searchResult;
            return true;
        } else {
            return false;
        }
    }

}