//For Binary Search Array must be the sorted or sort the given array and then use binary search 

//Code for Binary Search 
import java.util.*;
class BinarySearch {
    public static int search(int arr[], int n, int x) {
    int low=0;
    int high=arr.length-1;
    while(low<=high)
    {
        int mid=low+(high-low)/2;
        if(arr[mid]==x)
        {
            return mid;
        }
        if(arr[mid]<x)
        {
            low=mid+1;
        }
        else {
            high=mid-1;
        }
    }
    return -1;
    }

public static void main(String args[]) 
    { 
        int arr[] = { 2, 3, 4, 5, 40 }; 
        int x = 3; 
  
        // Function call 
        int result = search(arr, arr.length, x); 
        if (result == -1) 
            System.out.print( 
                "Element is not present in array"); 
        else
            System.out.print("Element is present at index "
                             + result); 
    }

}