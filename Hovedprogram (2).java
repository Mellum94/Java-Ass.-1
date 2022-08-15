import java.util.*;

//Part D, Hovedprogram with main method to test that classes work as they should. 

public class Hovedprogram{

	public static void main(String[] args) {
		Regneklynge abel = new Regneklynge(12);

		for(int i = 0;i<650;i++){
			abel.settInnNode(new Node(64, 1));
		}

		for (int i = 0; i<16;i++ ) {
			abel.settInnNode(new Node(1024, 2));
		}


		System.out.println(abel.noderMedNokMinne(32));
		System.out.println(abel.noderMedNokMinne(64));
		System.out.println(abel.noderMedNokMinne(128));
		System.out.println(abel.antProsessorer());
		System.out.println("Antall rack:"+abel.antallRacs());

	}
}


/*
Kjoreeksempel:

$ java Regneklynge
666
666
16
682
1x-193-157-183-84:Oblig vivianmellum$ 

*/

