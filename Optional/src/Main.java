import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String name = "Phuc";
        String name2= null;

        Optional<String> optionalName = Optional.of(name);
        Optional<String> optionalName2 = Optional.ofNullable(name2);
        Optional<String> optionalName3 = Optional.empty();
        System.out.println(optionalName.get());
        System.out.println(optionalName2);
        System.out.println(optionalName3);
        optionalName.ifPresent(System.out::println);
        optionalName2.ifPresent(System.out::println);


        optionalName2.ifPresentOrElse(
                value -> System.out.println(value),
                () -> System.out.println("Không tìm thấy")
        );


        System.out.println();
        LocalDate birthday = LocalDate.of(2005,11,05);
        LocalDate now = LocalDate.now();
        Period age = Period.between(birthday, now);
        System.out.println(age.getYears());
    }
}
