import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;


public class ArrayTasks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] numbers = {2,5,8,3,4,6,10,15,20,1,11};
        System.out.println("Array:" + Arrays.toString(numbers));

        //Task 1 - Identify the index of a given value
        System.out.println("Enter a number from the numbers array");
        int number;
        number = sc.nextInt();

        for(int num = 0; num < numbers.length; num++){
            if(number == numbers[num]){
                System.out.println("The index of " + number + " is "+num );
            }
        }


        //Task 2 - Swapping values in array

        System.out.println("Enter first index of the number to be swapped ");
        int numOne = sc.nextInt();

        System.out.println("Enter the index of the number to be swapped with");
        int numTwo = sc.nextInt();

        System.out.println("elements in array:" );
        for(int n:numbers){
            System.out.println(n);
        }

        int num = numbers[numOne];
        numbers[numOne] = numbers[numTwo];
        numbers[numTwo] = num;
        System.out.println(" ");

        for(int digit :numbers) {
            System.out.println(digit);
        }


        //task 3 - sort values in ascending and descending order.
        Integer [] numberList ={2,5,8,3,4,6,10,15,20,1,11};
        //Ascending order
        Arrays.sort(numberList);
        System.out.println("Numbers array sorted in ascending order: "+ Arrays.toString(numberList));


        //Descending order
        Arrays.sort(numberList,Collections.reverseOrder());
        System.out.println("Numbers array sorted in descending order: "+ Arrays.toString(numberList));


        //Task 4 - Linear search
        System.out.println("Enter a number (Linear search): ");
        int num1 = sc .nextInt();

        for(int i=0;i<numbers.length;i++) {
            if (num1 == numbers[i]) {
                System.out.println("Found" + numbers[i] + " at index " + i);
            }
        }

        //Binary Search
        Arrays.sort(numbers);
        System.out.println("Sorted array " + Arrays.toString(numbers));

        System.out.println("Enter a number to search(Binary)");
        int num2= sc.nextInt();

        // Perform binary search for the specified values
        int output = Arrays.binarySearch(numbers,num2);
        if(output >= 0){
            System.out.println(num2 + " found at index " + output);
        }
    }

}