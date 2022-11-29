package HomeWork3;

/**
 * Реализовать алгоритм сортировки слиянием
 */
public class Task1 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 4, 7, 6, -3, 13};
        printArray(arr);
        mergeSort(arr);
        printArray(arr);
    }

    static private void mergeSort(int[] array) {
        int lengthArray = array.length;

        if (lengthArray < 2) return;

        int middle = lengthArray / 2;
        int[] leftSubArray = new int[middle];
        int[] rightSubArray = new int[lengthArray - middle];

        for (int i = 0; i < middle; i++)
            leftSubArray[i] = array[i];

        for (int i = 0; i < lengthArray - middle; i++)
            rightSubArray[i] = array[middle + i];

        mergeSort(leftSubArray);
        mergeSort(rightSubArray);
        merge(array, leftSubArray, rightSubArray);
    }

    private static void merge(int[] array, int[] leftSubArray, int[] rightSubArray) {
        int lengthLeftSubArray = leftSubArray.length;
        int lengthRightSubArray = rightSubArray.length;
        int indexLeftSubArray = 0;
        int indexRightSubArray = 0;
        int indexArray = 0;

        while (indexLeftSubArray < lengthLeftSubArray && indexRightSubArray < lengthRightSubArray) {
            if (leftSubArray[indexLeftSubArray] < rightSubArray[indexRightSubArray]) {
                array[indexArray] = leftSubArray[indexLeftSubArray];
                indexLeftSubArray++;
                indexArray++;
            } else {
                array[indexArray] = rightSubArray[indexRightSubArray];
                indexRightSubArray++;
                indexArray++;
            }
        }

        for (int i = indexLeftSubArray; i  < lengthLeftSubArray; i++)
            array[indexArray] = leftSubArray[i];

        for (int i = indexRightSubArray; i  < lengthRightSubArray; i++)
            array[indexArray] = rightSubArray[i];

    }

    static private void printArray (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
