package homework.h10;

// base
// LeetCode №3304: Find the K-th Character in String Game I
public class T1 {
  public char kthCharacter(int k) {
    StringBuilder word = new StringBuilder("a");

    while (word.length() < k) {
      int currentLength = word.length();
      for (int i = 0; i < currentLength; i++) {
        char c = word.charAt(i);
        char nextChar = (c == 'z') ? 'a' : (char) (c + 1);
        word.append(nextChar);

        if (word.length() >= k) {
          break;
        }
      }
    }

    return word.charAt(k - 1);
  }
}
