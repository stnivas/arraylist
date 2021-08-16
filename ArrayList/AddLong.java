import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class AddLong extends ArrayList<Long>{
  
   Scanner input=new Scanner(System.in);
    
    public void remove(){
     AddLong list=new AddLong();
     for(int i=0; i<10;i++){
     System.out.println("enter the long value");
     Long in=input.nextLong();
     list.add(in);
     }
    list.removeRange(4,8);
     
     int len=list.size();
     System.out.println("Arraylist size"+len);
     System.out.println("Arraylist"+list);
     }
     
     public static void main(String[] arggs){
     AddLong obj=new AddLong();
     obj.remove();
     }
     }
     
