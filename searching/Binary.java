import java.util.*;
public class Binary {
    public static int Searching(int[] arr,int key)
    {
        int first=0;
        int last=arr.length-1;
        int mid=(first+last)/2;
        while(first<=last)
        {
            if(arr[mid]<key)
            {
                first=mid+1;
            }
            else if(arr[mid]==key)
            {
                // System.out.println("The element is found at:"+mid+1);
                return mid+1;
            }
            else
            {
                last=mid-1;
            }
            mid=(first+last)/2;
        }
        return 0;
    }
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       System.out.println("Enter the searching element");
       int key=in.nextInt();
       int arr[]={10,15,20,30,45,66,78,98,99};
        System.out.println("The element found at:"+Searching(arr,key));
        in.close();
    }
}
