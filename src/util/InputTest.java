package util;
public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        // Test getString method
        System.out.print("Enter a string: ");
        String str = Input.getString();
        System.out.println("You entered: " + str);

        // Test yesNo method
        System.out.print("Do you like Java? (y/n): ");
        boolean likesJava = input.yesNo();
        System.out.println("You " + (likesJava ? "like" : "don't like") + " Java.");

        // Test getInt method
        int num = input.getInt(1, 10);
        System.out.println("You entered an integer between 1 and 10: " + num);

        // Test getDouble method
        double decimal = input.getDouble(1.5, 5.5);
        System.out.println("You entered a decimal number between 1.5 and 5.5: " + decimal);
    }
}
