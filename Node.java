/**
 * Rich Thomson
 * 4/19/2015
 * 
 * this class holds the information
 * for the nodes in the tree.
 */
public class Node 
{
   public String word;  // the word at each node
   public Node left, right;
   public int frequency;
   
   
   //constructor
   public Node ()
   {
       word=null;
       left = null;
       right = null;
       frequency =0;
   }
   //overloaded constructor
   public Node(String w) 
   { 
       word = w;
       left = null;
       right = null;
       //frequency = f;
   }
   //To string method
   
   public String toString()
   {
       return word + "has a frequency of " + frequency + "\nLeft Child: "+ left + 
       "\nRight Child: " + right +"\n";
   }
   
   
}