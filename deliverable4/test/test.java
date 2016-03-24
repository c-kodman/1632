//cmk126 Craig Kodman
        import static org.junit.Assert.*;

        import java.util.Arrays;
        import java.util.Random;

        import org.junit.Before;
        import org.junit.Test;

public class test {
    private int[] arr;

    @Before
    public void setup() {
        Random rand = new Random();
        int i;
        int j;
        int r;
        for (i = 0; i < 106; i++) {
            r = rand.nextInt(5) + 1;
            arr = new int[r];
            for (j = 0; j < arr.length; j++) {//generate random
                arr[j] = rand.nextInt(200) - 100;

            }
        }
    }

    @Test
    public void testPure()
    {
        int [] arrayOne = arr;
        int []arrayTwo =  Arrays.copyOf(arr, arr.length);
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        assertTrue(Arrays.equals(arrayOne, arrayTwo));

    }
    @Test
    public void testLength(){
        int unsortedArray = arr.length;
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        int sortedArray = arr.length;
        assertEquals(unsortedArray, sortedArray);
    }

    @Test
    public void idempotent(){
        int [] arrayOne = arr;
        Arrays.sort(arrayOne);
        int []arrayTwo =  Arrays.copyOf(arrayOne, arrayOne.length);
        Arrays.sort(arrayTwo);
        assertArrayEquals(arrayOne, arrayTwo);
    }

}
