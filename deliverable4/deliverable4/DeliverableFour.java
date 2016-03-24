import java.util.Arrays;
import java.util.Random;

public class DeliverableFour {

   public static void main(String[] args) {

      Random rand = new Random();
      //ArrayList<int[]> al = new ArrayList<int[]>();
      int i;
      int j;
      int r;
      int[] arr;
      for (i = 0; i < 106; i++) {
         r = rand.nextInt(5) + 1;
         arr = new int[r];
         for (j = 0; j < arr.length; j++) {//generate random
            arr[j] = rand.nextInt(101);

         }
         System.out.println(Arrays.toString(arr));
         Arrays.sort(arr);
         System.out.println(Arrays.toString(arr));
      }
   }
   
}