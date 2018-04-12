/**
 * Rich Thomson
 * 4/19/2015
 * 
 * This class adds objects to the tree
 * and it also searches for them.  When 
 * finished it will print out three list.
 */
public class BinarySearchTree 
{
   private Node root;
   
   // insert: if new entry, insert in tree
   public void insert(String w) 
   {
      if (root == null) 
      { // must handle case of empty tree first
         root = new Node(w);
         return;
      }
      
      Node place = root; // start search downward starting at the root
      while (true) 
      {
         if (w.compareTo(place.word) < 0) //check the left
         { 
            if (place.left != null)
            {
                place = place.left;
            }
            else 
            {
                place.left = new Node(w); 
            }
         }
         else if (w.compareTo(place.word) > 0) //check the right
         { 
            if (place.right != null)
            {
                place = place.right;
            }
            else 
            { place.right = new Node(w);
            }
         }
         else 
            break; // Node exist do not add
      }
   }
   
   //method for searching for a node
   public String search (String w)
   {
      
      Node place = root; // start search downward starting at the root
      while (true) 
      {
         if (w.compareTo(place.word) < 0) //check the left
         { 
            if (place.left != null)
            {
                place = place.left;
            }
            else 
            {
                System.out.println("The node does not exist");
                System.out.println();
                break;
            }
         }
         else if (w.compareTo(place.word) > 0) //check the right
         { 
            if (place.right != null)
            {
                place = place.right;
            }
            else 
            {
                System.out.println("The node does not exist");
                System.out.println();
                break;
            }
         }
         else 
         {
                System.out.println(place.word);
                System.out.println();
                return place.word;
         }
      }
      return null;
   }
   
   //Method for inorder
   
   public void printInOrder() 
   {
       System.out.println();
       System.out.println("This is the inorder list:");
       printInOrder(root); 
       System.out.println();
   }
   public void printInOrder(Node w) 
   {
      
      if (w != null) 
      {
         printInOrder(w.left);
         System.out.print(w.word + " ");
         printInOrder(w.right);
      }
   }
   //Method for preorder
   
   public void printPreOrder()
   {
       System.out.println();
       System.out.println("This is the preorder list:");
       printPreOrder(root);
       System.out.println();
   }
   public void printPreOrder(Node w)
   {
       if (w != null)
       {
           System.out.print(w.word +" ");
           printPreOrder(w.left);             
           printPreOrder(w.right);
       }
   }
     
   //Method for postorder
   
   public void printPostOrder()
   {
       System.out.println();
       System.out.println("This is the postorder list:");
       printPostOrder(root);
   }
   public void printPostOrder(Node w)
   {
       if (w != null)
       {
           printPostOrder(w.left);             
           printPostOrder(w.right);
           System.out.print(w.word +" ");
       }
   }     
}