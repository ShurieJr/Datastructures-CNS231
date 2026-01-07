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

    //bubble sort
    static void bubbleSort(int[] data){
        int size = data.length;
        int temp;
        for(int index=size-1; index>=0; index--){
            for(int scan =0; scan<index ; scan++){
                if(data[scan] > data[scan+1]){
                    //swap
                    temp=data[scan];
                    data[scan] = data[scan+1];
                    data[scan+1] = temp;
                }
            }
        }

    }
    //bubble sort (generic)
    static <T extends Comparable<T>> void genericBubbleSort(T[] data){
        int size = data.length;
        T temp;
        for(int index=size-1; index>=0; index--){
            for(int scan =0; scan<index ; scan++){
                if(data[scan].compareTo(data[scan+1]) > 0){
                    //swap
                    temp=data[scan];
                    data[scan] = data[scan+1];
                    data[scan+1] = temp;
                }
            }
        }

    }

    //Insertion Sort
    static void insertionSort(int[] data){
        int size = data.length;
        int value;
        int position;
        for(int index = 1; index < size;  index++){
            value = data[index];
            position = index;
            while(position > 0 && (value < data[position-1])){
                //shifting elements to the right
                data[position] = data[position-1];
                position--;
            }
            data[position] = value;
        }
    }


    //main method
    static void main() {
        int[] marks = {10 , 3,11,7,100 , 34 ,5};
//        Integer[] marks = {10 , 3,11,7,100 , 34 ,5};
//        String[] names = {"Osman","Farah" , "Ali" , "Gedi","Warsame"};
//        Character[] letters = {'F' , 'E' , 'A' , 'C'  ,'D'};
        System.out.println("unsorted:");
        System.out.println(Arrays.toString(marks));
//        System.out.println(Arrays.toString(names));
//        System.out.println(Arrays.toString(letters));

//        Sorting.<Integer>genericSelectionSort(marks);
//        Sorting.<String>genericSelectionSort(names);
//        Sorting.<Character>genericSelectionSort(letters);
        insertionSort(marks);
//        genericBubbleSort(names);
//        genericBubbleSort(letters);

        System.out.println("Sorted:");
        System.out.println(Arrays.toString(marks));
//        System.out.println(Arrays.toString(names));
//       System.out.println(Arrays.toString(letters));
    }
}
