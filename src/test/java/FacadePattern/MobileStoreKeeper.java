package FacadePattern;

public class MobileStoreKeeper {
    private MobileStore iphone;
    private MobileStore xiaoMi;
    private MobileStore samsung;

    public MobileStoreKeeper() {
        iphone = new iphone();
        xiaoMi = new xiaomi();
        samsung = new samsung();
    }


//    public MobileStoreKeeper() {
//        iphone = new iphone();
//        xiaoMi = new xiaomi();
//        samsung = new samsung();
//    }

    public void saleIphone() {
        iphone.showMobile();
        iphone.orderMobile();
        iphone.pay();
    }

    public void saleXiaomi() {
        xiaoMi.showMobile();
        xiaoMi.orderMobile();
        xiaoMi.pay();
    }

    public void saleSamsung() {
        samsung.showMobile();
        samsung.orderMobile();
        samsung.pay();
    }
}
