import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
public class ArraysCompareTest {
    @Test
    public void firstTest() {

        int [] numbers = {1, 2, 3, 4, 5, 6};
        int [] expected = {1, 2, 3, 4, 5, 6};
        Arrays.sort(numbers);

        assertArrayEquals(expected, numbers);
    }
    @Test(expected = NullPointerException.class)
    public void secondTest() {

        int [] numbers = null;
        Arrays.sort(numbers);
    }
    @Test(timeout = 100)
    public void performanceTest() {

        int [] array = {144, 12, 6};
        for (int i = 0; i < 1000000; i++) {
            array [0] = i;
            Arrays.sort(array);
        }
    }
}


/* @Test
    public void secondTest() {

        int [] numbers = null;
        try {
            Arrays.sort(numbers);
        }catch (NullPointerException e){
            // success
        }

    */

