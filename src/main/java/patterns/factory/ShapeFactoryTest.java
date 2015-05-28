package patterns.factory;

/**
 * Created by student on 5/28/2015.
 */
public class ShapeFactoryTest {
    public static void main(String[] args) {
        final Shape shape = ShapeFactory.getShape(ShapeType.TRIANGLE);

        shape.drawShape();
    }
}
