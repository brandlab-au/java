import java.util.*;
/**
 * Abstract class ExamTest - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class ExamTest
{
   // instance variables - replace the example below with your own
   private int x;
   private Map <Integer, Set<ExamTest>> test ;
   Integer z = 1;
   /**
    * Nice
    */
   public abstract  void questionNumber ();
   
   public static void mapIt(){
      Questions aQuestion = new Questions(); 
      aQuestion.questionsForTest();
      //test = new HashMap<>();
      //test.put(z,aQuestion);
      
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
   
}
