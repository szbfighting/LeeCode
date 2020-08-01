package com.leecode.sort;

public class GuiBing {
    public static void main(String[] args) {
        int[] arr = { 49, 38, 65, 97, 76, 13, 27, 50 };
        int[] temp = new int[arr.length];
        customMergeSort(arr,temp,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void customMergeSort(int[] a,int[] temp,int start,int end){
        if (start<end){
            int mid = (start+end)/2;
            customMergeSort(a,temp,start,mid);
            customMergeSort(a,temp,mid+1,end);
            customDoubleMerge(a,temp,start,mid,end);
        }
    }

    public static void customDoubleMerge(int[] a,int[] temp,int left,int mid,int right){
        int p1 = left,p2 = mid+1,k=left;
        while (p1<=mid&&p2<=right){
            if (a[p1]<a[p2]){
                temp[k++]=a[p1++];
            }else{
                temp[k++]=a[p2++];
            }
        }
        while(p1<=mid){
            temp[k++]=a[p1++];
        }
        while (p2<=right){
            temp[k++]=a[p2++];
        }

        for (int i = left;i<=right;i++){
            a[i]=temp[i];
        }
    }
}
