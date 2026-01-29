package search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 10;

        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // index found
            }
        }
        return -1; // not found
    }
}
