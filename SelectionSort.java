import java.util.*;
class SelectionSort {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of array");
   
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<n-1;i++)
    {
        int min=i;
        for(int j=i+1;j<n;j++)
        {
            if(arr[j]<arr[min])
            {
                min=j;
            }}
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        
    }
    for(int i=0;i<n;i++)
    {
        System.out.print(arr[i]+" ");
    }
}
}