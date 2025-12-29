package searchingAl;

public class BinarySearching<T > {
    //main method
    static void main() {
        Integer[] marks={10 , 30 , 56 , 78 , 90 };

      boolean result= BinarySearching.<Integer>search(marks , 9);

      if(result)
          System.out.println("Marks found!");
      else
          System.out.println("marks not found!");
    }

    static <T extends Comparable<T>> boolean search(T[] list , T target){
        int low = 0;
        int high = list.length-1;
        boolean found = false;
        //
        while(!found && low<=high){
            int mid = (low + high) /2;
            if(list[mid].compareTo(target) == 0)
                found =true;
            else if(list[mid].compareTo(target) > 0)
                high = mid-1;
            else
                low = mid+1;
        }
        return found;
    }
}
