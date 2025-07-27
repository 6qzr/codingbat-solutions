public class firstChar {
  public Map<String, String> firstChar(String[] strings) {
    Map<String, String> map = new HashMap<String, String>();
    for (String element : strings) {
          String key = element.substring(0, 1);
          if (map.containsKey(key)) {
              map.put(key, map.get(key) + element);
          } else {
              map.put(key, element);
          }
      }
    return map;
  }
}
