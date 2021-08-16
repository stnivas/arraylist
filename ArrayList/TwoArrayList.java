import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoArrayList{
   Scanner input=new Scanner(System.in);
   
	public void twoArray(){
	ArrayList<String> list=new ArrayList<String>();
	for(int run=0;run<10;run++){
	System.out.println("please enter the 10 string");
	String string=input.next();
	list.add(string);
	}
	
	List<String> listTwo=new ArrayList<String>();
	listTwo=list.subList(3,9);
	//list.add(in);
        System.out.println(listTwo);
        }
        public static void main(String[] args){
        TwoArrayList obj=new TwoArrayList();
        obj.twoArray();
        }
        }
	
       
