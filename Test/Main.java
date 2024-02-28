public class Main {
    
    public static void main(String[] args){
        int[] numbers = {2, 4, 12, 7, 23, 44, 5, 9, 7, 11, 10, 3};
        // Use the numbers array to print the following sums: 9, 56, 24, 100
        // The first one (9) has been done for you

        System.out.println(numbers[0]+numbers[3]);
        System.out.println(numbers[2]+numbers[5]);
        System.out.println(numbers[0]+numbers[2]+numbers[numbers.length - 2]);
        System.out.println(numbers[0]+numbers[3]);
    }

}
