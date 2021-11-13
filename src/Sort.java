import javax.swing.*;

public class Sort {

    public static int[] getUsersNumbers() {
        // int [] arr = new int [] {52,4,-32,64,12,8,-78,18,23,7};
        String ar = JOptionPane.showInputDialog(null, "Enter 7 Numbers: ");
        String[] strNum = ar.split(",");
        int[] num = new int[7];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(strNum[i]);
        }

        return num;
    }

    public static void SortArrayAscending(int[] num) {
        int x = 0;
        //Sort the array
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] < num[j]) {
                    x = num[i];
                    num[i] = num[j];
                    num[j] = x;
                }
            }
        }
        // sorted array
        StringBuilder builder = new StringBuilder(num.length);
        for (int i = 0; i < num.length; builder.append(num[i++])) {
            builder.append("\n");
        }
        JOptionPane.showMessageDialog(null, builder.toString(), "Sorted Array: ", JOptionPane.INFORMATION_MESSAGE);

    }

    public static void SortArrayDescending(int[] num) {
        int x = 0;
        //Sort the array
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    x = num[i];
                    num[i] = num[j];
                    num[j] = x;
                }
            }
        }
        // sorted array
        StringBuilder builder = new StringBuilder(num.length);
        for (int i = 0; i < num.length; builder.append(num[i++])) {
            builder.append("\n");
        }
        JOptionPane.showMessageDialog(null, builder.toString(), "Sorted Array: ", JOptionPane.INFORMATION_MESSAGE);


    }

}
