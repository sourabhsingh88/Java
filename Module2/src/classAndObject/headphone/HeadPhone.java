package classAndObject.headphone;


public class HeadPhone {
    String name ;
    double price ;
    String madeIn = "India";
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public void setMadeIn(String madeIn) {
//        this.madeIn = madeIn;
//    }


    void disp() {
        System.out.println("Name : " + name);
        System.out.println("Price : " + price);
        System.out.println("Made in : " + madeIn);

    }


}
