import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Q2{
public static void main(String[] args){
//second way
String s = "if you are not doing what you love , you are wasting your time";
int index = s.indexOf(args[0]);
int count = 0;
        // Iterate through the sentence and find occurrences
        while (index != -1) {
            count++;
            // Move to the next occurrence, starting from the end of the previous one
            index = s.indexOf(args[0], index + 1);
        }
        
System.out.println(count);


}
}
