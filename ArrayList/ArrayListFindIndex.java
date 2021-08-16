import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListFindIndex{
	Scanner input=new Scanner(System.in);

	public void index(){
		ArrayList<String> list= new ArrayList<String>();
		Scanner input= new Scanner(System.in);
		for(int run=0;run<4;run++){
		System.out.println("enter  one String");
		String string=input.next();
		list.add(string);
		}
        int print =list.indexOf(4);	
        System.out.println("arraylistIndex Of="+print);	
	    System.out.println("arraylistSize="+list.size());
	    System.out.println("arraylist="+list);
	}
	public static void main(String[] args){
		ArrayListFindIndex obj=new ArrayListFindIndex();
		obj.index();
	}
}
