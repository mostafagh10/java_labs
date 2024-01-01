import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Q3{
public static void main(String[] args){

//string tokenizer way
String s = "if you are not doing what you love , you are wasting your time";
int count = 0;
StringTokenizer tokeniz = new StringTokenizer(s," ");
        // Iterate through the sentence and find occurrences
        while (tokeniz.hasMoreTokens()) {
        String word = tokeniz.nextToken();
            // Ignore case by using equalsIgnoreCase
            if (word.equals(args[0])) {
                count++;
            }
        }
        
System.out.println(count);



}
}
