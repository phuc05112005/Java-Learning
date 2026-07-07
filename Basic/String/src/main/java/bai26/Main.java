package bai26;

public class Main {
    public static void main(String[] args) {

        String input = "   le hOanG     pHUc     ";
        System.out.println(chuanHoa(input));

    }

    public static String chuanHoa(String input){
        input = input.strip();
        String[] words = input.split("\\s+");

        for(int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
            String firstChar = words[i].substring(0, 1);
            firstChar = firstChar.toUpperCase();
            words[i] = firstChar + words[i].substring(1);
        }
         return String.join(" ", words);
    }
}
