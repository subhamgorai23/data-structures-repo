// import java.util.Scanner;
// public class insertion_sort {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the size of array:");
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         System.out.println("Enter the elements off arr:");
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         //14__12,3,6,9,7
//         //-0-- 1,2,3,4,5
//         //-1,0--- 1,2,3,4,5
//         for(int i=1;i<arr.length;i++){
//             int temp=arr[i];
//             int j=i-1;
//             while(j>=0&&arr[j]>=temp){
//                 arr[j+1]=arr[j];
//                 j--;
//             }
//             arr[j+1]=temp;
//         }
//         for(int element:arr){
//             System.out.print(element+" ");
//         }
//     }
// }
import java.util.Scanner;
public class insertion_sort{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the elements:");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        //12,3,22,2.21
        for(int i=1;i<n;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        for(int element:arr){
            System.out.print(element+" ");
        }
    }
}