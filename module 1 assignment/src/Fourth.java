// Question 4:-Create an interface Shape with a method draw(). Implement this interface in two classes, Circle and Rectangle, each providing its own implementation of the draw() method.
//Demonstrate polymorphism by calling the draw() method on instances of both classes.


public class Fourth {

        public static void main(String[] args) {

            Shape circle = new Circle(5.0);
            Shape rectangle = new Rectangle(4.0, 6.0);


            System.out.println("Drawing shapes:");
            circle.draw();
            rectangle.draw();
        }
    }

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}

class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with width " + width + " and height " + height);
    }
}

