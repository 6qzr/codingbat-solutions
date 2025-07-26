public class stringMatch {
  public int stringMatch(String a, String b) {
    int lessLen;
    if (a.length() < b.length()) {
      lessLen = a.length();
    } else {
      lessLen = b.length();
    }
    
    int matchCount = 0;
    for (int i = 0; i < lessLen-1; i++) {
      if (a.substring(i, i+2).equals(b.substring(i, i+2))) {
        matchCount++;
      }
    }
    return matchCount;
  }
}
