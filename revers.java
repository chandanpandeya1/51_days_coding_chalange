class revers {
    public static void main(String[] args) {
      int arr[] = { 1, 2, 3, 4, 5, 6 };
      System.out.println("the given arry is :");
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]);
        System.out.print(" ");
    }
    System.out.println("");
    System.out.println("the reverse array is :");
    for (int i = arr.length-1; i >=0; i--) {
        System.out.print(arr[i]);
        System.out.print(" ");
        
      }
  
    }
  }