package SortingAlgorithms;

import java.util.Arrays;

public class Sorting {
    //selection sort  (only integer)
    static void selectionSort(int[] data){
        int size = data.length;
        int min;
        for(int index=0; index < size-1; index++){
            min = index;
            for(int scan =index+1; scan < size; scan++){
                if(data[scan] < data[min])
                    min =scan;
            }
            //swap
            int temp = data[index];
            data[index] = data[min];
            data[min] = temp;
        }
    }

    //generic selection sort
    static <T extends Comparable<T>> void genericSelectionSort(T[] data){
        int size = data.length;
        int min;
        for(int index=0; index < size-1; index++){
            min = index;
            for(int scan =index+1; scan < size; scan++){
                if(data[scan].compareTo(data[min]) < 0)
                    min =scan;
            }
            //swap
            T temp = data[index];
            data[index] = data[min];
            data[min] = temp;
        }
    }

    //main method
    static void main() {
        Integer[] marks = {10 , 3,11,7,100};
        String[] names = {"Osman","Farah" , "Ali" , "Gedi","Warsame"};
        Character[] letters = {'F' , 'E' , 'A' , 'C'  ,'D'};
        System.out.println("unsorted:");
        System.out.println(Arrays.toString(marks));
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(letters));

        Sorting.<Integer>genericSelectionSort(marks);
        Sorting.<String>genericSelectionSort(names);
        Sorting.<Character>genericSelectionSort(letters);

        System.out.println("Sorted:");
        System.out.println(Arrays.toString(marks));
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(letters));
    }
}
