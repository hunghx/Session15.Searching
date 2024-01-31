import ra.MyList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] arrString = {"hùng","nam","sơn","anh","ngọc","đức"};
        System.out.println(MyList.indexOfLinearSearch(arrString,"nam"));
        System.out.println(MyList.indexOfLinearSearch(arrString,"duc"));

        Integer[] arrayInt = {1,2,3,4,5};
        System.out.println(MyList.indexOfLinearSearch(arrayInt,5));

        Arrays.sort(arrString);
        System.out.println(MyList.indexOfBinarySearchWithComparable(arrString,"đức"));
        System.out.println(MyList.indexOfBinarySearchWithComparable(arrString,"khánh"));

        System.out.println(MyList.indexOfBinarySearchWithComparator(arrString,"đức", Comparator.naturalOrder()));
        // O(2n^2)= 2.O(n^2) = O(n^2)
        // vòng lặp
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(i);
            for (int j = 0; j < arrString.length; j++) {
                System.out.println(j);
            }
        }  // O(n^2)
        arrayInt = new Integer[]{1,2,3};   // O(1)

        // O(n)
        List<String> list = new ArrayList<>();
        list.stream().sorted(Comparator.comparingInt(String::length).reversed()).findFirst();

    }
}