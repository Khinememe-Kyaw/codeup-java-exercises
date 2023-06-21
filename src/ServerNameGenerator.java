import java.util.Random;

public class ServerNameGenerator {
    private static String[] adj = {"Beautiful", "Brave", "Creative", "Delightful", "Energetic", "Friendly", "Generous", "Happy", "Intelligent", "Kind"};
    private static String[] nouns = {"Dog", "Tree", "Book", "Car", "Sun", "Table", "Ocean", "Flower", "Mountain", "Computer"};

    public String getRandomAdj (){
        Random random = new Random();
        return adj[random.nextInt(adj.length)];
    }
    public String getRandomNoun (){
        Random random = new Random();
        return nouns[random.nextInt(nouns.length)];
    }
    public static void main(String[] args){
        ServerNameGenerator generator = new ServerNameGenerator();
        String randomAdj= generator.getRandomAdj();
        String randomNoun = generator.getRandomNoun();
        String serverName = randomAdj +" - "+ randomNoun;
        System.out.println(serverName);

    }
}