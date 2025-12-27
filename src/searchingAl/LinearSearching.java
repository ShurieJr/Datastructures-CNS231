package searchingAl;

public class LinearSearching<T> {
    static <T extends Comparable<T>> boolean search(T[] data , T target){
        int index = 0;
        int max = data.length-1;
        boolean found =false;
        while (!found && index <= max){
            //if(data[index].equals(target))
            System.out.println("steps..." + index);
            if((data[index].compareTo(target)) == 0)
                found = true;
            else if((data[index].compareTo(target)) > 0)
                break;
            index++;
        }
        return found;
    }

    static void main() {
        Integer[] numbers = {1,3,7,9,60};
       boolean result= LinearSearching.<Integer>search(numbers , 8);
       if(result)
       System.out.println("found..");
       else
       System.out.println("not found..");
    }
}
