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
   public Set<String> question = new TreeSet<>();
   String q;
   String p1;
   String p2;
   String p3;
   String an;
   public Set<String> questions;
   public Set<String> questions1;
   public Set<String> questions2;
   /**
    * Constructor for objects of class Questions
    */
   public void Questions(String question, String poss1, String poss2, 
   String poss3,String answer)
   {
   this.q = question;
   this.p1 = poss1;
   this.p2 = poss2;
   this.p3 = poss3;
   this.an = answer;
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
   
    /**
     * Takes two arguments representing a key and a value.
     * Adds the key and value to the map. 
     * If the key is already present the existing value is overwritten.
     * Returns no value.
     * Note the method calles a map method in class Examtest .
     */
    public void addMapEntry(Integer z,String a,
    String b,String c,String d,String e)
   {
     Set<String> q = new TreeSet<>();
      q.add(a);
      q.add(b);
      q.add(c);
      q.add(d);
      q.add(e);
     map(z,q);
     System.out.println("This is the size of the map now "+ test.size());
     //System.out.println(test.containsKey(x));
   }
   
   public void deleteEntry(Integer v){
      // This doesn't work when I put boolean,
      //throws a stack overflow exception 
      // but does deleat key. 
      dEntry(v);
   }
    
  
}
