import ou.*;
import java.util.*;
/**
 * Write a description of class Questions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Questions extends ExamTest
{
   // instance variables - replace the example below with your own
   private int x;
   
   /**
    * Constructor for objects of class Questions
    */
   public Set Questions()
   {
     Set<String> questions = new TreeSet<>();
      questions.add("Which word in spanish means bird");
      questions.add("chica");
      questions.add("ave");
      questions.add("pes");
      questions.add("answer 3");
      //test.put(1,questions);
      
      Set<String> questions1 = new TreeSet<>();
      questions1.add("Which word in spanish means tree");
      questions1.add("luz");
      questions1.add("planta");
      questions1.add("arbol");
      questions1.add("answer 4");
      //test.put(2,questions1);
      
      Set<String> questions2 = new TreeSet<>();
      questions2.add("Which word in spanish means we learned");
      questions2.add("veamos");
      questions2.add("aprendimos");
      questions2.add("aprendamos");
      questions2.add("answer 2");
      //test.put(3,questions2);
      
      return questions;
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
      //ExamTest.printSet(questions);
      System.out.println(questions);
   }
}
