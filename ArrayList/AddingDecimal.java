import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;


public class AddingDecimal{
 
	public void adding(){
	 ArrayList<Double> list=new ArrayList<Double>();
	 Scanner input=new Scanner(System.in);
	 for(int run=0; run<5; run++){ 
	 try{
	 System.out.println("print the value");
	 double value=input.nextDouble();
	  list.add(value);
	  }
	 
	  catch(InputMismatchException e){
	  System.out.println("please enter the decimal value");
	  break;
	 
	  }
	}
	  System.out.println("enter index 0 to 4");
	  int in=input.nextInt();
	   
	try { 
	  System.out.println("REMOVED VALUE "+list.remove(in));
	} 
	catch(IndexOutOfBoundsException e) {
	System.out.println("arraylist con't removed because your giveing wrong input");
 
	}
	
	System.out.println("arrayList="+list);
	  int len=list.size();
	  System.out.println("size of array list="+len);
	  }
	 
	  public static void main(String[] args){
	  AddingDecimal obj=new AddingDecimal();
	  obj.adding();
	  }
}
