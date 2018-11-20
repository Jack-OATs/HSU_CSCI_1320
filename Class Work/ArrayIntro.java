public class ArrayIntro {
    public static void main(String[] args) {
        int[] intArray = new int[3];        //how to declare an array
        int[] array2 = {1,2,4,5,72,32,41};  //how to declare an array
        System.out.println("array2 length = " + array2.length);
        
     for(int i = 0; i < array2.length; i++) {
         System.out.println(array2[i]);
     }   
    }
}