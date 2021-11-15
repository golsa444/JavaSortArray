public class Main {

    public static void main(String[] args) {

        // Uncomment to pass command line argument OR Main --> Edit Configurations...  and give arguments there
        /*int[] test = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            test[i] = Integer.parseInt(args[i]);
        }
        Sort.SortArrayDescending(test);*/

        int[] ex = Sort.getUsersNumbers();
        Sort.SortArrayDescending(ex);
        Sort.SortArrayAscending(ex);


    }
}
