package FacadePattern2;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        int choice;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("welcome, please select your option: ");
            System.out.println("1. draw circle: ");
            System.out.println("2. draw rectangle: ");
            System.out.println("3. draw square:");
            choice = sc.nextInt();

            switch (choice) {
                default:
                    System.out.println("please select again");
                    continue;
                case 1:
                    System.out.println("please input r: ");
                    int r = sc.nextInt();
                    shapeMaker.createCircle(r);
                    break;
                case 2:
                    System.out.println("please input l:");
                    int l = sc.nextInt();
                    System.out.println("please input h: ");
                    int h = sc.nextInt();
                    shapeMaker.createRectangle(l,h);
                    break;
                case 3:
                    System.out.println("please input d: ");
                    int d = sc.nextInt();
                    shapeMaker.createSquare(d);
                    break;
            }
        } while (choice != 4);
    }
}
