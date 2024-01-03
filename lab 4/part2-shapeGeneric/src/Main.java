//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle());
        rectangles.add(new Rectangle());

        // Create an ArrayList of Circle
        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle());
        circles.add(new Circle());


        // Test the generic method with both ArrayLists
        System.out.println("Drawing Rectangles:");
        ShapeTest.drawShapes(rectangles);

        System.out.println("\nDrawing Circles:");
        ShapeTest.drawShapes(circles);
    }
}