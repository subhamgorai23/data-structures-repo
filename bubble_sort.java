import java.util.Scanner;
public class bubble_sort {
    /*public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }*/
    public static void main(String[] args) {
        //int arr[]={4,2,12,9,5};
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //printArray(arr);
        System.out.println("Sorted elemnets are:");
        for(int element:arr){
            System.out.print(element+" ");
        }
    }
 }
