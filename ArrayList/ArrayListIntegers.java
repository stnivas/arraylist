import java.util.Scanner;
import java.util.ArrayList;

  	public class ArrayListIntegers{
  	 
  	 	public static void main (String[] args){
  	 	  Scanner input=new Scanner(System.in);
  	 	  ArrayList<Integer> list=new ArrayList<Integer>();
  	 	  System.out.println("please enter any 5 values");
  	 	  for(int run=0; run<5;run++){
  	 	  System.out.println("enter number");
  	 	    int  values=input.nextInt();
  	 	  list.add(values);
  	 	  }
  	 	  int len =list.size();
  	 	  System.out.println("size of Integer arraylist="+len);
  	 	  System.out.println(list);
  	 	  }
  	 	  }
  	 	  
  	 	  
  	 	  
  	 	  
