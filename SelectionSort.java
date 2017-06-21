     import java.io.*;



class myCode
{
      int[] Data = new int[]{2 ,7,4,6,15,11,9,3};
      
       
public void SortSelection() {
    int MIN_IDX;

    int temp;
   
    
    for (int i=0;i<Data.length; i++) {
        MIN_IDX= i;
        
        for (int j=i+1;j<Data.length;j++) {
            if(Data[MIN_IDX]>Data[j]) {
              
                MIN_IDX=j;
            }
            
        }
                   temp=Data[MIN_IDX];
              Data[MIN_IDX]=Data[i];
                      Data[i] = temp;
           
        
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
        myObj.SortSelection();
        System.out.println("Sorted Array:-");
        myObj.printArray();
    
            
    }
}