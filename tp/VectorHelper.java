package tp;

import java.util.Scanner;

import TP.VectorHelper;

/**
 * Date : 22 / 10 / 2017
 * @author Guedouari_Chouia_G7
 * @version final
 * 
 * C'est la class VrctorHelper pour manipuler les vecteurs
 */
public class VectorHelper {
	 /**
		 * C'est un vecteur des entiers
		 */
		private int[] Vector;
		 
		 /**
		 * n indique la longueur du vecteur (le nombre des element)
		 */
		private int n;
		 
		 /**
		 * true si le tableau est initialise ,false sinon
		 */
		private boolean is_initialiser = false;
		
		 /**
		 * la valeur maximale du vecteur
		 */
		private int max;
		 /**
		 * la valeur minimal du vecteur
		 */
		private int min;
		 
		 /**
		 * c'est le constructeur (sans parametre)
		 */
		public VectorHelper() 
	     {
	       
	     }
		 /**
		  * C'est pour connaitre le nombre des element
		 * @return retourner n( la taolle du vecteur)
		 */
		public int get_n()
	     {
	         return n;
	     }
		 
		 /**
		  * pour affecter la longueur du vecteur dans n
		 * @param nb la valeur a affecté dans n
		 */
		public void set_n(int nb)
	     {
	         n = nb;
	     }
		 
		 /**
		  * pour savoir si le vecteur est initilisé
		 * @return retourner true si le vecteur est initilisé,false sinon
		 */
		public boolean get_is_initialiser() 
	     {
	         return is_initialiser;
	     }
		 /**
		  * pour savoir la valeur maximal
		 * @return retourner le max
		 */
		public int get_max(){return max;}
		
		 /**
		  * pour affecter la valeur maximal dans l'attribut max
		 * @param max la valeur a affecté dans max
		 */
		public void set(int max){this.max=max;}
		 
		 /**
		  * pour savoir la valeur minimal
		 * @return retourner le min
		 */
		public int get_min(){return min;}
		 /**
		  * affecter la valeur minimal dans l'attribut min
		 * @param min la valeur a affecté dans min
		 */
		public void set_min(int min){this.min=max;}
		 
		 /**
		 * la methode qui affiche le vecteur
		 */
		public void affiche_Vector()
	     {
	         System.out.print("les elelment du vecteur sont :");
	         for (int i = 0; i < n; i++)
	         {
	        	 System.out.print("   " + Vector[i]);
	         }

	         System.out.println();
	     }
		 
		 /**
		  * l'initialisation du vecteur  
		 * @param tab un qui vecteur qui contient les valeur a affecté dans le vecteur 
		 * @param n la taille du vecteur
		 */
		public void init_Vector(int tab[],int n)
	     {
			 this.n=n;
	         Vector = new int[n];
	         
	         for (int i = 0; i < n; i++)
	         {

	             Vector[i] = tab[i];
	         }
	         is_initialiser = true;
	     }
		/**
		  * 
		 * @return retourner le vecteur ou se trouvent les valeur
		 */
		public int[] get_Vector()
	     {
	         return Vector;
	     }
		
		/**
		  * l'initialisation du vecteur en saisant les valeur une par une 
		 */
		public void init_Vector2()
	    {
			 Scanner scanner = new Scanner(System.in);
			 System.out.print("Entrez la taille de vecteur: ");
		     n = scanner.nextInt();
	        Vector = new int[n];
	        
	        for (int i = 0; i < n; i++)
	        {
	        	System.out.print("V["+i+"]= ");
	            Vector[i] = scanner.nextInt();;
	        }
	        is_initialiser = true;
	    }
		
		/**
		 * une methode qui trie les elements du vecteur d'une maniere croissante
		 */
		public void tri_selection()
	     {int c;
	         if(is_initialiser==true)
	         {
	             for (int i = 0; i < n - 1; i++)
	             {
	               for (int j = i + 1; j < n; j++)
	               {
	                 if (Vector[j] < Vector[i])
	                 {
	                     c=Vector[i];
	                     Vector[i]=Vector[j];
	                     Vector[j]=c;
	                 }
	               }
	             }
	         }
	         else
	         {
	        	 System.out.println("le Vector n'est pas initialiser");
	         } 
	     }
		 
		 
		 /**
		  * addition de deux vecteurs
		 * @param V2 le vecteur a additioné avec V1
		 * @throws Exception une exception se genere si les vecteurs ont des tailles differentes
		 */
		public void add(VectorHelper V2) throws Exception
	     {
	         if (is_initialiser == true && V2.get_is_initialiser() == true)
	         {
	             if (n == V2.get_n())
	             {

	                 for (int i = 0; i < n; i++)
	                 {
	                     Vector[i] = Vector[i] + V2.get_Vector()[i];
	                 }

	             }
	             else
	             {
	                 throw new Exception("les longueurs de vecteurs ne sont pas egaux");

	             }
	         }
	         else
	         {
	        	 System.out.println("assurez que les deux vectors sont inisialisé");
	         }
	     }
		
		 /**
		 * une methde qui cherche la valeur maximal et la valeur minimal
		 */
		public void max_min()
	     {
	         if (is_initialiser == true)
	         {
	             max = Vector[0];
	             min = Vector[0];
	             for (int i = 1; i < n; i++)
	             {
	                 if (max < Vector[i])
	                 {
	                     max = Vector[i];
	                 }
	                 if (min > Vector[i])
	                 {
	                     min = Vector[i];
	                 }
	             }
	         }
	         else
	         {
	        	 System.out.println("le Vector n'est pas initialiser");
	         }
	     }

		 
}
/**
 * une methode pour inverser les elements du vecteur
 */
public void invers_Vector()
 {
     int a;
     if (is_initialiser == true)
     {
         for (int i = 0; i < n/2 ; i++)
         {
             a = Vector[n - 1 - i];
             Vector[n - 1 - i] = Vector[i];
             Vector[i] = a;
         }
     }
     else
     {
    	 System.out.println("le Vector n'est pas initialiser");
     }
 }

