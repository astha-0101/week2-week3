import java.util.*;

public class week2week3 {

    // Linear Search (unsorted)
    public static boolean linearSearch(int[] arr, int target) {
        int comparisons = 0;

        for (int i = 0; i < arr.length; i++) {
            comparisons++;
            if (arr[i] == target) {
                System.out.println("Linear: Found at index " + i + " (comparisons=" + comparisons + ")");
                return true;
            }
        }

        System.out.println("Linear: Not found (comparisons=" + comparisons + ")");
        return false;
    }

    // Binary Search - find insertion index (lower bound)
    public static int lowerBound(int[] arr, int target) {
        int low = 0, high = arr.length;
        int comparisons = 0;

        while (low < high) {
            comparisons++;
            int mid = (low + high) / 2;

            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        System.out.println("Binary insertion index: " + low + " (comparisons=" + comparisons + ")");
        return low;
    }

    // Floor (largest <= target)
    public static Integer floor(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        Integer ans = null;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] <= target) {
                ans = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    // Ceiling (smallest >= target)
    public static Integer ceiling(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        Integer ans = null;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] >= target) {
                ans = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] risks = {10, 25, 50, 100}; // sorted
        int target = 30;

        // Linear Search (unsorted concept)
        linearSearch(risks, target);

        // Binary insertion point
        lowerBound(risks, target);

        // Floor and Ceiling
        Integer f = floor(risks, target);
        Integer c = ceiling(risks, target);

        System.out.println("Floor(" + target + "): " + f);
        System.out.println("Ceiling(" + target + "): " + c);
    }
}