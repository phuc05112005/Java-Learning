package bai24;

public class Main {
    public static void main(String[] args) {
        String path = "D:/lehoangphuc/music/remix.mp3";

        int lastIndex = path.lastIndexOf("/");

        String fileName = path.substring(lastIndex + 1);
        System.out.println(fileName);

        String namInFile = fileName.substring(0, fileName.lastIndexOf("."));
        System.out.println(namInFile);
    }
}
