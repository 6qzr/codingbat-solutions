public class stringX {
  public String stringX(String str) {
    String newStr ="";
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != 'x') {
        newStr += str.charAt(i);
      }
      else if (i == 0 || i == str.length()-1) {
        newStr += 'x';
      }
    }
    return newStr;
  }
}
