import java.util.Arrays;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {

  List<Character> vowelList;

  public Extension() {
    vowelList = Arrays.asList('a', 'u', 'o', 'e', 'i');
  }

  int add(int a, int b) {
    return a + b;
  }

  int maxOfThree(int a, int b, int c) {
    return (a > b)
            ? ((a > c) ? a : c)
            : ((b > c) ? b : c);
  }

  int median(List<Integer> pool) {
    return pool.get((pool.size() - 1) / 2);
  }

  boolean isVowel(char c) {
    return vowelList.contains(c);
  }

  String translate(String hungarian) {
    String teve = "";
    int length = hungarian.length();
    for (int i = 0; i < length; i++) {
      char c = hungarian.charAt(i);
      if (isVowel(c)) {
        teve += c + "v" + c;
      } else {
        teve += hungarian.charAt(i);
      }
    }
    return teve;
  }
}
