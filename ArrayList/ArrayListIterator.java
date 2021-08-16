import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
	
	
	public class ArrayListIterator{
	   
	        public static void main(String[] args){
	              ArrayList<String > list=new ArrayList<String>();
	              Scanner input=new Scanner(System.in);
	              
	                for(int run=0; run<5; run++){
	                 System.out.println("please enter your nam");
	                 String name=input.next();
	                 list.add(name);
	                 }
	               Iterator itr=list.iterator();
	                while(itr.hasNext())
	                System.out.println(itr.hasNext);
	                System.out.println(itr.next());
	                }
	                }
	         
