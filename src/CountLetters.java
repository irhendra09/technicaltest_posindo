import java.util.Scanner;

public class CountLetters {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Masukkan kata: ");
        String input = scanner.nextLine().toLowerCase();
        int[] alphabetArray = new int[input.length()];

        char string[] = input.toCharArray();

        for(int i = 0; i <input.length(); i++) {
            alphabetArray[i] = 1;
            for(int j = i+1; j <input.length(); j++) {
                if(string[i] == string[j]) {
                    alphabetArray[i]++;
                    string[j] = '0';
                }
            }
        }

        for(int i = 0; i <alphabetArray.length; i++) {
            if(string[i] != ' ' && string[i] != '0')
                System.out.print(string[i] + "=" + alphabetArray[i] + ",");
        }
    }
}
