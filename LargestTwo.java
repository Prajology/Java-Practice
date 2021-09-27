public class LargestTwo {

    public static void main(String[] args) {
        System.out.println("Largest in given array is " + FindLargestNum());
    }

    public static int FindLargestNum() {
        int arr[] = {10, 45, 54, 7, 633, 5000, 98};
        int i;
        int max = arr[0];

        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
                return max;



        }


    }

