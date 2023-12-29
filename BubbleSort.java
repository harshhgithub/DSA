import java.util.*;
class SelectionSort {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    //Input the unsorted array 
    System.out.println("Enter size of array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    //Bubble Sort Code 
    boolean swapped;
    for(int i=0;i<n-1;i++)
    { 
        swapped=false;
        for(int j=i+1;j<i-i-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swapped =true;
            }
        }
        if(swapped==false)
        {
         break;
        }
    }
    //Print the sorted array
    for(int i=0;i<n;i++)
    {
        System.out.println(arr[i]+" ");
    }
}