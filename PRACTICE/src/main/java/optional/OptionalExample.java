package optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
         Optional<String> empty = Optional.empty();
         System.out.println("empty "+ empty);
         System.out.println("---------------------------------");

         Optional<String> of = Optional.of("Hello");
         System.out.println("of " + of);
         System.out.println("---------------------------------");

         Optional<String> ofNullable = Optional.ofNullable("Hello");
         Optional<String> ofNullableNull = Optional.ofNullable(null);
         System.out.println("ofNullable " + ofNullable);
         System.out.println("ofNullableNull " + ofNullableNull);

         // orElse одразу створює об'єкт new String("World") навіть якщо об'єкт Optional не порожній
         System.out.println("ofNullableNull.orElse " + ofNullableNull.orElse(new String("World")));
         // orElseGet() приймає функціональний інтерфейс Supplier, який викликається тільки, якщо об'єкт Optional порожній
         // якщо у нас потрібно уникнути зайвим створенням об'єктів new String("World") (обєкти є ресурсо затратними)
         System.out.println("ofNullableNull.orElseGet " + ofNullableNull.orElseGet(() -> new String("World")));

         System.out.println("ofNullableNull.isPresent() " + ofNullableNull.isPresent());
         System.out.println("ofNullableNull.isEmpty() " + ofNullableNull.isEmpty());
         System.out.println("---------------------------------");
         ofNullableNull.ifPresent(System.out::println);
         System.out.println("---------------------------------");
         ofNullableNull.ifPresentOrElse(System.out::println, () -> System.out.println("ifPresentOrElse"));

         System.out.println("ofNullableNull.map " + ofNullableNull.map(String::toUpperCase));
         System.out.println("ofNullableNull.flatMap " + ofNullableNull.flatMap(s -> Optional.of(s.toUpperCase())));
         System.out.println("ofNullableNull.filter " + ofNullableNull.filter(s -> s.length() > 5));
         System.out.println("ofNullableNull.or " + ofNullableNull.or(() -> Optional.of("World")));
         System.out.println("ofNullableNull.stream().count() " + ofNullableNull.stream().count());
//         System.out.println("" + ofNullableNull.orElseThrow());
//         System.out.println("" + ofNullableNull.orElseThrow(() -> new RuntimeException("Hello")));
//         System.out.println("" + ofNullableNull.orElseThrow(RuntimeException::new));
    }
}
