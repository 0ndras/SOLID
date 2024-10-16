package good;

import bad.BadRectangle;
import bad.BadSquare;

public class GoodGraphicsService {
    public void checkForArea(Shape shape) {
        /*int height = 20;
        int width = 5;
        rectangle.setHeight(height);
        rectangle.setWidth(width);*/

        if (shape instanceof GoodRectangle) {
            System.out.println("Great rectangle you got there!");
            //verify(rectangle, width, width, "Square");
        } else if (shape instanceof GoodSquare){
            System.out.println("Great square you got there!");
            //verify(rectangle, width, height, "Rectangle");
        }
    }

    /*private void verify(BadRectangle rectangle, int width, int height, String entity) {
        if (rectangle.getArea() == (width * height)) {
            System.out.println("Great " + entity + " you got there!");
        } else {
            System.out.println("Well, not a " + entity + ".");
        }
    }*/
}
