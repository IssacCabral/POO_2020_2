import models.*;

public class App {
    public static void main(String[] args) throws Exception 
    {
        // User usuario1 = new User("Atílio");
        // User usuario2 = new User("Bruno Sales");

        // usuario1.follow(usuario2);
        // usuario2.follow(usuario1);

        // Tweet tweet = new Tweet(usuario1.getUsername(), "Tava dormindo né KKKKKK");
        // usuario1.sendTweet(tweet);
        // usuario1.sendTweet(new Tweet(usuario1.getUsername(), "sou corno"));
        // usuario1.sendTweet(new Tweet(usuario1.getUsername(), "vou espionar voce"));
        // usuario1.sendTweet(new Tweet(usuario1.getUsername(), "SOU LOUCO"));
        
        // tweet.like("Bruno Sales");
        // tweet.like("Clidenor");
        // tweet.like("Henrique");
        // System.out.println(tweet);

        Controller controller = new Controller();

        controller.addUser("Aragão");
        controller.addUser("Atílio");
        controller.addUser("Cristiano");

        controller.follow("Aragão", "Cristiano");
        controller.follow("Cristiano", "Aragão");

        controller.sendTweet("Aragão", "Você é muito linda meu amor");
        controller.sendTweet("Aragão", "Tão madura pra sua idade...");

        System.out.println(controller.timeLine("Cristiano"));
        controller.like("Cristiano", 1);
        System.out.println(controller.timeLine("Cristiano"));

        controller.follow("Atílio", "Aragão");
        controller.follow("Aragão", "Atílio");
        controller.sendTweet("Atílio", "Te pluguei haha");

        System.out.println(controller.timeLine("Aragão"));

    }
}
