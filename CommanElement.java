import java.io.*;
import java.util.*;
public class CommanElement {
        public static void Comman(int[] arr1, int[] arr2)
        {

            Set<Integer> set1 = new HashSet();
            Set<Integer> set2 = new HashSet();
            for (int i : arr1) {
                set1.add(i);
            }
            for (int i : arr2) {
                set2.add(i);
            }
            set1.retainAll(set2);
            System.out.println("Common elements- " + set1);
        }

        public static void main(String[] args)
        {
            int[] arr1 = { 34,2,54,67,9,54,6,2334,768,9};

            int[] arr2 = {3,64,456,86,2445,445,54,775,1};
            System.out.println("Array 1: " + Arrays.toString(arr1));

            System.out.println("Array 2: "
                    + Arrays.toString(arr2));
            Comman(arr1, arr2);
        }
    }

