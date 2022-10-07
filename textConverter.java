import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputText = sc.nextLine();
        System.out.println("Lower cased output : " + inputText.toLowerCase());
        System.out.println("Upper cased output : " + inputText.toUpperCase());
    }
}
