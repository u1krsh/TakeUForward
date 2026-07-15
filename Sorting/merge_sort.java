//package Sorting;
//import java.util.Arrays;
//import java.util.Scanner;
//public class merge_sort {
//    static void merge(int[] arr, int low, int mid, int high){
//    int[] array;
//    int left = low;
//    int right = mid+1;
//
//    while(left <= mid && right <= high){
//        if (arr[left] <= arr[right]){
//            array.add(arr[left]);
//            left++;
//        }
//        else{
//            array.add(arr[right]);
//            right++;
//
//        }
//    }
//    while(left <= mid){
//        array.add(arr[left]);
//        left++;
//
//    }
//    while(right <= high){
//        array.add(arr[right]);
//        right++;
//    }
//
//    }
//
//
//    static void mrg_srt(int[] arr,int low,int high){
//        if( low >= high){ return;}
//        int mid = (low+high) /2;
//        mrg_srt(arr, low, mid);
//        mrg_srt(arr,mid+1,high);
//        merge(arr, low, mid, high);
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
