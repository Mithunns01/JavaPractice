package javapractice;

public class quickSort 
{
    public static int partition(int arr[], int low, int high)
    {
        int i = low-1;
        int pivot = arr[high];

        for(int j=low; j<high; j++)
        {
                if(arr[j]<pivot)
                {
                    i++;
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j] =temp;
                }
        }

        i++;
        int temp = arr[i];
        arr[i] =pivot;
        arr[high]=temp;
        return i;

    }
    public static void quickS(int arr[], int low, int high)
    {
        if(low<high)
        {
            int pidx = partition(arr, low, high);
            quickS(arr, low, pidx-1);
            quickS(arr, pidx+1, high);
        }
    }
    public static void main(String [] args)
    {
        int arr[] = {9,6,45,3,2,6,8,4};
        int n = arr.length;

        quickS(arr, 0, n-1);

        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
         
    }
}
