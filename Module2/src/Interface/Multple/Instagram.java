package Interface.Multple;

public class Instagram implements Meta {

    @Override
    public void getNotification() {
        System.out.println("Instagram notificicatin");
    }

    @Override
    public void creataePost() {
        System.out.println("Instagram post created");
        this.getNotification();
    }

    @Override
    public void deletePost() {
        System.out.println("Instagram post deleted");
        this.getNotification(); ;
    }
}
