import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Q1{
public static void main(String[] args){

// the first way
String s = "if you are not doing what you love , you are wasting your time";
String[] words = s.split(" ");
int wordCount = 0;
for (int i=0; i < words.length; i++){
    if (words[i].equals(args[0])){
        wordCount++;
     }
}
System.out.println(wordCount);


}
}
