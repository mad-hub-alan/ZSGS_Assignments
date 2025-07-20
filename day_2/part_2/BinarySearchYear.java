import java.util.Scanner;

/*
 6. Write a program to accept the year of graduation from school as an integer value from the users . 
 Using the Binary search technique on the sorted array of integers given below . 
 Output the message “record exists" if the value input is located in the array 
 and if not output the message record does not exits”.
 {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002}
 */

public class BinarySearchYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter No.of Records to be stored : ");
        int recordsCount = input.nextInt();

        int[] records = new int[recordsCount];  // Array to store records

        for(int i=0; i<records.length; i++){
            System.out.println("Enter '"+(i+1)+"' Record : ");
            records[i] = input.nextInt();
        }

        quickSort(records,0,records.length-1);   // Sort the Given Array

        System.out.println("Enter the Year to Search : ");
        int targetYear = input.nextInt();

        System.out.println(binarySearch(records, targetYear)); // method call

        input.close();
    }

    // binary search method
    public static String binarySearch(int[] array,int target){
        int left = 0;
        int right = array.length-1;
        
        while(left <= right){
            int mid = (left+right)/2;

            if(array[mid] == target){
                return "Record Exist";
            }else if(array[mid] > target){
                right = mid -1;
            }else{
                left = mid+1;
            }
        }
        return "Record doesn't exist!";
    }

    // method for QuickSort
    public static void quickSort(int[] a, int beg, int end) {
        if (beg<end) { // when array size > 1
            int p = partition(a, beg, end);
            quickSort(a, beg, p-1);
            quickSort(a, p+1, end);
        }
    }

    public static int partition(int[] a, int beg, int end) {
        int pivot=end, low=beg, high=end-1;
        while(low<=high) {
            if (a[low]<a[pivot]) {
                low++;
            }
            else {
                swap(a, low, high);
                high--;
            }
        }
        swap(a, low, pivot);
        return low;
    }

    public static void swap(int[] a, int p1, int p2) {
        int temp = a[p1];
        a[p1] = a[p2];
        a[p2] = temp;
    }
}
