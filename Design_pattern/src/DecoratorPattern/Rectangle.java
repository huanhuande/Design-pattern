package DecoratorPattern;

/**
 * Created by Hs on 2017/6/2.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
