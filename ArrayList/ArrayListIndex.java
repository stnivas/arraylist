import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;


public class ArrayListIndex{
	Scanner input=new Scanner(System.in);

	public void index(){
		ArrayList<String> list= new ArrayList<String>();
		Scanner input= new Scanner(System.in);
		
		for(int run=0;run<5;run++){
		System.out.println("enter   String");
		String string=input.next();
		list.add(string);
		}
      
	  
		System.out.println("enter the index");
		int in=input.nextInt();
		String number=list.get(in);
		int len=number.length();
      	
		System.out.println("length of string"+len);
	    System.out.println("arraylistSize="+list.size());
	    System.out.println("arraylist="+list);
	}
	public static void main(String[] args){
		ArrayListIndex obj=new ArrayListIndex();
		obj.index();
	}
}
