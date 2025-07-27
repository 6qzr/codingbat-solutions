public class word0 {
  public Map<String, Integer> word0(String[] strings) {
    Map<String, Integer> map = new HashMap<String, Integer>();
    for (String element : strings) {
      map.put(element, 0);
    }
    return map;
  }
}
