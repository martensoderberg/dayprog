import java.lang.String;

public class Disemvoweler {
  private static final char[] vowels = {'a', 'o', 'u', 'e', 'i'};

  public static void main(String... args) {
    for (String arg : args) {
      String[] result = disemvowel(arg);
      System.out.println(result[0]);
      System.out.println(result[1]);
    }
  }

  public static String[] disemvowel(String str) {
    char[] charArray = str.toCharArray();
    char[] ourVowels = new char[str.length()];
    char[] ourOthers = new char[str.length()];
    int vowelsCounter = 0;
    int othersCounter = 0;

    for (char c : charArray) {
      if (isVowel(c)) {
        ourVowels[vowelsCounter] = c;
        vowelsCounter++;
      } else if (c == ' ') {
        // Do nothing
      } else {
        ourOthers[othersCounter] = c;
        othersCounter++;
      }
    }

    String[] arr = {new String(ourVowels), new String(ourOthers)};
    return arr;
  }

  public static boolean isVowel(char c) {
    boolean result = false;
    for (char v : vowels) {
      if (v == c) {
        return true;
      }
    }
    return result;
  }
}