package math.problems;


public class FindLowestDifference {
    public static void main(String[] args) {
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        Arrays.sort(array1);
        Arrays.sort(array2);

        int i = 0, j = 0, minDiff = Integer.MAX_VALUE;

        while (i < array1.length && j < array2.length) {
            int diff = Math.abs(array1[i] - array2[j]);
            if (diff < minDiff) {
                minDiff = diff;
            }
            if (array1[i] < array2[j]) {
                i++;
            } else {
                j++;
            }
        }

        System.out.println("The lowest difference between cells is " + minDiff);
    }
}
