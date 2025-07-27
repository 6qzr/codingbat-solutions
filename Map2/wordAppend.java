public class wordAppend {
  public String wordAppend(String[] strings) {
    String newStr ="";
    Map<String, Integer> map = new HashMap<String, Integer>();
    for (String element : strings) {
      if (map.containsKey(element)) {
        map.put(element, map.get(element) + 1);
        if (map.get(element) % 2 == 0) {
          newStr += element;
        }
      } else {
        map.put(element, 1);
      }
    }
    return newStr;
  }
}
