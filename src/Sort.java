import com.sun.jdi.connect.IllegalConnectorArgumentsException;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class Sort {

    // get user's numbers
    public static int[] getUsersNumbers() {
        // random number between 4-8 (length of array)
        int rd = GetRandomNumber(4,8);
        // get user's numbers based on generated random length
        String ar = JOptionPane.showInputDialog(null, "Enter " + rd + " Numbers: ");
        String[] strNum = ar.split(",");
        int[] num = new int[rd];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(strNum[i]);
        }
        return num;
    }

    // sort the Array in Ascending order
    public static void SortArrayAscending(int[] num) {
        int x = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] < num[j]) {
                    x = num[i];
                    num[i] = num[j];
                    num[j] = x;
                }
            }
        }
        MethodForStringBuilder(num);
    }

    // sort the Array in Descending order
    public static void SortArrayDescending(int[] num) {
        int x = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    x = num[i];
                    num[i] = num[j];
                    num[j] = x;
                }
            }
        }
        MethodForStringBuilder(num);

    }

    // use StringBuilder for displaying the JOptionPane Message dilaog window one time otherwise
    // it's gonna be displayed as many times as array's length
    public static void MethodForStringBuilder(int[] num) {
        StringBuilder builder = new StringBuilder(num.length);
        for (int i = 0; i < num.length; builder.append(num[i++])) {
            builder.append("\n");
        }
        JOptionPane.showMessageDialog(null, builder.toString(), "Sorted Array", JOptionPane.INFORMATION_MESSAGE);

    }

    // Generates a random number for Array's length
    public static int GetRandomNumber(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random random = new Random();
        // generate random numbers : min(inclusive) and max(inclusive)
        return random.nextInt((max - min) + 1) + min;
    }


}
