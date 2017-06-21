import java.io.*;



class myCode
{
      int[] Data = new int[]{2 ,7,4,6,15,11,9,3};
      
       
public void SortInsertion() {
       for(int i=1;i<Data.length;i++) {                               
           int key = Data[i];                                         
           int j =i-1;                                                 
           // Move elements of arr[0....i-1] if they are greater than key
           while (j>=0 && Data[j]>key) {
               
                  
                   Data[j+1]=Data[j];            //swap element
                   j=j-1;                        // decrement j position
                   
           }Data[j+1]=key;                      // incrementing key  position by one
           
       }
}
    public void printArray() {
        for(int k=0;k<Data.length;k++) {
            System.out.println("--"+Data[k]+"--");
        }
} 


    public static void main (String[] args) throws java.lang.Exception
    {
     //System.out.println("Hello Java")
     myCode myObj= new myCode();
        myObj.printArray();
        myObj.SortInsertion();
        System.out.println("Sorted Array:-");
        myObj.printArray();
    