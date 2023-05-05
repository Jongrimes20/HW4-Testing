import org.junit.*;
import static org.junit.Assert.assertEquals;

public class AverageTests {
    //Test Cases From HW 4

    /*
     * Partitions of 'k'
     * - k = list.length
     * - k > list.length
     * - k < list.length
     * - k < 0 
     * - k = 0
     */
    @Test 
    public void testKEqualListSize() {
        int[] list = {2, 4, 6, 8};
        Average avg = new Average();
        assertEquals(5, avg.Avergae(4, list));
    }

    @Test
    public void testKGreaterThanListSize() {
        int[] list = {2, 4, 6, 8};
        Average avg = new Average();
        assertEquals(5, avg.Avergae(5, list));
    }

    @Test
    public void testKLessThanListSize() {
        int[] list = {2, 4, 6, 8};
        Average avg = new Average();
        assertEquals(4, avg.Avergae(3, list));
    }

    @Test
    public void testNegativeK() {
        int[] list = {2, 4, 6, 8};
        Average avg = new Average();
        assertEquals(0, avg.Avergae(-3, list));
    }

     @Test
     public void testZeroK() {
         int[] list = {2, 4, 6, 8};
         Average avg = new Average();
         assertEquals(0, avg.Avergae(0, list));
     }

     /*
      * Partitions of 'list'
      * - List only contains positive numbers.
      * - List only contains negative numbers.
      * - List contains both positive and negative numbers.
      * - List is empty.
      */
    @Test
    public void testPositiveNumbers() {
        int[] list = {2, 4, 6, 8};
        Average avg = new Average();
        assertEquals(4, avg.Avergae(3, list));
    }

    @Test
    public void testNegativeNumbers() {
        int[] list = {-2, -4, -6, -8};
        Average avg = new Average();
        assertEquals(-5, avg.Avergae(4, list));
    }

    @Test
    public void testMixedNumbers() {
        int[] list = {-2, 4, -6, 8};
        Average avg = new Average();
        assertEquals(1, avg.Avergae(4, list));
    }

    @Test
    public void testEmptyList() {
        int[] list = {};
        Average avg = new Average();
        assertEquals(0, avg.Avergae(3, list));
    }
}
