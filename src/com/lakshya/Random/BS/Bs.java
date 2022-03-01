package com.lakshya.Random.BS;

public class Bs {
    static int binarySearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        int mid=(start+end)/2;
  
        while(start<=end){
            if(arr[mid]==key){
                return mid;
  
            }
            else if(key>arr[mid]){
                start=mid+1;
            }
            else 
            end=mid-1;
        }
        return -1;
    }
  public static void main(String[] args) {
      int even[]={1,2,3,4,5,6};
      int odd[]={1,2,3,4,5};
      int index=binarySearch(even,1);
      System.out.println(index);
  }  
 
}
