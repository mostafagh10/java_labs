import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        List<ArrayList<String>> allWordsLists = new ArrayList<>();
        allWordsLists.add(new ArrayList<>(Arrays.asList("Apple", "Adventure", "Atmosphere", "Acoustic", "Alligator", "Amethyst", "Avocado", "Astonish", "Astronomy", "Abundant")));
        allWordsLists.add(new ArrayList<>(Arrays.asList("Banana", "Brave", "Breeze", "Bubble", "Blossom", "Balloon", "Beacon", "Ballet", "Bonsai", "Blissful")));
        allWordsLists.add(new ArrayList<>(Arrays.asList("Cactus", "Cascade", "Crisp", "Calm", "Charm", "Celestial", "Cello", "Cerulean", "Cherish", "Cinnamon")));
        allWordsLists.add(new ArrayList<>(Arrays.asList("Dazzle", "Delight", "Dolphin", "Dream", "Dewdrop", "Diamond", "Dusk", "Divine", "Dainty", "Dragonfly")));
        allWordsLists.add(new ArrayList<>(Arrays.asList("Eagle", "Eclipse", "Elegant", "Enchant", "Emerald", "Endless", "Essence", "Evergreen", "Exquisite", "Ephemeral")));
        allWordsLists.add(new ArrayList<>(Arrays.asList("Fairy", "Flame", "Fiesta", "Frost", "Floral", "Firefly", "Fascinate", "Fable", "Feather", "Flicker")));
        allWordsLists.add(new ArrayList<>(Arrays.asList("Gazebo", "Glimmer", "Grace", "Gentle", "Galaxy", "Glisten", "Garnet", "Gentleman", "Giggly", "Glitter")));
        allWordsLists.add(new ArrayList<>(Arrays.asList("Harmony", "Heavenly", "Honey", "Harbor", "Hope", "Heartfelt", "Halcyon", "Haven", "Halo", "Hyacinth")));
        allWordsLists.add(new ArrayList<>(Arrays.asList("Imagine", "Infinite", "Inspire", "Ivory", "Island", "Illuminate", "Impulse", "Incandescent", "Ingenious", "Ineffable")));
        allWordsLists.add(new ArrayList<>(Arrays.asList("Jubilant", "Jade", "Journey", "Joyful", "Jazz", "Jasmine", "Jovial", "Jigsaw", "Jubilee", "Jocular")));
        allWordsLists.add(new ArrayList<>(Arrays.asList("Kaleidoscope", "Kindle", "Kinetic", "Keen", "Kismet", "Kale", "Kudos", "Kiss", "Kittens", "Knight")));
        allWordsLists.add(new ArrayList<>(Arrays.asList("Lagoon", "Luminous", "Lullaby", "Lavender", "Lively", "Lunar", "Luscious", "Lyric", "Labyrinth", "Lilac")));
        allWordsLists.add(new ArrayList<>(Arrays.asList("Majestic", "Mystic", "Moonlight", "Melody", "Mirth", "Magenta", "Mosaic", "Mellow", "Miracle", "Majesty")));
        allWordsLists.add(new ArrayList<>(Arrays.asList("Nebula", "Nectar", "Nirvana", "Noble", "Nurturing", "Nautical", "Novel", "Nuance", "Nebulous", "Nestle")));
        allWordsLists.add(new ArrayList<>(Arrays.asList("Orchid", "Opulent", "Oasis", "Oceanic", "Optimistic", "Ornate", "Outstanding", "Overcome", "Overjoyed", "Onyx")));
        allWordsLists.add(new ArrayList<>(Arrays.asList("Peach", "Pristine", "Petal", "Panorama", "Pleasure", "Ponder", "Panache", "Peaceful", "Perfume", "Pinnacle")));
        allWordsLists.add(new ArrayList<>(Arrays.asList("Quasar", "Quaint", "Quell", "Quest", "Quiver", "Quintessence", "Quirky", "Quiet", "Quintessential", "Quench")));
        allWordsLists.add(new ArrayList<>(Arrays.asList("Radiant", "Reverie", "Ripple", "Rustic", "Rendezvous", "Rhapsody", "Resplendent", "Rejoice", "Rose", "Rapture")));
        allWordsLists.add(new ArrayList<>(Arrays.asList("Serene", "Sapphire", "Serenade", "Symphony", "Sparkle", "Stellar", "Sublime", "Savor", "Sculpt", "Sylvan")));
        allWordsLists.add(new ArrayList<>(Arrays.asList("Tranquil", "Twilight", "Tender", "Tropical", "Talisman", "Tidal", "Traverse", "Timeless", "Tintinnabulation", "Treasure")));
        allWordsLists.add(new ArrayList<>(Arrays.asList("Umbra", "Utopia", "Unwind", "Uplift", "Utter", "Umbrella", "Unique", "Upbeat", "Universe", "Unity")));
        allWordsLists.add(new ArrayList<>(Arrays.asList("Velvet", "Vivid", "Vibrant", "Vanilla", "Valiant", "Vortex", "Verdant", "Verve", "Voyage", "Virtue")));
        allWordsLists.add(new ArrayList<>(Arrays.asList("Whisper", "Wander", "Wisp", "Willow", "Wavelength", "Wondrous", "Wishful", "Waltz", "Wonder", "Wildflower")));
        allWordsLists.add(new ArrayList<>(Arrays.asList("Xanadu", "Xylophone", "Xenon", "Xeric", "X-factor", "Xenial", "Xenophobe", "Xanthein", "Xenagogue", "Xerox")));
        allWordsLists.add(new ArrayList<>(Arrays.asList("Yearning", "Yonder", "Yoga", "Yummy", "Yield", "Yarn", "Yonder", "Yaffle", "Yoga", "Yonder")));
        allWordsLists.add(new ArrayList<>(Arrays.asList("Zephyr", "Zenith", "Zeal", "Zest", "Zing", "Zircon", "Zestful", "Zen", "Zeppelin", "Zany")));
        // Add words to the list associated with the key
        char[] arr1 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p'
        ,'q','r','s','t','u','v','w','x','y','z'};


        Map<Character, ArrayList<String>> map1 = new HashMap<>();
        for(int i=0 ; i<26 ; i++) {
            map1.put(arr1[i], allWordsLists.get(i));
        }

        int i=0;
        while(i==0){
            System.out.println("for print all dictionary : enter 1");
            System.out.println("for print specific dictionary : enter 2");
            System.out.println("for adding words in specific dictionary : enter 3");
            System.out.println("for removing word from specific dictionary : enter 4");
            System.out.println("for searching word in specific dictionary : enter 5");
            System.out.println("for exit the program : enter 6");

            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter the choice number");
            int numofchoice = myObj.nextInt();
            if(numofchoice == 1){
                printDIctionary(map1);
            }else if(numofchoice == 2){
                Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Enter the key you want to print its list");
                char thekey = myObj2.next().charAt(0);
                getword(map1,thekey);
            }else if(numofchoice == 3){
                Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Enter the key you want to add in it");
                char thekey = myObj2.next().charAt(0);
                Scanner myObj3 = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Enter the number of strings you want to insert");
                int j = myObj3.nextInt();
                String[] thestringsarray=new String[j];
                for(int k=0;k<j ; k++) {
                    Scanner myObj4 = new Scanner(System.in);  // Create a Scanner object
                    System.out.println("Enter the string you want to insert");
                    String thestring = myObj4.nextLine();
                    thestringsarray[k] = thestring;
                }
                addStringToMapList(map1, thekey, thestringsarray);
            } else if (numofchoice == 4) {
                Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Enter the key you want to remove from it");
                char thekey = myObj2.next().charAt(0);
                Scanner myObj3 = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Enter the string you want to remove");
                String thestring = myObj3.nextLine();
                removeStringFromMapList(map1,thekey,thestring);
            } else if (numofchoice == 5) {
                Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Enter the key you want to search in it");
                char thekey = myObj2.next().charAt(0);
                Scanner myObj3 = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Enter the string you want to search it");
                String thestring = myObj3.nextLine();
                boolean search = stringExistsInMapList(map1,thekey,thestring);
                if(search == true){
                    System.out.println("the string exists");
                }else{
                    System.out.println("the string doesn't exists");
                }
            }else{
                i = 1;
            }
        }

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