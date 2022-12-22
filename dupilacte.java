
import java.util.*;

public class dupilacte {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 2, 6, 3 };
     boolean flag = false;
        // approach-1

        // for (int i = 0; i < arr.length - 1; i++) {
        // for (int j = i + 1; j < arr.length; j++) {

        // if (arr[i] == arr[j]) {
        // System.out.println("the duplicateis " + arr[i]);
        // }

        // }

        // }

        // }
        // }

        // approach 2 shorting

        // Arrays.sort(arr);

        // for(int i=0;i<arr.length-1;i++){
        //     if(arr[i]==arr[i+1]){
        //         System.out.println("true");
        //     }
        // }




        //  System.out.println("false");










            // HashSet<Integer> dupli =new HashSet<>();

        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(numbers.contains(arr[i])){
                System.out.println("true");
            }
        }
         System.out.println("false");




    }
}
