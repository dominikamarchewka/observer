public class Main {

    public static void main(String[] args) {
        Blog blog = new Blog();
        blog.subscribe(new User("Dominika"));
        blog.subscribe(new User("Tomasz"));
        blog.startWork();
    }
}
