package concurrent;

/*
volatile — це ключове слово в Java, яке використовується для оголошення змінних, доступ до яких здійснюється одночасно
кількома потоками.
Воно вказує JVM, що значення змінної може бути змінено іншими потоками, і тому її значення
потрібно зчитувати безпосередньо з пам'яті, а не з кешу потоку.

Як працює volatile?
У Java, кожен потік має власний кеш, і коли змінна не є volatile, значення може бути збережено в кеші потоку,
а не в основній пам’яті (main memory). Це може спричинити ситуацію, коли один потік змінює значення змінної,
 але інший потік бачить старе значення.

При оголошенні змінної як volatile, JVM гарантує, що:
        Змінна не кешується потоком, тобто кожен потік буде звертатися безпосередньо до основної пам’яті.
        Зміни в змінній видимі всім потокам одразу після їхнього виконання.
* */


public class VolatileExample {
    private static volatile boolean flag = false;

    public static void main(String[] args) {
        Thread writer = new Thread(() -> {
            try {
                Thread.sleep(100);
                flag = true; // змінюємо значення
                System.out.println("Flag set to true");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread reader = new Thread(() -> {
            while (!flag) { // чекаємо, поки flag стане true
            }
            System.out.println("Detected flag change");
        });

        writer.start();
        reader.start();
    }
}
