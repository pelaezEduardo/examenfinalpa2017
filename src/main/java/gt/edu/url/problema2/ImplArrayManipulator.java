package gt.edu.url.problema2;

import problema2.List;

public class ImplArrayManipulator<E> {
	
	
	/**
	 * Algoritmo de heap
	 * @param n Cantidad de elementos
	 * @param any Array en el que se harán las permutaciones
	 */
	public void generate(int n, E[] any) {
		if (n == 1) {     
	    }
	    else{
	        for (int i = 0; i < n-1; i++) {
	            generate(n-1, any);
	            if (n != 0) {
	                E b = any[i];
	                any[i] = any[n-1];
	                any[n-1] = b;
	            }
	            else{
	                 E b = any[0];
	                 any[0] = any[n-1];
	                 any[n-1] = b;
	            }
	        }
	        generate(n-1, any);
	    }
	}
	




}
