//For Binary Search Array must be the sorted or sort the given array and then use binary search 

//Code for Binary Search 
import java.util.*;
class BinarySearch {
    public static int search(int arr[], int low, int high,int x) {
    low=0;
    high=arr.length-1;
    while(low<=high)
    {
        int mid=low+(high-low)/2;
        if(arr[mid]==x)
        {
            return mid;
        }
        if(arr[mid]<x)
        {
            return search(arr,mid+1,high,x);
        }
        else {
            return search(arr,low,mid-1,x);
        }
    }
    return -1;
    }

public static void main(String args[]) 
    { 
        int arr[] = { 2, 3, 4, 5, 40 }; 
        int x = 40; 
  
        // Function call 
        int result = search(arr, 0,arr.length-1, x); 
        if (result == -1) 
            System.out.print( 
                "Element is not present in array"); 
        else
            System.out.print("Element is present at index "
                             + result); 
    }

}
