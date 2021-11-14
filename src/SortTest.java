import org.junit.Before;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;


class SortTest {

    // Test for Descending sort
    @Test
    void Test_If_Array_Is_Sorted_Descending() {
        int[] arr = {2, 5, 76, -5, 89, -3, 90};
        Sort.SortArrayDescending(arr); // expected {-5, -3, 2, 5, 76, 89, 90}
        int[] expt = {-5, -3, 2, 5, 76, 89, 90};
        assertArrayEquals(expt, arr);
    }


    // Test for Ascending sort
    @Test
    void Test_If_Array_Is_Sorted_Ascending() throws Exception {
        int[] array = {2, 5, 76, -5, 89, -3, 90};
        Sort.SortArrayAscending(array); // expected {90, 89, 76, 5, 2, -3, -5}
        int[] expt = {90, 89, 76, 5, 2, -3, -5};
        assertArrayEquals(expt, array);
        assertTrue(Arrays.equals(expt, array));
    }


    // Compare My sortDescending method with Arrays.sort() from java.util.Arrays
    @Test
    void Sort_Array_Using_Arrays_Sort_Method() {
        // sort with SortArrayDescending in Sort class
        int[] toSort = {1, -4, -6, 78, 89};
        Sort.SortArrayDescending(toSort);
        // sorted by Arrays.sort()  java.util.Arrays
        int[] arr = {-4, 1, 89, -6, 78};
        Arrays.sort(arr);
        assertTrue(Arrays.equals(arr, toSort));
        assertArrayEquals(arr, toSort);
    }


    // Test the RandomGenerator  Method
    @Test
    void Test_Random_Number_Generator_Method() {

        System.out.println(Sort.GetRandomNumber(10, 43));
        // gonna throw an exeption id min is greater than max
        // System.out.println(Sort.GetRandomNumber(10, 4));

    }

    // Test the Stringbuilder method which display an array just one time in a dialog box
    @Test
    void Test_For_String_Builder_Method() {

        int[] arr = {12, 34, 67, -90, 1, 56, -3};
        Sort.MethodForStringBuilder(arr);

        // not using the Sort.MethodForStringBuilder() method  = displaying the dialog box as many time as
        // array's length

        /*for (int i :arr) {
            JOptionPane.showMessageDialog(null, i);
        }*/



    }


}