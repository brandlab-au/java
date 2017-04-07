import java.util.*;
/**
 * Write a description of class Test here.
 * 
 * @author (Jonathon) 
 * @version (3)
 */
public class TestQuestions
{
   // instance variables - 
   private String quest;
   private String poss1;
   private String poss2;
   private String poss3;
   private String anAnswer;
   private Set <String> a;
   /**
    * Constructor for objects of class TestQuestions
    */
   public TestQuestions()
   {
      // initialise instance variables
      
   }
   
   /**
    * Method Question 
    */
   public TestQuestions(String question, String poss1, String poss2, 
   String poss3,String answer)
   {
      a = new TreeSet <>();
      // initialise instance variables
      this.quest = question;
      this.poss1 = poss1;
      this.poss2 = poss2;
      this.poss3 = poss3;
      this.anAnswer = answer;
      
      a.add (question);
      a.add (poss1);
      a.add (poss2);
      a.add (poss3);
      a.add (answer);
   }

   public Set getSet(){
    return this.a; 
   }
}
