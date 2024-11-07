package patterns.singleton;

public class AbstractSingleton {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void showMessage() {
        System.out.println(this.message);
    }
}
