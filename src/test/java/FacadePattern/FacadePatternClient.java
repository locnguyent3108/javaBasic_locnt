package FacadePattern;

import java.util.Scanner;

public class FacadePatternClient {
    private static Scanner sc = new Scanner(System.in);
    private static int choice;
    private static MobileStoreKeeper storeKeeper = new MobileStoreKeeper();

    public static void main(String[] args) {
        do {
            System.out.println("Quý khách muốn xem điện thoại nào từ cửa hàng chúng tôi?");
            System.out.println("1. Iphone");
            System.out.println("2. Xiaomi");
            System.out.println("3. Samsung");
            System.out.println("4. Exit");
            System.out.println("Mời quý khách nhập lựa chọn : ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    storeKeeper.saleIphone();
                    continue;
                case 2:
                    storeKeeper.saleXiaomi();
                    continue;
                case 3:
                    storeKeeper.saleSamsung();
                    continue;

            }
        } while (choice != 4);
    }
}
