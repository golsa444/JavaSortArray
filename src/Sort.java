import javax.swing.*;
import java.util.Arrays;

public class Sort {
    /* String num = JOptionPane.showInputDialog(null, "Enter your Numbers: ");
    String[] strNum = num.split(",");*/
    /*public static void  SortArray () {

        int[] arr = new int[]{1, 4, 7, 8, 14, 10, 11, 43};
        int tmp = 0;
        System.out.println("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        // sort array
        for (int i : arr) {
            for (int j=i + 1; j < arr.length; j++  ) {
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println("Sorted Array: ");
        for(int i  = 0; i<arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
*/

    public static void SortArray() {
        // int [] arr = new int [] {52,45,-32,64,12,87,-78,98,23,7};
       String arr1 = JOptionPane.showInputDialog(null, "Enter 7 Numbers: ");


        String[] strNum = arr1.split(",");
        int[] num = new int[7];
        for (int i = 0; i<num.length; i++) {
            num[i] = Integer.parseInt(strNum[i]);
        }
        int x = 0;

        // original array
       // System.out.println("This is the original Array: ");
        for (int i = 0; i <num.length; i++) {
            System.out.print(num[i] + " ");
        }
        //Sort the array
        for (int i = 0; i <num.length; i++) {
            for (int j = i+1; j <num.length; j++) {
                if(num[i] > num[j]) {      //swap elements if not in order
                    x = num[i];
                    num[i] = num[j];
                    num[j] = x;
                }
            }
        }

        //print sorted array
        // System.out.println("Sorted Array:  ");
        StringBuilder builder = new StringBuilder(num.length);
        for (int i = 0; i < num.length; builder.append(num[i++])) {
            builder.append("\n");
        }

        JOptionPane.showMessageDialog(null, builder.toString(), "Sorted Array: " , JOptionPane.INFORMATION_MESSAGE);


    }

}
