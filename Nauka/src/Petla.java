
public class Petla {

	public static void main(String[] args) {
		
		int[] tab=new int[10];
				
		int i=0;
		
		while (i < tab.length)
			
		{ 
		tab[i]=(i+1)*10;
		
		/* to nie dziala
		 * 
		 * tab[i]=tab[i]+10;
		 * 
		 * wynik:
		 * 10
		 * 10
		 * 10
		 * ...
		 * 10
		 * 
		 * 
		 */
		
		System.out.println(tab[i]);
		i++;
			
		}
		
	}

}
