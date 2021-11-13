import javax.swing.*;
import java.util.Arrays;

public class Sort {

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
