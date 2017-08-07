package FactoryPattern;

/**
 * Created by Hs on 2017/6/2.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
