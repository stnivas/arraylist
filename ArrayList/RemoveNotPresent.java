import java.util.Scanner;
import java.util.ArrayList;

 public class RemoveNotPresent{
    Scanner input=new Scanner(System.in);
    
    public  void notPresent(){
    ArrayList<String> firstList= new ArrayList<String>();
    for(int i=0; i<5; i++){
    System.out.println("enter name to first");
    String name=input.next();
   firstList.add(name);
    }
    
    
   ArrayList<String> secondList= new ArrayList<String>();
    for(int i=0; i<5; i++){
    System.out.println("enter name second");
    String name=input.next();
    secondList.add(name);
    }
    firstList.retainAll(secondList);
    System.out.println("arrayList"+firstList);
    int len=firstList.size();
    System.out.println("size of first Array list"+len);
    System.out.println("arrayList"+secondList);
    int length=secondList.size();
     System.out.println("size of second  Array list"+len);
    }
    public static void main(String[] args){
    RemoveNotPresent obj=new RemoveNotPresent();
    obj.notPresent();
    }
    }
    
