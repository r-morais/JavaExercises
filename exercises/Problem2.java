package exercises;

/*
This problem was asked by Uber.
Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
Follow-up: what if you can't use division?
*/

public class Problem2 {

    // O(n) complexity with division (nor checking for zeroes)
    private int[] execMultiply(int[] list) {

        int ret[] = new int[list.length];

        int product = 1;

        // multiply all values
        for (int i = 0; i < list.length; i++) {
            product *= list[i];
        }

        // divide by the value at position
        for (int i = 0; i < list.length; i++) {
            ret[i] = product / list[i];
        }

        return ret;
    }

    private int[] execDivide(int list[]) {

        int n = list.length;

        // Initialize memory to all arrays
        int left[] = new int[n];
        int right[] = new int[n];
        int ret[] = new int[n];

        //Left most element of left array is always 1 
        left[0] = 1;

        //Rightmost most element of right array is always 1
        right[n - 1] = 1;

        /* Construct the left array */
        for (int i = 1; i < n; i++)
            left[i] = list[i - 1] * left[i - 1];

        /* Construct the right array */
        for (int j = n - 2; j >= 0; j--)
            right[j] = list[j + 1] * right[j + 1];
        
        for (int i = 0; i < n; i++)
            ret[i] = left[i] * right[i];

        return ret;

    }

    public static void main(String[] args) {

        Problem2 p = new Problem2();
        int[] ret1 = p.execMultiply(new int[] { 3, 2, 1 });

        for (int i : ret1) {
            System.out.println(i);
        }

        int[] ret2 = p.execDivide(new int[] { 3, 2, 1 });

        for (int i : ret2) {
            System.out.println(i);
        }
    }
}
