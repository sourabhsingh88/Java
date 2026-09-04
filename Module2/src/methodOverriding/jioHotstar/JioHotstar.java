package methodOverriding.jioHotstar;

public class JioHotstar {
    void quality() {
        System.out.println("144 , 320 , 480 ");
    }
}

class PremiumJioHotstar extends JioHotstar{
    void quality() {
        super.quality();
        System.out.println("1080 , 2k ");
    }
}

class VipJioHotstar extends  PremiumJioHotstar  {
    void quality() {
        super.quality();
        System.out.println("4k ");
    }

}
