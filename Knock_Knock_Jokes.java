import java.util.Random;

public class Knock_Knock_Jokes {
    public static void main(String[] args) {
        String[] knock_knock_jokes = {
            "Knock knock. Who's there? Boo. Boo who? Don't cry, it's just a joke.",
            "Knock knock. Who's there? Olive. Olive who? Olive you and I miss you!",
            "Knock knock. Who's there? Alpaca. Alpaca who? Alpaca the suitcase, you load up the car!",
            "Knock knock. Who's there? Lettuce. Lettuce who? Lettuce in, it's cold out here!",
            "Knock knock. Who's there? Harry. Harry who? Harry up and answer the door!",
            "Knock knock. Who's there? Tank. Tank who? You're welcome!",
            "Knock knock. Who's there? Orange. Orange who? Orange you going to answer the door?",
            "Knock knock. Who's there? Atch. Atch who? Bless you!",
            "Knock knock. Who's there? Banana. Banana who? Knock knock. Who's there? Banana. Banana who? Knock knock. Who's there? Orange. Orange who? Orange you glad I didn't say banana again?",
            "Knock knock. Who's there? Interrupting cow. Interrupting cow wh— MOO!",
            "Knock knock. Who’s there? Nobel. Nobel who? There's no bell...that’s why I knocked.",
            "Knock knock. Who’s there? Yah. Yah who? No, I use Google.",
            "Knock knock. Who's there? Cowsgo. Cowsgo who? No, cows go MOO!",
            "Knock knock. Who's there? Spell. Spell who? W-h-o.",
            "Knock knock. Who's there? Anna Partridge. Anna Partridge who? Anna Partridge in a pear tree!",
            "Knock knock. Who's there? Woo. Woo who? Sounds like a party in there!",     
        };

        Random random = new Random();
        int random_knock_knock_joke = random.nextInt(knock_knock_jokes.length);
        System.out.println(knock_knock_jokes[random_knock_knock_joke]);
    }
}
