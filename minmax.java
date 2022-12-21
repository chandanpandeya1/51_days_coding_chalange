class minmax {
  public static void main(String[] args) {
    int A [] = { -4, -3, 3, 4, 1, 6 };
    int min = A[0];
    int max = A[0];
    for (int i = 1; i < A.length; i++) {
      if (A[i] < min) {
         min=A[i];
      }
      if (A[i] > max) {
         max=A[i];
      }
    }
    System.out.println(min + max);

  }
}
