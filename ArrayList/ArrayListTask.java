import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTask{
	Scanner input=new Scanner(System.in);

	public void first(){
	  ArrayList<String> list= new ArrayList<String>();
	  
	  System.out.println("arraylistSize="+list.size());
	  System.out.println("arraylist="+list);
	}
	public void second(){
		ArrayList<String> listTwo= new ArrayList<String>();
		Scanner input= new Scanner(System.in);
		for(int run=0;run<5;run++){
		System.out.println("enter any five String");
		String string=input.next();
		listTwo.add(string);
		}		
	    System.out.println("arraylistSize="+listTwo.size());
	    System.out.println("arraylist="+listTwo);
	}
	public void third(){
		ArrayList<Integer>listThird=new ArrayList<Integer>();
		for(int run=0;run<5;run++){
		System.out.println("enter any five number");
		int number=input.nextInt();
		listThird.add(number);
		}	
        System.out.println("arraylistSize="+listThird.size());
	    System.out.println("arraylist="+listThird);
	}
		
	public static void main(String[] args){
		ArrayListTask obj=new ArrayListTask();
		obj.first();
		obj.second();
		obj.third();
	}
	
}
	  