//12,2,11,4,9
import java.util.Scanner;
public class selection_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of arr:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the arr:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //smallest find:
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            //swap:
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        for(int element:arr){
            System.out.println(element+" ");
        }
    }
}