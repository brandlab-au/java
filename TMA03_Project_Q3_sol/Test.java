import java.util.*;
/**
 * Write a description of class Test here.
 * 
 * @author (Jonathon) 
 * @version (3)
 */
public class Test
{
   // instance variables - replace the example below with your own
   private Map <Integer,Set<TestQuestions>> results;
   
   /**
    * Constructor for objects of class Test with data 
    */
   public Test()
   {
      // initialise instance variables
      results = new HashMap <Integer,Set<TestQuestions>>();
      
      Set<String> questions = new TreeSet<>();
      questions.add("Which word in spanish means bird");
      questions.add("chica");
      questions.add("ave");
      questions.add("pes");
      questions.add("answer 3");
      
      Set<String> questions1 = new TreeSet<>();
      questions1.add("Which word in spanish means tree");
      questions1.add("luz");
      questions1.add("planta");
      questions1.add("arbol");
      questions1.add("answer 4");
      
      
      Set<String> questions2 = new TreeSet<>();
      questions2.add("Which word in spanish means we learned");
      questions2.add("veamos");
      questions2.add("aprendimos");
      questions2.add("aprendamos");
      questions2.add("answer 2");
      
      Set[] theArray = {questions,questions1,questions2};
      for (int i = 0; i<theArray.length ; i++)
         {
      
            results.put(i,theArray[i]);
        
            System.out.println(i);
         }
      
   }

   

}
