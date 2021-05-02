package binary_search;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        int[] array = new int[]{2,3,66,7,73,1,9,90,55,87,57,23,50,};
        int numberOfElementsInArray = 13;
        int searchingValue = 57;

        binary_search(array, numberOfElementsInArray, searchingValue);

    }

    public static int binary_search(int array[], int numberOfElementsInArray, int searchingValue){
        int left, right, midIndex;
        left = 0;
        right = numberOfElementsInArray-1;

        while (left <= right){
            midIndex = (left+right)/2;
            if (array[midIndex] == searchingValue){
                return midIndex;
            }
            if (array[midIndex]<searchingValue){
                left = midIndex+1;
            }else {
                right = midIndex-1;
            }
        }
        return -1;
    }
}
