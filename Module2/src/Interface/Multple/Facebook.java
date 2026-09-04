package Interface.Multple;

public class Facebook implements Meta{

    @Override
    public void getNotification() {
        System.out.println("Facebook notificicatin");
    }

    @Override
    public void creataePost() {
        System.out.println("Facebook post created");
        this.getNotification();
    }

    @Override
    public void deletePost() {
        System.out.println("Facebook post deleted");
        this.getNotification(); ;
    }
}
