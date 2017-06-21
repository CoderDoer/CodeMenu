// package whatever; // don't place package name!

import java.io.*;



class myCode
{
     int temp;
      
       
public void SortQuick(int[] Array, int left, int right) {
    
    
    if(left>=right) {
        return;
     }
    
    int pivot= Array[(left+right)/2];         // Median as Pivot
    int index = partition(Array, left, right, pivot);   // index as the next partition point for recursion
    SortQuick(Array, left, index-1);
    SortQuick(Array,index,right);
    
}
    public int partition(int[] Array, int left, int right, int pivot) {
        while(left<=right) {
            while (Array[left]<pivot) {
                left++;
            }
            while (Array[right]>pivot) {
                right--;
            }
            
            if(left<=right) {         // swapping ifof left index is lower than right index
                
                temp =Array[right];
                Array[right]=Array[left];
                Array[left] = temp;
                left++;
                right--;
            }
        
        } return left;   // Since left is either = or one greater than> right, and the pivot is sorted.
    }
    
    
    public void printArray(int[] Data) {
        for(int k=0;k<Data.length;k++) {
            System.out.println("--"+Data[k]+"--");
        }
    } 


    public static void main (String[] args) throws java.lang.Exception
    {
      int[] Data_Array = new int[]{2 ,7,4,6,15,11,9,3};
      myCode myObj= new myCode();
        myObj.printArray(Data_Array);
        myObj.SortQuick(Data_Array, 0,Data_Array.length-1);
        System.out.println("Sorted Array:-");
        myObj.printArray(Data_Array);
    
            
    }
}

