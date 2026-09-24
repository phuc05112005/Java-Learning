package advanced.bai12;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // bai 13. reduce()
        List<Integer> numbers = List.of(1,2,3,10,4,5,6,7,8,9);

        // Tinh tong
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Tong: " + sum);

        // Tinh tich
        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("Tich: " + product);

        // Tim so lon nhat bang reduce
        int max = numbers.stream()
                .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.println("So lon nhat la: " + max);

        // Tim so nho nhat bang reduce
        int min = numbers.stream()
                .reduce(Integer.MAX_VALUE, (a, b) -> a > b ? b : a);
        System.out.println("So nho nhat la: " + min);

        // Noi cac String
        List<String> skill = List.of(
                "Java",
                "Spring",
                "SQL"
        );

        String result = skill.stream()
                .reduce("", ( a, b) -> a.isEmpty() ? b : a + "-" + b);
        System.out.println("Chuoi sau khi noi: " + result);



    }
}
