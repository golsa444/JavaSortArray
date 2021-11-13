import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;


class SortTest {


    @Test
    void Array_Exact_Length_Is_7() {
        int[] Expected_Length = Sort.getUsersNumbers();
        int[] num = new int[7];
        assertEquals(num.length, Expected_Length.length);
    }


    @Test
    void Test_If_Array_Is_Sorted_Descending() {
        int[] arr = {2, 5, 76, -5, 89, -3, 90};
        Sort.SortArrayDescending(arr); // expected {-5, -3, 2, 5, 76, 89, 90}
        int[] expt = {-5, -3, 2, 5, 76, 89, 90};
        assertArrayEquals(expt, arr);
    }

    @Test
    void Test_If_Array_Is_Sorted_Ascending() {
        int[] array = {2, 5, 76, -5, 89, -3, 90};
        Sort.SortArrayAscending(array); // expected {90, 89, 76, 5, 2, -3, -5}
        int[] expt = {90, 89, 76, 5, 2, -3, -5};
        assertArrayEquals(expt, array);
    }


}