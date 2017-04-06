import java.util.*;
/**
 * Abstract class ExamTest - 
 * This did not work out.
 * @author (Jon)
 * @version (2)
 */
public abstract class ExamTest
{
   // Instance variables -
   
   public Map <Integer, Set<Questions>> test = new HashMap<>();
   
   /**
    * TO hold question Numbers 
    */
   public abstract void questionNumber ();
   
   /**
    * Just to print out set 
    */
   public static void printSet(Set questions){
      
      System.out.println(questions );
   }
   
   /*
    * put the sets into a map with the key z
    */
   public void map(Integer z,Set questions){
     test.put(z,questions);
     System.out.println(test.values());
     System.out.println(test.size());
   
   } 
   
   public void size (){
      System.out.println(test.size());
   }
   
   /**
    * Iterates over the map's keys to print
    * out a meaningful textual representation of the map's contents.
    */
   public void printMap()
   {
     for(Integer i : test.keySet())
     {
      //System.out.println("These are the keys: " + i);
      System.out.println(test.get(i));
      //System.out.println("last value in question 3: "+ test);
     } 
     
     
   }
   
    /**
    * Iterates over the map's keys to print
    * out a meaningful textual representation of the map's contents.
    */
   public void printMapValue(Integer x)
   {
     System.out.println("For the key "+ x + " the below has been found");
     System.out.println(test.get(x));
     //System.out.println("last value in question 3: "+ test);
     //System.out.println(test.containsKey(x));
   }
   
   /**
    * Takes a single argument representing a key in the map.
    * If the key given as the argument exists, deletes the key– value pair 
    * from the map, and returns true, otherwise returns false.
    */
   public void dEntry(Integer z)
   {
     //boolean b;
     test.remove(z);
     //System.out.println(b);
     
   }
   
   /**
    * Returns a collection of all the keys that have key below that entered.
    * particular selection criterion specified by one or more arguments.
    */
   public void selectKeys(Integer z)
   {
     for (int i=0; i<z; i++)
     {
        System.out.println(test.get(i));
     }
   }
   
   /**
    * Returns a collection of all the values that have the below caracteristicas.
    * particular selection criterion specified by one or more arguments.
    */
   public boolean selectValues(String z)
   {
         // this is not returning the values 
        System.out.println(test.containsValue(z));
        return true;
   }
   
   /**
    * Adds a new element to the collection of elements for a
    * particular key. You can assume that the key exists in the map.
    * Returns no value.
    */
   public void addValue(String z)
   {
        
   }
   
  
   
   
   
}
