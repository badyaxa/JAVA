package patterns.singleton;

public class SingletonStaticInstance extends AbstractSingleton {
   private static SingletonStaticInstance instance = new SingletonStaticInstance();

   private SingletonStaticInstance() {}

   public static SingletonStaticInstance getInstance() {
      return instance;
   }
}
