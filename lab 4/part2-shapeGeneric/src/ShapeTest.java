import java.util.List;
public class ShapeTest {
    public static void drawShapes(List<? extends Shape> shapes) {
        for (Shape shape : shapes) {
            shape.Draw();
        }
    }
}
