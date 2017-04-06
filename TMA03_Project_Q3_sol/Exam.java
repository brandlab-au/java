import java.util.*;
/**
 * Class Exam - Simulates a downloadable exam.
 * This did not work out.
 * @Jonathon M250
 * @version 1
 */
public class Exam 
{
   /* instance variables */
   
   private Map <Integer, Set<String>> test ;       // runner's number
   int [] inputArray;
   /**
    * Constructor for objects of class Exam.
    */
   public Exam()
   {
      test = new HashMap<>();
 
    }

   
    
   /**
    * method to populate the map using class Question 
    */
   public void addData()
   {
      Set<String> questions = new TreeSet<>();
      questions.add("Which word in spanish means bird");
      questions.add("chica");
      questions.add("ave");
      questions.add("pes");
      questions.add("answer 3");
      test.put(1,questions);
      
      Set<String> questions1 = new TreeSet<>();
      questions1.add("Which word in spanish means tree");
      questions1.add("luz");
      questions1.add("planta");
      questions1.add("arbol");
      questions1.add("answer 3");
      test.put(2,questions1);
      
      Set<String> questions2 = new TreeSet<>();
      questions2.add("Which word in spanish means we learned");
      questions2.add("veamos");
      questions2.add("aprendimos");
      questions2.add("aprendamos");
      questions2.add("answer 2");
      test.put(3,questions2);
      

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
    * Argument is a key in the map
    * prints a meaningful textual representation of its associated value,
    * otherwise prints an output line announcing that the key is not found.
    */
   public void printMapValue(Integer key)
   {
     System.out.println("The key " + key+ " has not been found");
   }
   
   
   /**
    * Takes two arguments representing a key and a value
    * Adds the key and value to the map. 
    * If the key is already present the existing value is overwritten.
    * Returns no value.
    * Note that the map values are collections,
    * so the second argument must be of an appropriate collection type.
    */
   public void addMapEntry(Integer key, String q,String q1,String q2,
   String q3,String a)
   {
      Set<String> questions = new TreeSet<>();
      questions.add(q);
      questions.add(q1);
      questions.add(q2);
      questions.add(q3);
      questions.add(a);
      test.put(key,questions);
   }
    
  /**
    * Takes a single argument representing a key in the map.
    * 3 If the key given as the argument exists,
    * deletes the key– value pair from the map,
    * and returns true, otherwise returns false.
    */
   public void deleteEntry(Integer key)
   {
     test.remove(key);
   }
   
   /**
    * Returns a collection of all the keys that satisfy
    * some particular selection criterion specified by one or more arguments.
    */
   public void selectKeys(Integer i)
   {
      for(int v=0; v<i; v++){
         System.out.println(test.get(v));
      }
       
   }
   
   /**
    *Returns a collection of all the map values 
    *that satisfy some particular selection 
    *criterion specified by one or more arguments.
    */
   public void selectValues(Integer key)
   {
      
   }
   
   /**
    *Returns a new map of the same type but including
    *only the entries that satisfy some particular 
    *selection criterion specified by one or more arguments.
    */
   public void createReducedMap(Integer key)
   {
      
   }
   
   

}
