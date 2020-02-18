import java.util.*;

public class Tienda {

	static Vector<Chocolate> chocolate;
	static Vector<Galleta> galletas;

	public static void main(String[] args) {
		
		Chocolate c1 = new Chocolate("Jet");
		Chocolate c2 = new Chocolate("Jumbo");
		Chocolate c3 = new Chocolate("Ferrero");
		
		Galleta g1 = new Galleta("Cocosette");
		Galleta g2 = new Galleta("Oreo");
		Galleta g3 = new Galleta("Saltin");
		
		chocolate = new Vector<Chocolate>(2,5);
		chocolate.add(c1);
		chocolate.addElement(c2);
		chocolate.add(0,c3);
		
		//System.out.println("Chocolates: " + chocolate.toString());
	
		
		galletas = new Vector<Galleta>();
		galletas.add(g1);
		galletas.add(g2);
		galletas.add(g3);

		/*
		//RECORRER VECTORES

		//manualmente
		for (int i = 0; i < galletas.size(); i++) {
			System.out.println(galletas.get(i));
		}



		//foreach
		for (Galleta g:galletas) {
			System.out.println(g);
		}


		Iterator <Chocolate> it = chocolate.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}


		//implementando enumeration
		Enumeration e = Collections.enumeration(chocolate);

		while(e.hasMoreElements() ) {
			System.out.println(e.nextElement());
		}
		*/

		
		//System.out.println("Galletas: " + galletas.toString());
		
		//METODOS DE TAMAÑO Y CAPACIDAD
		
		/*
		System.out.println("Cantidad de chocolates: " + chocolate.size());
		System.out.println("Capacidad de almacenimiento: " + chocolate.capacity());
		
		System.out.println("Cantidad de galletas: " + galletas.size());
		System.out.println("Capacidad de almacenimiento: " + galletas.capacity());
		 */
		//System.out.println(chocolate.elementAt(2));
		
		//chocolate.remove(1);
		//System.out.println("Chocolates: " + chocolate.toString());
		
		//galletas.clear();
		//System.out.println("Galletas: " + galletas.toString());
		
		
		
	}
	


}
