public class User implements MailObserver{
    private String name;

    public User (String name){
        this.name = name;
    }

    @Override
    public void newsletter(String information) {
        System.out.println(name + " got mail: " + information);
    }
}
