package patterns.factory;

import java.util.HashMap;

/**
 * Created by student on 5/28/2015.
 */
public class ShapeFactory {

    private static HashMap<ShapeType, Shape> shapeMap = new HashMap();

    static  {
        shapeMap.put(ShapeType.CIRCLE, new Circle());
        shapeMap.put(ShapeType.SQUARE, new Square());
        shapeMap.put(ShapeType.TRIANGLE, new Triangle());
    };

    public static Shape getShape(ShapeType shapeType){
        if(shapeMap != null){
            return shapeMap.get(shapeType);
        } else {
            throw new IllegalStateException();
        }
    }
}
