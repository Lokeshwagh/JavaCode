import java.util.HashMap;
public class UniqueElement {
        public static void main(String args[]) {
            int arrayWithDuplicates[] = {3,4,3,6,8,3,76,7};
            HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
            for (int j = 0; j < arrayWithDuplicates.length; j++) {
                hashmap.put(arrayWithDuplicates[j], j);
            }

            System.out.println(hashmap.keySet());

        }
    }

