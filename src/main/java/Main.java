public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape ellipse = new Ellipse();
        Shape shape = new Shape();
        Shape trapezoid = new Trapezoid();
        Shape triangle = new Triangle();
        Shape quad = new Quad();

        ShapePrinter sp = new ShapePrinter();
        sp.print(circle);
        sp.print(ellipse);
        sp.print(shape);
        sp.print(trapezoid);
        sp.print(triangle);
        sp.print(quad);
    }
}
