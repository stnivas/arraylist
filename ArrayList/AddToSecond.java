import java.util.Scanner;
import java.util.ArrayList;

 public class AddToSecond{
    Scanner input=new Scanner(System.in);
    
    public  void adding(){
    ArrayList<String> list= new ArrayList<String>();
    for(int i=0; i<5; i++){
    System.out.println("enter name to first");
    String name=input.next();
    list.add(name);
    }
    
    
   ArrayList<String> listTwo= new ArrayList<String>();
    for(int i=0; i<5; i++){
    System.out.println("enter name second");
    String name=input.next();
    listTwo.add(name);
    }
    list.removeAll(listTwo);
    System.out.println("arrayList"+list);
    int len=list.size();
    System.out.println("size of Array list"+len);
    }
    public static void main(String[] args){
    AddToSecond obj=new AddToSecond();
    obj.adding();
    }
    }
    
