import java.util.ArrayList;

public class ArraListExample {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("Learn Java");
        tasks.add("Go to the gym");

        for (int i = 0; i <= tasks.size() - 1; i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }

        tasks.remove(0);
    }
}
