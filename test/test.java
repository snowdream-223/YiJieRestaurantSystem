import service.wx.Foodservice;
import service.wx.Foodserviceimpl;

public class test {
    public static void main(String[] args) {
        sd();
    }

    static void sd() {
        Foodservice foodservice = new Foodserviceimpl();
        foodservice.getfoodlist();
    }
}
