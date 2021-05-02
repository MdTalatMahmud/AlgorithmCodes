package linear_search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = new int[]{2,3,66,7,73,1,9,90,55,87,57,23,50,};
        int numberOfElementsInArray = 13;
        int searchingValue = 57;
        linearSearch(array, numberOfElementsInArray, searchingValue);
    }

    public static int linearSearch(int [] array, int numberOfElementsInArray, int searchingValue){
        int i;
        for (i=0; i<numberOfElementsInArray; i++){
            if (array[i] == searchingValue){
                return i;
            }
        }
        i = -1;
        return i;
    }
}
