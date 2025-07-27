public class pairs {
  public Map<String, String> pairs(String[] strings) {
    Map<String, String> map = new HashMap<String, String>();
    for (String element : strings) {
      map.put(""+element.charAt(0), ""+element.charAt(element.length()-1));
    }
    return map;
  }
}
