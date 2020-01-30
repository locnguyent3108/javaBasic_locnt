package FacadePattern2;

public class Rectangle implements Shape {
    private int l;
    private int h;

    public Rectangle(int l, int h) {
        this.l = l;
        this.h = h;
    }

    public Rectangle() {

    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void draw() {
        System.out.println("ve hinh chu nhat");
    }

    public void area() {
        double result = (l + h) * 2;
        System.out.println("chu vi hinh chu nhat la: " + result);
    }

    public void showInfo() {
        System.out.println("ban vua nhap chieu dai la: " + l + " chieu rong la: " + h);
    }
}
