package final_project.bai15;

import advanced.bai14.Student;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Laptop Dell Inspiron", "Laptop", 18500000, 5),
                new Product("MacBook Air M2", "Laptop", 24500000, 3),
                new Product("Laptop ASUS Vivobook", "Laptop", 15900000, 8),
                new Product("iPhone 15", "Phone", 18900000, 10),
                new Product("Samsung Galaxy S24", "Phone", 21900000, 6),
                new Product("Xiaomi Redmi Note 13", "Phone", 5990000, 15),
                new Product("iPad Air M2", "Tablet", 16900000, 7),
                new Product("Samsung Galaxy Tab S9", "Tablet", 18500000, 0),
                new Product("Tai nghe AirPods Pro 2", "Accessory", 5990000, 12),
                new Product("Sony WH-1000XM5", "Accessory", 8490000, 0),
                new Product("Logitech MX Master 3S", "Accessory", 2490000, 20),
                new Product("Ban phim Keychron K2", "Accessory", 2190000, 10),
                new Product("Man hinh LG UltraGear", "Monitor", 7990000, 6),
                new Product("Man hinh Samsung Odyssey", "Monitor", 9990000, 0),
                new Product("Man hinh Dell UltraSharp", "Monitor", 11500000, 3),
                new Product("Laptop Lenovo ThinkPad", "Laptop", 22500000, 4),
                new Product("Google Pixel 9", "Phone", 19900000, 5),
                new Product("iPad Pro M4", "Tablet", 28900000, 2),
                new Product("Chuột Logitech G102", "Accessory", 490000, 25),
                new Product("Webcam Logitech C920", "Accessory", 1790000, 9)
        );

        // Lay tat ca san pham > 10 trieu
        System.out.println("Nhung san phan gia > 10 trieu");
        products.stream()
                .filter(s -> s.getPrice() > 10000000)
                .forEach(System.out::println);

        // Lay ten tat ca san pham
        System.out.println();
        products.stream()
                .map(Product::getName)
                .forEach(System.out::println);

        // Lay san pham con hang
        System.out.println();
        System.out.println("Nhung san pham con hang");
        products.stream()
                .filter(s -> s.getQuantity() > 0)
                .forEach(System.out::println);

        // Sap xep san pham theo gia giam dan
        System.out.println();
        products.stream()
                .sorted(Comparator.comparing(Product::getPrice).reversed())
                .forEach(System.out::println);

        // Top 5 san pham dat nhat
        System.out.println();
        products.stream()
                .sorted(Comparator.comparing(Product::getPrice).reversed())
                .limit(5)
                .forEach(System.out::println);

        // Tong gia tri kho
        double totalPrices = products.stream()
                .mapToDouble(s -> s.getQuantity() * s.getPrice())
                .sum();
        System.out.println("Tong gia tri kho: " + String.format("%,.0f",totalPrices));

        // Tinh gia trung binh
        double avgPrices = products.stream()
                .mapToDouble(Product::getPrice)
                .average()
                .orElse(0.0);
        System.out.println("Gia trung binh: " + String.format("%,.0f", avgPrices));

        // Tim san pham dat nhat
        Optional<Product> result = products.stream()
                .max(Comparator.comparing(Product::getPrice));
        System.out.println(result);

        // Kiem tra co san pham nao tren 25 trieu khong
        boolean checkPrice = products.stream()
                .anyMatch(s -> s.getPrice()>25000000);
        System.out.println("Co san pham nao tren 25 trieu khong? => " + checkPrice);


        // Collectors
        // List
        List<String> list = products.stream()
                .map(Product::getName)
                .toList();
        System.out.println(list);

        // Set
        Set<String> set = products.stream()
                .map(Product::getName)
                .collect(Collectors.toSet());
        System.out.println(set);

        // Map
        Map<String, Double> map = products.stream()
                .collect(Collectors.toMap(Product::getName, Product::getPrice));
        System.out.println(map);

        // Nhom san pham theo category
        Map<String, List<Product>> listCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));
        System.out.println(listCategory);

        // Dem so san pham moi category
        Map<String, Long> countProduct = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.counting()));
        System.out.println(countProduct);


        // Advanced
        // Tinh gia trung binh moi category
        Map<String, Double> avgCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.averagingDouble(Product::getPrice)));
        System.out.println("Gia trung binh cac category: " + avgCategory);

        // Tim san pham dat nhat moi category
        Map<String, Optional<Product>> maxPriceCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.maxBy(Comparator.comparing(Product::getPrice))));
        System.out.println("San pham dat nhat trong moi category: " + maxPriceCategory);

        // Tinh tong gia tri cua kho trong tung category
        Map<String, Double> totalCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.summingDouble(Product::getPrice)));
        System.out.println("Tong gia tri moi category: " + totalCategory);

        // Chia san pham con hang va khong con
        Map<Boolean, List<Product>> partitionedProducts = products.stream()
                .collect(Collectors.partitioningBy(
                        p -> p.getQuantity() > 0
                ));
        System.out.println(partitionedProducts);

        // Lay top 3 san pham dat nhat tung category
        Map<String, List<Product>> top3BestPriceInCate = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory,
                        Collectors.collectingAndThen(
                                Collectors.toList(), l -> l.stream()
                                        .sorted(Comparator.comparing(Product::getPrice).reversed())
                                        .limit(3)
                                        .toList()
                        )
                ));
        System.out.println("Top 3 san pham dat nhat tung category: " + top3BestPriceInCate);
}
}