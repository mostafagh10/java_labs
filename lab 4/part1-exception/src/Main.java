//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws NewExcpetion {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcom!");
        Circle c = new Circle();
        c.setx(4);
        c.sety(-5);
        try{
            System.out.println("the division = "+c.makeDivision());
            System.out.println("the sqrt = "+c.makeSqrt());
            System.out.println("the diffrence = "+c.makeDiffrence());
        }catch (NewExcpetion e) {
            System.out.println(e.getMessage());
        }

    }
}