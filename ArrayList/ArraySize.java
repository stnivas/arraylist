import java.util.ArrayList;
import java.util.Scanner;
	
	public class ArraySize{
		
		public static void main (String[] args){
			Scanner input=new Scanner(System.in);
			ArrayList<String> list=new ArrayList<String>();
			System.out.println("please enter name maximun 5;");
		 
		       for(int run=0; run<5;run++){
			System.out.println("please enter your name");
			String nameList=input.next();
			list.add(nameList);
			}
			int len =list.size();
			System.out.println("ArrayList:"+list);
			System.out.println("the size of List is:"+len);
			}
			}
