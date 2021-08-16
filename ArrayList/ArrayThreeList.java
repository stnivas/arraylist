import java.util.ArrayList;
import java.util.Scanner;

public class ThreeList{
  Scanner input=new Scanner(System.in);
  
	
	public void listThree(){
	
	ArrayList<String> list=new ArrayList<String>();
	for(int run=0; run<5;run++){
	System.out.println("Enter the five name");
	String name=input.next();
	list.add(name);
	}
	
	ArrayList<String> listTwo=new ArrayList<String>();
	for(int run=0; run<3;run++){
	System.out.println("Enter the three name");
	String nameTwo =input.next();
	listTwo.add(nameTwo);
	}
	
	ArrayList<String> listThree=new ArrayList<String>();
	listThree.addAll(listTwo);
	listThree.addAll(list );
	System.out.println("array third list"+listThree);
	int len=listThree.size();
	//System.out.println("first List+"+list);
	//System.out.println("array second list"+listTwo);
	System.out.println("arrrayList size"+len);
       }
	
	public static void main(String[] args){
	ArrayListThree obj=new ArrayListThree();
	obj.listThree();
	}
}	
	


	


