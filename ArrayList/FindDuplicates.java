import java.util.Scanner;
import java.util.ArrayList;

public class FindDuplicates{
	
       public void duplicate(){
         ArrayList<String> list=new ArrayList<String>();
          Scanner input=new Scanner(System.in);
          for(int run=0; run<5; run++){
          System.out.println("please enter the five String");
          String name=input.next();
          list.add(name);
          }
          if(list==list){
       System.out.println(list.indexOf(hari));
          }
          else{
          System.out.println("no duplicate element");
          }
          }
          public static void main(String[] args){
          
            FindDuplicates obj=new  FindDuplicates();
            obj.duplicate();
              }
            }
          
          
