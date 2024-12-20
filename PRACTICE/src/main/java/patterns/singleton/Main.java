package patterns.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Singleton Pattern in Java");
        System.out.println("-------------------------");
        System.out.println();

        MinimalSingleton s1 = MinimalSingleton.getInstance();
        MinimalSingleton s2 = MinimalSingleton.getInstance();

        System.out.print("Same instance in s1 and s2: ");
        System.out.println(s1 == s2);

        s1.setMessage("Hello s1!");

        s1.showMessage();
        s2.showMessage();

        s2.setMessage("Hello  s2!");

        s1.showMessage();
        s2.showMessage();
    }
}