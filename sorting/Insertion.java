public class Insertion {
    public static void sorting(int[] arr)
    {
        int len=arr.length;
        for(int i=1;i<len;i++)
        {
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
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
        int[] arr={3,4,63,2,1,35,76,-12,-6,90};
        sorting(arr);
        display(arr);
    }
}
