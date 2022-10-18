import java.util.Scanner;
public class Q2 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of elements: ");
        int length = sc.nextInt(); //size of the array

        int[] arr=new int[length];
        for(int i = 0 ; i < length ; i++)
            arr[i] = sc.nextInt(); // input the array
        sc.close();

        int[] array_count = new int[21];
        for(int i = 0 ; i < length ;i++)
                array_count[arr[i]]++; // store the frequency of each element
        
    int[] cumulative_count = new int[21];
    int sum = 0;
    for (int i = 0;i<cumulative_count.length ; i++){
        sum += array_count[i];
        cumulative_count[i] = sum; // calculate the cumulative count of the elements from the array_count
    }

    int[] array_sorted = new int[length];
    for(int i =0 ; i<arr.length;i++){
        cumulative_count[arr[i]]--; // now apply the algorithm by going through the original array and then finding the position of element using cumulative count array
        array_sorted[cumulative_count[arr[i]]] = arr[i];
    }

    System.out.println("Sorted Array is: ");
    for(int i = 0 ; i < array_sorted.length ;i++){
        System.out.print(array_sorted[i]+" "); // print the array
    }
    }
}