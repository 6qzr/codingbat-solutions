public class noZ {
  public List<String> noZ(List<String> strings) {
    strings = strings.stream()
      .filter(s -> !s.contains("z"))
      .collect(Collectors.toList());
    return strings;
  }
}
