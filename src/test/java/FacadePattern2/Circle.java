package FacadePattern2;

public class Circle implements Shape {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    public Circle() {

    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void draw() {
        System.out.println("hinh tron ne");
    }

    public void area() {
        double result = Math.PI * 2 * r;
        System.out.println("chu vi hinh tron: " + result);
    }

    public void showInfo() {
        System.out.println("ban vua nhap ban kinh la: " + r);
    }
}
