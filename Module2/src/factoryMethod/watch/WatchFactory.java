package factoryMethod.watch;

public class WatchFactory {
    public static Watch getWatch(String input ) {

        if (input.equalsIgnoreCase("titan")) {
            return new Titan("Rage" ,"White" , 38000) ;
        } else if (input.equalsIgnoreCase("fastrack")) {
            return new Fastrack("FS-1602" ,"Black" , 2800) ;
        }else return null ;
    }
}
