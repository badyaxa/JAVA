package patterns.singleton;

public class MinimalSingleton extends AbstractSingleton {
   private static MinimalSingleton instance;

   private MinimalSingleton() {}

   public static MinimalSingleton getInstance() {
      if (instance == null) {
         instance = new MinimalSingleton();
      }
      return instance;
   }
}
