public class App {
    public static void main(String[] args) {
        init();
    }

    private static Boolean active = false;

    private static void init() {
        App.active = true;
        System.out.println("App activated!");
        new Player();
    }
}