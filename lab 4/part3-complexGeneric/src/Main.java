//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Complex<Double> c1 = new Complex<>(3.0,5.0);
        Complex<Double> c2 = new Complex<>(7.0,8.0);
        Complex<Double> resultOfAdd = c1.add(c2);
        Complex<Double> resultOfsubtrack = c1.subtrack(c2);
        c1.printComplex();
        c2.printComplex();
        resultOfAdd.printComplex();
        resultOfsubtrack.printComplex();



    }
}