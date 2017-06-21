import java.io.*;


class myCode
{
    
int[] Array = new int[]{2,5,8,12,3,5,1,7,16,9};

public void printarray() {
    System.out.println("---------------------------------");
for (int i=0; i<Array.length;i++)
    {
System.out.print(" | "+Array[i]+" | ");
}
    System.out.println("----------------------------------");
            
}
public void SortBubble() {
    int temp;
    for (int i=Array.length-1;i>1;i--) {
        for(int j=0; j<i;j++) {
            if (Array[j]>Array[j+1]) {
                temp = Array[j];
                Array[j]=Array[j+1];
                Array[j+1]=temp;
            }
        }
    }
    
}

    public static void main (String[] args) throws java.lang.Exception
    {
     //System.out.println("Hello Java")
                myCode myObj = new myCode();
                myObj.printarray();
                myObj.SortBubble();
                myObj.printarray();
    }
}