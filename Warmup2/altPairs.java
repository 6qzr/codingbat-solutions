public class altPairs {
  public String altPairs(String str) {
    String newStr = "";
    int nextIndex = 0;
    while (nextIndex < str.length()) {
      newStr += str.charAt(nextIndex);
      if (nextIndex % 2 == 0) {
        nextIndex += 1;
      } else {
        nextIndex += 3;
      }
    }
    return newStr;
  }
}
