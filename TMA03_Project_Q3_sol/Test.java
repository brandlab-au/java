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
   
   /**
    * Iterates over the map's keys to print
    * out a meaningful textual representation of the map's contents.
    */
   public void printMap()
   {
     for(Integer i : results.keySet())
     {
      //System.out.println("These are the keys: " + i);
      System.out.println(results.get(i));
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
     System.out.println(results.get(x));
     //System.out.println("last value in question 3: "+ results);
     //System.out.println(results.containsKey(x));
   }
   
   
    /**
     * Takes two arguments representing a key and a value.
     * Adds the key and value to the map. 
     * If the key is already present the existing value is overwritten.
     * Returns no value.
     * Note the method calles a map method in class Examtest .
     */
    public void addMapEntry(Integer z,String question, String poss1, String poss2, 
   String poss3,String answer )
   {
     System.out.println("This is the size of the map now "+ results.size());
      //Set<TestQuestions> q = new TreeSet<>();
      //q.add(a);
      //q.add(b);
      //q.add(c);
      //q.add(d);
      //q.add(e);
      TestQuestions a = new TestQuestions(question,poss1,poss2, 
    poss3,answer);
      Set <TestQuestions> b = a.getSet();
     results.put(z,b);
     System.out.println("This is the size of the map now"+
     "after adding a new map entery "+ results.size());
     //System.out.println(test.containsKey(x));
   }
   
   /**
    * Takes a single argument representing a key in the map.
    * If the key given as the argument exists, deletes the key– value pair 
    * from the map, and returns true, otherwise returns false.
    */
   public void deleteEntry(Integer z)
   {
     //boolean b;
     results.remove(z);
     System.out.println("This is the size of the map now"+
     "after removing a map entery "+ results.size());
     
   }
   
   /**
    * Returns a collection of all the keys that satisfy
    * some particular selection criterion specified by one or more arguments.
    */
   public void selectKeys(Integer z)
   {
     //boolean b;
     results.remove(z);
     System.out.println("This is the size of the map now"+
     "after removing a map entery "+ results.size());
     
   }
   
   /**
    * Returns a collection of all the map values 
    * that satisfy some particular selection criterion specified by one or
    * more arguments.
    */
   public void selectValues(Integer z)
   {
     //boolean b;
     results.remove(z);
     System.out.println("This is the size of the map now"+
     "after removing a map entery "+ results.size());
     
   }
   
   /**
    * Adds a new element to the collection of elements 
    * for a particular key. 
    * You can assume that the key exists in the map. Returns no value.

    */
   public void addValue(Integer z)
   {
     //boolean b;
     results.remove(z);
     System.out.println("This is the size of the map now"+
     "after removing a map entery "+ results.size());
     
   }

   

   

}
