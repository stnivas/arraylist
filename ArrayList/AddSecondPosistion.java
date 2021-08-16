import java.util.Scanner;
import java.util.ArrayList;

public class AddSecondPosistion {
     Scanner input=new Scanner(System.in);
     
	public void adding(){
	
	 ArrayList<String> list=new ArrayList<String>();
	 for(int run=0; run<5;run++){
	 System.out.println("enter the string");
	 String string=input.nextLine();
	 list.add(string);
	 }
	 System.out.println("enter the one string");
	 String add=input.next();
	 list.add(2 , add);
	 
	 System.out.println("arrayList="+list);
	 int len=list.size();
	 System.out.println("arrayList size="+len); 
	 
	  }
	 
	 public static void main(String[] args){
	   AddSecondPosistion obj=new AddSecondPosistion();
	   obj.adding();
	   }
	   }
