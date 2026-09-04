package methodOverriding.whatsapp;

public class Whatsapp {
    void send() {
        System.out.println("Text Messages");
    }
}


class Whatsapp1 extends  Whatsapp {
    void send() {
        super.send();
        System.out.println("Images");
        System.out.println("Audios");
        System.out.println("Videos");
    }
}


class Whatsapp2 extends Whatsapp1 {
    void send() {
        super.send();
        System.out.println("Contacts");
        System.out.println("Locations");
    }
}
