import java.util.Scanner;
public class Linear{
    public static int Searching(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return key;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the element to search");
        int key=in.nextInt();
        int arr[]={1,2,3,4,5,6,7};
        System.out.println("The key is found at:"+Searching(arr, key));
        in.close();
    }
}