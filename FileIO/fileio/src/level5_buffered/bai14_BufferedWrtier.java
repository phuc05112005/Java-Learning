package level5_buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class bai14_BufferedWrtier {
    public static void main(String[] args) throws IOException {
        // Bai 14. BufferdWrited
    Path file = Path.of("data/bai14.txt");

    Files.createFile(file);

    BufferedWriter writer = Files.newBufferedWriter(file);

    writer.write("Laptop,2000");
    writer.newLine();

    writer.write("Phone,1000");
    writer.newLine();

    writer.write("Mouse,50");
    writer.newLine();

    writer.write("Keyboard,80");
    writer.newLine();

    writer.close();


    // Bai 15. Doc - xu ly tung dong
    Path file2 = Path.of("data/bai15.txt");
    Files.copy(file, file2);

    BufferedReader reader = Files.newBufferedReader(file2);

    double total = 0;
    double max = 0;
    double min = Double.MAX_VALUE;
    String line;
    while((line = reader.readLine()) != null) {
        String[] parts = line.split(",");

        double price = Double.parseDouble(parts[1]);

        // Tinh tong
        total += price;

        // Gia cao nhat
        if(price>max){
            max = price;
        }

        // Gia thap nhat
        if(price<min){
            min = price;
        }
    }
    reader.close();
        System.out.println("Tong tien: "+ total);
        System.out.println("Gia cao nhat: " + max);
        System.out.println("Gia thap nhat: " + min);
    }
}
