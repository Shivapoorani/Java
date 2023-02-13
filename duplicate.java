public class duplicate{
  public static void duplicateZeros(int[] arr) {
    int count = 0;
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      if (arr[i] == 0) {
        count++;
      }
    }
    
    for (int i = n - 1; i >= 0; i--) {
      if (arr[i] == 0) {
        if (i + count < n) {
          arr[i + count] = 0;
        }
        count--;
        arr[i + count] = 0;
      } else {
        arr[i + count] = arr[i];
      }
    }
  }
  public static void main(String[] args) {
    int[] arr = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
    duplicateZeros(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}