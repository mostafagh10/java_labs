import java.util.function.Function;

class Part1{
public static void main(String[] args){

try {
            float inputValue = Float.parseFloat(args[0]);
            Function<Float, Float> func = x -> (x * 9/5) + 32;
            Float result = func.apply(inputValue);
            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            // Handle the case where the input is not a float
            System.out.println("Invalid input. Please enter a valid number.");
        }


}
}
