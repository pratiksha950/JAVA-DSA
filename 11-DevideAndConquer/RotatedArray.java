/*Search in Rotated Sorted Array
input: sorted, rotated array with distinct numbers (in ascending order).
It is rotated at a pivot point. Find the index of given element. */

//method 1-Iterative method-Best method
public class RotatedArray {
    public static int search(int arr[], int target) {
        int st = 0, end = arr.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            // Found target
            if (arr[mid] == target) {
                return mid;
            }

            // Left part sorted
            if (arr[st] <= arr[mid]) {
                if (arr[st] <= target && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
            // Right part sorted
            else {
                if (arr[mid] < target && target <= arr[end]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

}


//method 2-Devide and conquer method 
// public class RotatedArray {
//     public static int search(int arr[], int target, int st, int end) {

//         // Base case
//         if (st > end) {
//             return -1;
//         }

//         int mid = st + (end - st) / 2;

//         // Case 1: Target found
//         if (arr[mid] == target) {
//             return mid;
//         }

//         // Case 2: Left half is sorted
//         if (arr[st] <= arr[mid]) {

//             // Target lies in left half
//             if (arr[st] <= target && target < arr[mid]) {
//                 return search(arr, target, st, mid - 1);
//             }
//             // Search right half
//             else {
//                 return search(arr, target, mid + 1, end);
//             }
//         }

//         // Case 3: Right half is sorted
//         else {

//             // Target lies in right half
//             if (arr[mid] < target && target <= arr[end]) {
//                 return search(arr, target, mid + 1, end);
//             }
//             // Search left half
//             else {
//                 return search(arr, target, st, mid - 1);
//             }
//         }
//     }

//     public static void main(String[] args) {

//         int arr[] = {4,5,6,7,0,1,2};
//         int target = 0;

//         int result = search(arr, target, 0, arr.length - 1);

//         System.out.println("Index: " + result);
//     }
// }