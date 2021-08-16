import java.util.Scanner;
import java.util.ArrayList;

public class RemoveAll{
     
 Scanner input=new Scanner(System.in);
 
 	public void removeLong(){
 	ArrayList<Long> list=new ArrayList<Long>();	
      	for(int i=0; i<10;i++){
      	System.out.println("enter teh long value");
      	Long in=input.nextLong();
      	list.add(in);
      	}
      	System.out.println("before list="+list);
      	int len=list.size();
      	System.out.println("size  of arraylist="+len);
      	list.removeAll(list);
      	System.out.println("after list="+list);
      	int length=list.size();
      	System.out.println("after size="+length);
      	}
      	public static void main (String[] args){
         RemoveAll obj=new RemoveAll();
         obj.removeLong();
         }
         }
      	
   
