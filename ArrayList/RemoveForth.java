import java.util.Scanner;
import java.util.ArrayList;

public class RemoveForth{
	
	Scanner input=new Scanner(System.in);
	
	public void remove(){
	ArrayList<Double> list =new ArrayList<Double>();
	for(int i=0; i<5; i++){
	System.out.println("enter the value");
	double value=input.nextDouble();
	list.add(value);
	}
	
     System.out.println("removed element"+ list.remove(3));
      System.out.println("arrayList="+list);
      int len=list.size();
      System.out.println("size of arrayList="+len);
      
      }
      public static void main(String[] args){
      RemoveForth obj=new RemoveForth();
      obj.remove();
      
      }

}	
	
