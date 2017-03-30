import ou.*;
import java.util.*;
/**
 *  Class Questions olds questions.
 * 
 * @author (Jon) 
 * @version ()
 */
public class Questions extends ExamTest
{
   // instance variables - 
   private int x;
   
   /**
    * Constructor for objects of class Questions
    */
   public void Questions()
   {
   
   }
   
   @Override 
   public void questionNumber (){
      //ExamTest.mapIt();
   }
   
   public void questionsForTest (){
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
      
         
            map(i,theArray[i]);
        
        System.out.println(i);
       }
      
      
   }
   
   public void print (Set q){
   //ExamTest.printSet();
   }
}
