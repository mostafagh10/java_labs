import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Q4{
public static void main(String[] args){
//by using regular expression
String s = "if you are not doing what you love , you are wasting your time";
int count = 0;
// Escape special characters in the group of words
        String escapedWords = Pattern.quote(args[0]);

        // Create a pattern with the group of words
        Pattern pattern = Pattern.compile("\\b" + escapedWords);

        // Create a matcher for the input sentence
        Matcher matcher = pattern.matcher(s);

        // Find all occurrences of the group of words
        while (matcher.find()) {
            count++;
        }

System.out.println(count);


}
}
