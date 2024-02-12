import java.util.*;

public class CountLettersFilter {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Masukkan kata: ");
        String input = scanner.nextLine();
        int[] alphabetArray = new int[26 * 2];

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                if (Character.isLowerCase(c)) {
                    alphabetArray[c - 'a']++;
                } else {
                    alphabetArray[26 + c - 'A']++;
                }
            }
        }

        List<Map.Entry<Character, Integer>> frequencyList = new ArrayList<>();
        for (int i = 0; i < alphabetArray.length; i++) {
            char letter;
            if (i < 26) {
                letter = (char) ('a' + i);
            } else {
                letter = (char) ('A' + i - 26);
            }
            if (alphabetArray[i] != 0) {
                frequencyList.add(new AbstractMap.SimpleEntry<>(letter, alphabetArray[i]));
            }
        }

        frequencyList.sort((entry1, entry2) -> {
            int result = entry2.getValue().compareTo(entry1.getValue());
            if (result == 0) {
                return entry1.getKey().compareTo(entry2.getKey());
            }
            return result;
        });

        for (Map.Entry<Character, Integer> entry : frequencyList) {
            System.out.print(entry.getKey());
        }
    }

}
