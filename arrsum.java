package javapractice;

public class arrsum {
    
        public static int[] sumArrays(int[] array1, int[] array2) {
            if (array1.length != array2.length) {
                throw new IllegalArgumentException("Arrays must be of the same length");
            }
    
            int[] result = new int[array1.length];
            for (int i = 0; i < array1.length; i++) {
                result[i] = array1[i] + array2[i];
            }
    
            return result;
        }
    
        public static void main(String[] args) {
            int[] array1 = {1, 2, 3, 4, 5};
            int[] array2 = {6, 7, 8, 9, 10};
            int[] sumArray = sumArrays(array1, array2);
    
            System.out.print("Sum of arrays: ");
            for (int num : sumArray) {
                System.out.print(num + " ");
            }
        }
    }
    
    
