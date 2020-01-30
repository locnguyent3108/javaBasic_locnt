package FacadePattern;

public class iphone implements MobileStore {

    public void showMobile() {
        System.out.println("day la iphone X");
    }

    public void orderMobile() {
        System.out.println("Ban da mua thanh cong iphone X");
    }

    public void pay() {
        System.out.println("Ban thanh toan thanh cong iphone X");
    }
}
