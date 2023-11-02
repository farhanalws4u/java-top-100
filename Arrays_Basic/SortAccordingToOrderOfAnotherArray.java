import java.util.*;

public class SortAccordingToOrderOfAnotherArray {

    static void sortAccordingToOrder(int[] arr, int[] order) {
        int[] visited = new int[arr.length];
        int temp[] = new int[arr.length];
        int visitIndex = 0;

        for (int k = 0; k < arr.length; k++) {
            temp[k] = arr[k];
            visited[k] = 0;
        }

        Arrays.sort(temp);

        for (int i = 0; i < order.length; i++) {

            if (binarySearch(arr, order[i])) {

            }
        }

    }

    static boolean binarySearch(int[] arr, int ele) {
        int len = arr.length;
        int left = 0;
        int right = len - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] > ele) {
                right = mid - 1;
            } else if (arr[mid] < ele) {
                left = mid + 1;
            } else {
                return true;
            }

        }
        return false;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 3, 2, 4, 2, 5 };
        int[] orderArray = { 4, 2, 1, 3 };

        sortAccordingToOrder(arr, orderArray);
    }
}
