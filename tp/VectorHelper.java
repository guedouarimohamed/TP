package tp;

import TP.VectorHelper;

/**
 * Date : 22 / 10 / 2017
 * @author Guedouari_Chouia
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
		  * 
		 * @return retourner le vecteur ou se trouvent les valeur
		 */
		public int[] get_Vector()
	     {
	         return Vector;
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
