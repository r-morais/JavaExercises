import java.util.ArrayList;
import java.util.HashSet;

/*This problem was recently asked by Google.
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
Bonus: Can you do this in one pass?*/

class Problem1 {

    private boolean exec(int[] list, int num) {

        HashSet<Integer> values = new HashSet<Integer>();

        for (int i = 0; i < list.length; i++) {

            int calc = num - list[i];
            if (values.contains(calc)) {
                System.out.println(list[i] + " + " + calc + " = " + num);
                return true;
            }
            values.add(list[i]);
        }

        return false;
    }

    public static void main(String[] args) {
        Problem1 p = new Problem1();

        System.out.println(p.exec(new int[] { 10, 15, 3, 7 }, 17));
    }

}