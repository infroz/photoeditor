public class App {
    // Java program implementing Singleton class
    // with getInstance() method
        // static variable single_instance of type Singleton
        private static App single_instance = null;

        // variable of type String
        public String s;

        // private constructor restricted to this class itself
        private App()
        {
            start();
        }

        // static method to create instance of Singleton class
        public static App getInstance()
        {
            if (single_instance == null)
                single_instance = new App();

            return single_instance;
        }

        private static void start() {
            System.out.println("Hello World");
            GUI ui = new GUI(720, 480);
        }
}
