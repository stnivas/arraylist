import java.util.Scanner;
import java.util.ArrayList;

public class Check{
   Scanner input=new Scanner(System.in);
    
    public void checkList(){
       ArrayList<String> list=new ArrayList<String>();
       for(int i=0; i<5; i++){
       System.out.println("enter the string");
       String name=input.next();
       list.add(name);
        }
       
     System.out.println(list.contains(list));
     int length=list.size();
     System.out.println("sizr of arraylist"+length);
      System.out.println("arraylist"+list);
  }
   public static void main(String[] args){
     
	Check obj=new Check();
	obj.checkList();
	}
	}
	
   
	
