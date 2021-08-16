import java.util.Scanner;
import java.util.ArrayList;

    public class CustomObject{
    
        public static class Note{
         int size;
         int pageNumber;
         String name;
         
         public String toString() {
         return name + " " + size + " " + pageNumber;
         }
         
         
	}
	public static void main(String[] args){
	   Note obj=new Note();
	   ArrayList<Object> list= new ArrayList<>();
	   list.add(obj);

	  
	   System.out.println("arrayList="+list);
	   System.out.println("size of Arraylist="+list.size());
	   
	     }
	   }
	   
	   
