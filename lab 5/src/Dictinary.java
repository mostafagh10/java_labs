import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dictinary {
    Map<Character, ArrayList<String>> map1 = new HashMap<>();

    public Dictinary(Map<Character, ArrayList<String>> map1) {
        this.map1 = map1;
    }

    public static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
    public static void printDIctionary(Map map2){
        map2.forEach((k, v) ->{
            System.out.println("key=" + k + ", value=" + v);
        });
    }

    public static void getword(Map map2,char s){
        map2.forEach((k, v) ->{
            if((char)k == s) {
                System.out.println("key=" + k + ", value=" + v);
            }
        });
    }

    public static void addStringToMapList(Map<Character, ArrayList<String>> map, char key, String... newStrings) {
        ArrayList<String> existingList = map.getOrDefault(key, new ArrayList<>());

        for (String newString : newStrings) {
            if (!existingList.contains(capitalizeFirstLetter(newString))) {
                existingList.add(capitalizeFirstLetter(newString));
            }
        }
        map.put(key, existingList);
    }

    public static void removeStringFromMapList(Map<Character, ArrayList<String>> map, char key, String removingString) {
        ArrayList<String> existingList = map.getOrDefault(key, new ArrayList<>());
        existingList.removeIf(str -> str.equalsIgnoreCase(removingString));
        map.put(key, existingList);
    }

    public static boolean stringExistsInMapList(Map<Character, ArrayList<String>> map, char key, String stringToCheck) {
        ArrayList<String> existingList = map.get(key);
        for (String newString : existingList) {
            if (existingList.contains(capitalizeFirstLetter(stringToCheck))) {
                return true;
            }
        }
        return false;
    }
}
