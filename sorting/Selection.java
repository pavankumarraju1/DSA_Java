public class Selection {
    public static void Sorting(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int min_idx=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min_idx])
                {
                    min_idx=j;
                }
            }
            int temp=arr[min_idx];
            arr[min_idx]=arr[i];
            arr[i]=temp;
        }
    }
    public static void display(int[] arr)
    {
        System.out.print("The sorted elements are:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,4,7,93,23,487,-12,-23,6};
        Sorting(arr);
        display(arr);
    }    
}
