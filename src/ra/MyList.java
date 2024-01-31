package ra;

import java.util.Arrays;
import java.util.Comparator;

public class MyList{
    public static <T> int indexOfLinearSearch(T[] array , T value){
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(value)){
                return i;
            }
        }
        return -1;
    }
    public static <T extends Comparable<T>> int indexOfBinarySearchWithComparable(T[] array , T value){
        int start = 0;
        int end = array.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (array[mid].compareTo(value)==0){
                return mid;
            }
            if (array[mid].compareTo(value)<0){
                // duyệt bên tay phải
                start = mid+1;
            }else {
                // duyệt bên tay trái
                end = mid-1;
            }
        }
        return -1;
    }
    public static <T> int indexOfBinarySearchWithComparator(T[] array , T value, Comparator<T> comparator){
        int start = 0;
        int end = array.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (comparator.compare(array[mid],value)==0){
                return mid;
            }
            if (comparator.compare(array[mid],value)<0){
                // duyệt bên tay phải
                start = mid+1;
            }else {
                // duyệt bên tay trái
                end = mid-1;
            }
        }
        return -1;
    }

}
