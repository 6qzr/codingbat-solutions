public class front11 {
  public int[] front11(int[] a, int[] b) {
    if (a.length == 0  && b.length == 0) {
      int[] newList = new int[0];
      return newList;
    }
    if (a.length >= 1 && b.length >= 1) {
      int[] newList = new int[2];
      newList[0] = a[0];
      newList[1] = b[0];
      return newList;
    }
    int[] newList = new int[1];
    if (a.length >= 1) {
      newList[0] = a[0];
    }
    else {
      newList[0] = b[0];
    }
    return newList;
  }
}
