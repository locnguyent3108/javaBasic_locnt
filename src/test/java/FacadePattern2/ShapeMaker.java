package FacadePattern2;

//Facade
public class ShapeMaker {
    private Shape circle;
    private Shape reactangle;
    private Shape square;

    public ShapeMaker() {
    }

    public void createCircle(int r) {
        circle = new Circle(r);
        circle.showInfo();
        circle.draw();
        circle.area();
    }

    public void createRectangle(int l, int d) {
        reactangle = new Rectangle(l,d);
        reactangle.showInfo();
        reactangle.draw();
        reactangle.area();
    }

    public void createSquare(int d) {
        square = new Square(d);
        square.showInfo();
        square.draw();
        square.area();
    }

}
