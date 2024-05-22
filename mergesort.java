//Follows DAC so we can say it a recursive algorithm

import java.util.Scanner;
public class mergesort{
    public static void conquer(int arr[],int l,int mid,int r){
        int merged[]=new int[r-l+1];
        int indx1=l;
        int indx2=mid+1;
        int x=0;
        while(indx1<=mid && indx2<=r){
            if(arr[indx1]<=arr[indx2]){
                merged[x++]=arr[indx1++];
            }else{
                merged[x++]=arr[indx2++];
            }
        }
        while(indx1<=mid){
             merged[x++]=arr[indx1++];
        }
        while(indx2<=r){
            merged[x++]=arr[indx2++];
        }
        for(int i=0,j=l;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }
    }
    public static void divide(int arr[],int l,int r){
        if(l>=r){
            return;
        }
        int mid =(l+r)/2;
        divide(arr, l, mid);
        divide(arr, mid+1, r);
        conquer(arr,l,mid,r);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
        System.out.println("the sorted elements are:");
        divide(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
  
           