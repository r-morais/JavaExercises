package exercises;

/*
This problem was asked by Uber.
Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
Follow-up: what if you can't use division?
*/

public class Problem2 {

    // O(n) complexity with division (nor checking for zeroes)
    private int[] exec(int[] list) {

        int ret[] = new int[list.length];

        int product = 1;

        for (int i = 0; i < list.length; i++) {
            product *= list[i];
        }

        for (int i = 0; i < list.length; i++) {
            ret[i] = product / list[i];
        }

        return ret;
    }

    public static void main(String[] args) {
        
        Problem2 p = new Problem2();
        int[] ret = p.exec(new int[] { 3, 2, 1 });
        
        for (int i : ret) {
            System.out.println(i);
        }
    }
}
