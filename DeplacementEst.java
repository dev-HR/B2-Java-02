

public class DeplacementEst {

	public static void main(String[] args) {

		Pion [] pions = { 
				new Pion( "rouge" , 1 , 4 ) , 
				new Pion( "blanc" ) , 
				new Pion( "blanc" , 1 , 10 ) , 
				new Pion( "blanc" , 4 , 4 ) , 
				new Pion( "blanc" , 10 , 3 ) , 
				new Pion( "rouge" , 5 , 9 ) , 
				new Pion( "rouge" , 7 , 10) , 
				new Pion( "rouge" , 4 , 10)
		} ;
		
		// Votre code ici
		
		
		
		for( Pion unPion : pions ) {
			System.out.println( unPion.enChaine() ) ; 
		}

	}

}
