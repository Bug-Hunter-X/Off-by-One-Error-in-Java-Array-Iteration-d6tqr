public class MyClass {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) { // Corrected condition
            array[i] = i * 2;
        }
        for (int num : array) {
            System.out.println(num);
        }
    }
}