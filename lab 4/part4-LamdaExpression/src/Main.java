//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String str1 = "has!an";
        String str2 = "mostafa";

        String result1 = StringUtils.betterString(str1,str2,((s1,s2)->s1.length()>s2.length()));
        String result2 = StringUtils.betterString(str1,str2,((s1,s2)->true));

        System.out.println(result1);
        System.out.println(result2);

        int flag1 = 0;
        for(int i=0 ; i< str1.length() ; i++){
            if(Character.isLetter(str1.charAt(i))){
                flag1++;
            }
        }
        if(flag1 == str1.length()){
            System.out.println(str1+" is alphapet");
        }else{
            System.out.println(str1+" is not alphapet");
        }
    }
}