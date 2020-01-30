package FacadePattern2;

public class Square implements Shape {
    private int d;

    public Square(int d) {
        this.d = d;
    }

    public Square() {

    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public void draw() {
        System.out.println("ve hinh vuong ne");
    }

    public void area() {
        System.out.println(" chu vi hinh vuong: " + d * 4);
    }

    public void showInfo() {
        System.out.println(" ban vua nhap chieu dai canh la: " + d);
    }
}
