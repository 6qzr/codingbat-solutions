public class deFront {
  public String deFront(String str) {    
    if (str.length() >= 1 && str.charAt(0) == 'a') {
      if (str.length() >= 2 && str.charAt(1) == 'b') {
        return str;
      }
      return str.charAt(0) + str.substring(2);
    } else if (str.length() >= 2 && str.charAt(1) == 'b') {
      return str.charAt(1) + str.substring(2);
    }
    return str.substring(2);
  }
}
