import java.util.*;

public class week2week3 {

    // Linear Search (first occurrence)
    public static int linearFirst(String[] arr, String target) {
        int comparisons = 0;

        for (int i = 0; i < arr.length; i++) {
            comparisons++;
            if (arr[i].equals(target)) {
                System.out.println("Linear First Index: " + i + " (comparisons=" + comparisons + ")");
                return i;
            }
        }

        return -1;
    }

    // Linear Search (last occurrence)
    public static int linearLast(String[] arr, String target) {
        int comparisons = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            comparisons++;
            if (arr[i].equals(target)) {
                System.out.println("Linear Last Index: " + i + " (comparisons=" + comparisons + ")");
                return i;
            }
        }

        return -1;
    }

    // Binary Search (any one occurrence)
    public static int binarySearch(String[] arr, String target) {
        int low = 0, high = arr.length - 1;
        int comparisons = 0;

        while (low <= high) {
            comparisons++;
            int mid = (low + high) / 2;

            if (arr[mid].equals(target)) {
                System.out.println("Binary Index: " + mid + " (comparisons=" + comparisons + ")");
                return mid;
            } else if (arr[mid].compareTo(target) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    // Count occurrences using binary search expansion
    public static int countOccurrences(String[] arr, String target, int index) {
        if (index == -1) return 0;

        int count = 1;

        // left side
        int i = index - 1;
        while (i >= 0 && arr[i].equals(target)) {
            count++;
            i--;
        }

        // right side
        i = index + 1;
        while (i < arr.length && arr[i].equals(target)) {
            count++;
            i++;
        }

        return count;
    }

    public static void main(String[] args) {

        String[] logs = {"accA", "accB", "accB", "accC"}; // sorted

        String target = "accB";

        // Linear Search
        linearFirst(logs, target);
        linearLast(logs, target);

        // Binary Search
        int index = binarySearch(logs, target);

        // Count duplicates
        int count = countOccurrences(logs, target, index);

        System.out.println("Total occurrences of " + target + ": " + count);
    }
}