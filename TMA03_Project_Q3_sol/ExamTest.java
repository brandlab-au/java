import java.util.*;
/**
 * Abstract class ExamTest - 
 * 
 * @author (Jon)
 * @version ()
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
      //System.out.println(test.get(i));
      //System.out.println("last value in question 3: "+ test);
     } 
   }
   
}
