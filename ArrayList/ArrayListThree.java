import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListThree {
  Scanner input=new Scanner(System.in);
  
	
	public void listThree(){
	
	ArrayList<String> list=new ArrayList<String>();
	for(int run=0; run<3;run++){
	System.out.println("Enter the five String");
	String string =input.next();
	list.add(string);
	}
	
	ArrayList<String> listTwo=new ArrayList<String>();
	for(int run=0; run<5;run++){
	System.out.println("Enter the three String");
	String two =input.next();
	listTwo.add(two);
	}
	
	ArrayList<String> listThree=new ArrayList<String>();
	listThree.addAll(list );
	listThree.addAll(listTwo);
	System.out.println("array third list"+listThree);
	System.out.println("firstList+"+list);
	System.out.println("array second list"+listTwo);
       }
	
	public static void main(String[] args){
	ArrayListThree obj=new ArrayListThree();
	obj.listThree();
	}
}	
	


	


