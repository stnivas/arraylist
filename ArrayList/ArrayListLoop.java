import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;


public class ArrayListLoop{
	Scanner input=new Scanner(System.in);

	public void loop(){
		ArrayList<String> list= new ArrayList<String>();
		Scanner input= new Scanner(System.in);
		for(int run=0;run<5;run++){
		System.out.println("enter   String");
		String string=input.next();
		list.add(string);
		}
        Iterator itr=list.iterator();
		while(itr.hasNext()){
		System.out.println("list elements" itr.next());
      	}
	    System.out.println("arraylistSize="+list.size());
	    System.out.println("arraylist="+list);
	}
	public static void main(String[] args){
		ArrayListLoop obj=new ArrayListLoop();
		obj.loop();
	}
}
