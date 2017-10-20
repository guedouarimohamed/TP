package tp;

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
}

