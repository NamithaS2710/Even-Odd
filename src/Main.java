import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EvenOdd eve = new EvenOdd();
        Scanner scanner = new Scanner(System.in);
        eve.x=scanner.nextInt();
        eve.find();
    }
}
class EvenOdd {
    int x;
    void find() {
        if (x % 2 == 0) {
            System.out.println(x + " is even");
        } else {
            System.out.println(x + " is odd");
        }

    }
}
