public class extraFront {
  public String extraFront(String str) {
    String first2 = "";
    if (str.length() >= 2) {
      first2 = str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
    } else {
      first2 = str.substring(0) + str.substring(0) + str.substring(0);
    }
    return first2;
  }
}
